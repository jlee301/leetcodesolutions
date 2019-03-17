package com.jlee.leetcodesolutions;

public class LeetCode0263 {
  /*
   * Write a program to check whether a given number is an ugly number.
   * 
   * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
   * For example, 6, 8 are ugly while 14 is not ugly since it includes another
   * prime factor 7.
   * 
   * Note that 1 is typically treated as an ugly number.
   * 
   * https://leetcode.com/problems/ugly-number/description/
   */
  public boolean isUgly(int num) {
    // Only positive numbers
    if(num < 1)
      return false;
    
    // Prime factorization of just 2, 3, 5
    while(num % 2 == 0)
      num /= 2;
    while(num % 3 == 0)
      num /= 3;
    while(num % 5 == 0)
      num /= 5;
    
    return num == 1;
  }
}
