package com.jlee.leetcodesolutions;

public class LeetCode202 {
  /*
   * Write an algorithm to determine if a number is "happy".
   * 
   * A happy number is a number defined by the following process: Starting with
   * any positive integer, replace the number by the sum of the squares of its
   * digits, and repeat the process until the number equals 1 (where it will
   * stay), or it loops endlessly in a cycle which does not include 1. Those
   * numbers for which this process ends in 1 are happy numbers.
   * 
   * Example: 19 is a happy number
   * 1^2 + 9^2 = 82 
   * 8^2 + 2^2 = 68 
   * 6^2 + 8^2 = 100 
   * 1^2 + 0^2 + 0^2 = 1
   * 
   * 1 - happy
   * 7 - happy
   * 10 - happy
   * 13 - happy
   * 19 - happy
   * 
   * https://leetcode.com/problems/happy-number/description/
   */
  public boolean isHappy(int n) {
    boolean result = false;
    if(n < 0)
      return result;
    
    int oneStep = n;
    int twoStep = n;
    
    do {
      oneStep = squareSum(oneStep);
      if(oneStep == 1) {
        result = true;
        return result;
      }
      // This is twoStep because you are doing it twice
      // If twoStep catches up to oneStep before completion (equals 1), it means a
      // cycle is detected.
      twoStep = squareSum(twoStep);
      twoStep = squareSum(twoStep);
    } while (oneStep != twoStep);
    
    return result;
  }
  
  public int squareSum(int n) {
    int sum = 0;
    while(n > 0) {
      int rightDigit = n % 10;
      sum = sum + (rightDigit * rightDigit);
      n = n / 10;
    }
    return sum;
  }
}
