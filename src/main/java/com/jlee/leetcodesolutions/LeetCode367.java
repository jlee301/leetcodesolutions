package com.jlee.leetcodesolutions;

public class LeetCode367 {
  /*
   * Given a positive integer num, write a function which returns True if num is a
   * perfect square else False.
   * 
   * Note: 
   * Do not use any built-in library function such as sqrt.
   * 
   * Example 1:
   * Input: 16 
   * Returns: True 
   * 
   * Example 2:
   * Input: 14 
   * Returns: False
   * 
   * https://leetcode.com/problems/valid-perfect-square/description/
   */
  public boolean isPerfectSquare(int num) {
    if(num <= 0)
      return false;
    
    int result = 0;
    for(int i = 1; result < num; i++) {
      result = i * i;
    }
    return result == num;
  }

  public boolean isPerfectSquareBinary(int num) {
    if(num <= 0)
      return false;
    
    int low = 1;
    int high = num;
    int result = 0;
    
    while(low <= high) {
      int mid = low + ((high - low) / 2);
      result = mid * mid;
      if(result < num)
        low = mid + 1;
      else if (result > num)
        high = mid - 1;
      else
        break;
    }
    return result == num;
  }
}
