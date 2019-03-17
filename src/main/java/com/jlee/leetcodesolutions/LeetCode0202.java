package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode0202 {
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
    HashSet<Integer> set = new HashSet<>();
    int sum = 0;
    // If you try to add a number that you already performed a sum of the squared
    // digits, then it will infinitely loop
    while(set.add(n)) {
      sum = 0;
      while(n != 0) {
        // Sum the square of each digit
        int r = n % 10;
        sum += r * r;
        n /= 10;
      }
      
      if(sum == 1)
        return true;
      
      n = sum;
    }
    return false;
  }
}
