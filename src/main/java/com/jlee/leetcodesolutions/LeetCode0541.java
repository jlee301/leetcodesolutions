package com.jlee.leetcodesolutions;

public class LeetCode0541 {
  /*
   * Given a string and an integer k, you need to reverse the first k characters
   * for every 2k characters counting from the start of the string. If there are
   * less than k characters left, reverse all of them. If there are less than 2k
   * but greater than or equal to k characters, then reverse the first k
   * characters and left the other as original.
   * 
   * Example:
   * Input: s = "abcdefg", k = 2
   * Output: "bacdfeg"
   * 
   * Restrictions:
   * 1. The string consists of lower English letters only.
   * 2.Length of the given string and k will in the range [1, 10000]
   * 
   * https://leetcode.com/problems/reverse-string-ii/description/
   */
  public String reverseStr(String s, int k) {
    char[] sData = s.toCharArray();
    for(int i = 0; i < sData.length; i += 2*k) {
      int left = i;
      int right = (left + k - 1 >= sData.length) ? sData.length - 1 : left + k - 1;
      while(left < right) {
        char temp = sData[left];
        sData[left] = sData[right];
        sData[right] = temp;
        left++;
        right--;
      }
    }
    return String.valueOf(sData);
  }
}
