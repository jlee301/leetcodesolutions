package com.jlee.leetcodesolutions;

public class LeetCode443 {
  /*
   * Given an array of characters, compress it in-place.
   * 
   * The length after compression must always be smaller than or equal to the
   * original array.
   * 
   * Every element of the array should be a character (not int) of length 1.
   * 
   * After you are done modifying the input array in-place, return the new length
   * of the array.
   * 
   * Follow up: Could you solve it using only O(1) extra space?
   * 
   * Example 1: 
   * Input: ["a","a","b","b","c","c","c"]
   * Output: Return 6, and the first 6 characters of the input array should be:
   * ["a","2","b","2","c","3"]
   * 
   * Example 2: 
   * Input: ["a"]
   * Output: Return 1, and the first 1 characters of the input array should be:
   * ["a"]
   * 
   * Example 3: 
   * Input: ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
   * Output: Return 4, and the first 4 characters of the input array should be:
   * ["a","b","1","2"].
   * 
   * https://leetcode.com/problems/string-compression/description/
   */
  public int compress(char[] chars) {
    if(chars == null)
      return 0;

    int write = 0;
    int compareChar = 0;
    for(int read = 0; read < chars.length; read++) {
      if(read + 1 == chars.length || chars[read + 1] != chars[read]) {
        chars[write] = chars[compareChar];
        write = write + 1;
        if(read > compareChar) {
          // frequency = read pointer - compareChar pointer + 1 (at least 1)
          String count = Integer.toString(read - compareChar + 1);
          for(int i = 0; i < count.length(); i++) {
            chars[write] = count.charAt(i);
            write = write + 1;
          }
        }
        // Move pointer to next starting character
        compareChar = read + 1;
      }  
    }
    return write;
  }
}
