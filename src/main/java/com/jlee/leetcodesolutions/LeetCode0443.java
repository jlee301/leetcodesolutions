package com.jlee.leetcodesolutions;

public class LeetCode0443 {
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
    char prev = 0;
    int count = 1;
    int writeIdx = 0;
    for(int i = 0; i < chars.length; i++) {
      if(prev == 0) {
        prev = chars[i];
        writeIdx = i+1;
      }
      else if(prev == chars[i]) {
        count++;
      }
      else {
        // Different character than prev
        if(count > 1) {
          // Write the count
          String countStr = String.valueOf(count);
          for(int j = 0; j < countStr.length(); j++)
            chars[writeIdx++] = countStr.charAt(j);
        }
        // Write next char
        chars[writeIdx++] = chars[i];
        prev = chars[i];
        count = 1;
      }
    }
    // If loop ends before writing the count
    if(count > 1) {
      String countStr = String.valueOf(count);
      for(int j = 0; j < countStr.length(); j++)
        chars[writeIdx++] = countStr.charAt(j);      
    }
    return writeIdx;
  }
}
