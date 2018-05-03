package com.jlee.leetcodesolutions;

public class LeetCode738 {
  /*
   * Given a non-negative integer N, find the largest number that is less than or
   * equal to N with monotone increasing digits.
   * 
   * (Recall that an integer has monotone increasing digits if and only if each
   * pair of adjacent digits x and y satisfy x <= y.)
   * 
   * https://leetcode.com/problems/monotone-increasing-digits/description/
   */
  public int monotoneIncreasingDigits(int N) {
    char[] data = Integer.toString(N).toCharArray();

    // Scan left to right to find first decreasing pair
    int i = 1;
    while(i < data.length && data[i-1] <= data[i]) i++;
    // if i == data.length, it means N is already monotone increasing
    if(i == data.length) return N;
    
    // Now scan right to left to decrement the lead number data[i-1] when it is
    // greater than data[i] because we are changing data[i] to '9'.
    while(i > 0 && data[i-1] > data[i]) {
      data[i-1]--;
      i--;
    }
    for(int j = i + 1; j < data.length; j++)
      data[j] = '9';
    return Integer.valueOf(String.valueOf(data));
  }
}
