package com.jlee.leetcodesolutions;

public class LeetCode028 {

  /*
   * Return the index of the first occurrence of needle in haystack, or -1 if
   * needle is not part of haystack.
   * 
   * Input: haystack = "hello", needle = "ll" 
   * Output: 2
   * 
   * Input: haystack = "aaaaa", needle = "bba" 
   * Output: -1
   * 
   * https://leetcode.com/problems/implement-strstr/description/
   */

  /*
   * This was my original solution, but I assumed the idea was to build an
   * indexOf() function.
   */
  public int strStr(String haystack, String needle) {
    int result = haystack.indexOf(needle);
    return result;
  }

  public int strStrNotUsingIndexOf(String haystack, String needle) {
    int length = 0;
    int result = -1;

    if (haystack == null || needle == null) {
      return result;
    }

    for (int j = 0; j < haystack.length(); j++) {
      // System.out.println("length: " + length);
      // System.out.println("j: " + j);
      if (needle.charAt(length) == haystack.charAt(j)) {
        length++;
        if (length == needle.length()) {
          // This indicates the pattern has been found.
          // Because j pointer is sitting on the index
          // of last character matched, you add 1 then
          // subtract by the needle length.
          result = j + 1 - needle.length();
          break;
        }
      } else {
        // Move j pointer - length. If length > 0 you are
        // rechecking for pattern recognition ie baab, ab.
        // Reset length because no pattern match found yet.
        j = j - length;
        length = 0;
      }
    }
    return result;
  }

  /*
   * Much easier solution provided in LeetCode discussion
   */
  public int strStrThree(String haystack, String needle) {
    for (int i = 0;; i++) {
      for (int j = 0;; j++) {
        if (j == needle.length())
          return i;
        if (i + j == haystack.length())
          return -1;
        if (needle.charAt(j) != haystack.charAt(i + j))
          break;
      }
    }
  }
}
