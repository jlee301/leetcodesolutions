package com.jlee.leetcodesolutions;

import java.util.ArrayList;

public class LeetCode500 {
  /*
   * Given a List of words, return the words that can be typed using letters of
   * alphabet on only one row's of American keyboard like the image below.
   * 
   * Example 1: 
   * Input: ["Hello", "Alaska", "Dad", "Peace"] 
   * Output: ["Alaska","Dad"]
   * 
   * Note:
   * You may use one character in the keyboard more than once. You may assume the
   * input string will only contain letters of alphabet.
   * 
   * https://leetcode.com/problems/keyboard-row/description/
   */
  public String[] findWords(String[] words) {
    if(words == null || words.length == 0)
      return new String[] {};
    
    // Alphabet map for row indication
    int[] alphaMap = {1,2,2,1,0,1,1,1,0,1,1,1,2,2,0,0,0,0,1,0,0,2,0,2,0,2};
    ArrayList<String> list = new ArrayList<String>();
    
    for(int i = 0; i < words.length; i++) {
      String temp = words[i].toLowerCase().trim();
      if(temp.length() == 0) {
        // If word is empty, add
        list.add(temp);
      } else {
        int prev = alphaMap[temp.charAt(0) - 'a'];
        for(int j = 0; j < temp.length(); j++) {
          if(j == temp.length() - 1 && prev == alphaMap[temp.charAt(j) - 'a']) {
            // When at last character and it matches the same row still
            list.add(words[i]);
          } else if (prev != alphaMap[temp.charAt(j) - 'a']) {
            // Any time on a different row, break out of loop.
            break;
          }
        }
      }
    }
    String[] result = new String[list.size()];
    for(int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }
    return result;
  }
}
