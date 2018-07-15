package com.jlee.leetcodesolutions;

public class LeetCode869 {
  /*
   * Starting with a positive integer N, we reorder the digits in any order
   * (including the original order) such that the leading digit is not zero.
   * 
   * Return true if and only if we can do this in a way such that the resulting
   * number is a power of 2.
   * 
   * https://leetcode.com/contest/weekly-contest-93/problems/reordered-power-of-2/
   */
  public boolean reorderedPowerOf2(int N) {
    String temp = convertDigitCount(N);
    
    // Check the count of N to every power of 2 <= 10^9
    for(int i = 1; i <= 1000000000; i = i * 2) {
      if(temp.equals(convertDigitCount(i)))
        return true;
    }
    return false;
  }
  
  public String convertDigitCount(int N) {
    // Count the frequency of each digit (0 - 9), return the count in String format
    String temp = Integer.toString(N);
    int[] count = new int[10];
    for(char ch : temp.toCharArray())
      count[Character.getNumericValue(ch)]++;
    return "" + count[0] + "-" + count[1] + "-" + count[2] + "-" + count[3] + "-" + count[4] + "-" + count[5] + "-"
        + count[6] + "-" + count[7] + "-" + count[8] + "-" + count[9];
  }
}
