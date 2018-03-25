package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode394 {
  /*
   * Given an encoded string, return it's decoded string.
   * 
   * The encoding rule is: k[encoded_string], where the encoded_string inside the
   * square brackets is being repeated exactly k times. Note that k is guaranteed
   * to be a positive integer.
   * 
   * You may assume that the input string is always valid; No extra white spaces,
   * square brackets are well-formed, etc.
   * 
   * Furthermore, you may assume that the original data does not contain any
   * digits and that digits are only for those repeat numbers, k. For example,
   * there won't be input like 3a or 2[4].
   * 
   * Examples:
   * s = "3[a]2[bc]", return "aaabcbc".
   * s = "3[a2[c]]", return "accaccacc".
   * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
   * 
   * https://leetcode.com/problems/decode-string/description/
   */
  public String decodeString(String s) {
    if(s == null || s.isEmpty())
      return "";
    Stack<Integer> repeats = new Stack<>();
    Stack<String> words = new Stack<>();
    String result = "";
    
    int index = 0;
    while(index < s.length()) {
      if(Character.isDigit(s.charAt(index))) {
        // If a digit, keep looping until we get the whole digit
        int repeat = 0;
        while(Character.isDigit(s.charAt(index))) {
          repeat = 10*repeat + Character.getNumericValue(s.charAt(index));
          index++;
        }
        repeats.add(repeat);

      } else if(s.charAt(index) == '[') {
        // Store current result and clear
        words.add(result);
        result = "";
        index++;
      
      } else if(s.charAt(index) == ']') {
        // Append current result k repeated times to the last word stored
        String last = words.pop();
        int repeat = repeats.pop();
        for(int i = 0; i < repeat; i++)
          last = last + result;
        result = last;
        index++;
      
      } else {
        result = result + s.charAt(index);
        index++;
      }
    }
    return result;
  }
}
