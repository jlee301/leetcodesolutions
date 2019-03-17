package com.jlee.leetcodesolutions;

public class LeetCode0670 {
  /*
   * Given a non-negative integer, you could swap two digits at most once to get
   * the maximum valued number. Return the maximum valued number you could get.
   * 
   * Example 1:
   * Input: 2736
   * Output: 7236
   * Explanation: Swap the number 2 and the number 7.
   * 
   * Example 2:
   * Input: 9973
   * Output: 9973
   * Explanation: No swap.
   * 
   * Note: The given number is in the range [0, 108]
   * 
   * https://leetcode.com/problems/maximum-swap/description/
   */
  public int maximumSwap(int num) {
    char[] data = ("" + num).toCharArray();
    int i = 0, pos = 0;
    char temp = 0;
    outerloop: 
      for(; i < data.length - 1; i++) {
        temp = data[i];
        for(int j = i + 1; j < data.length; j++) {
          // Find the greatest number at greatest distance
          if(data[i] < data[j] && temp <= data[j]) {
            temp = data[j];
            pos = j;
          }
          
          // If I have a pos set, then no need to look any further.
          if(j == data.length-1 && pos != 0)
            break outerloop;
        }
      }
    
    if(pos != 0) {
      // Swap data[i] and data[pos]
      data[pos] = data[i];
      data[i] = temp;
      
      // Convert to integer
      StringBuilder sb = new StringBuilder();
      for(char ch : data)
        sb.append(ch);
      return Integer.valueOf(sb.toString());
    }
    else
      // Nothing to swap, just returning num
      return num;
  }
}
