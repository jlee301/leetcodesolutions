package com.jlee.leetcodesolutions;

public class LeetCode0537 {
  /*
   * Given two strings representing two complex numbers.
   * 
   * You need to return a string representing their multiplication. Note i^2 = -1
   * according to the definition.
   * 
   * Example 1:
   * Input: "1+1i", "1+1i"
   * Output: "0+2i"
   * Explanation: (1 + i) * (1 + i) = 1 + i^2 + 2 * i = 2i, and you need convert it
   * to the form of 0+2i.
   * 
   * Example 2:
   * Input: "1+-1i", "1+-1i"
   * Output: "0+-2i"
   * Explanation: (1 - i) * (1 - i) = 1 + i^2 - 2 * i = -2i, and you need convert
   * it to the form of 0+-2i.
   * 
   * Note:
   * 1. The input strings will not have extra blank.
   * 2. The input strings will be given in the form of a+bi, where the integer a
   * and b will both belong to the range of [-100, 100]. And the output should be
   * also in this form.
   * 
   * https://leetcode.com/problems/complex-number-multiplication/description/
   */
  public String complexNumberMultiply(String a, String b) {
    int[] data = new int[3];
    // data[0] = sum of num
    // data[1] = sum of i^2
    // data[2] = sum of i
    int[] aTokens = convertToIntArray(a.split("\\+"));
    int[] bTokens = convertToIntArray(b.split("\\+"));
    data[0] += aTokens[0] * bTokens[0];
    data[2] += aTokens[0] * bTokens[1];
    data[2] += aTokens[1] * bTokens[0];
    data[1] += -(aTokens[1] * bTokens[1]);
    return (data[0]+data[1]) + "+" + data[2] + "i";
  }
  
  private int[] convertToIntArray(String[] tokens) {
    int[] data = new int[2];
    data[0] = Integer.valueOf(tokens[0]);
    data[1] = Integer.valueOf(tokens[1].split("i")[0]);
    return data;
  }
}
