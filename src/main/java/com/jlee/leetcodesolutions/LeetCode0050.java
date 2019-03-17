package com.jlee.leetcodesolutions;

public class LeetCode0050 {
  /*
   * Implement pow(x, n).
   * 
   * Example 1:
   * Input: 2.00000, 10 
   * Output: 1024.00000 
   * 
   * Example 2:
   * Input: 2.10000, 3 
   * Output: 9.26100
   */
  public double myPow(double x, int n) {
    double result = 1.0;
    long N = n;
    if(n < 0) {
      N = -N;
      while(N-- > 0)
        result /= x;
    } else {
      while(N-- > 0)
        result *= x;
    }
    return result;
  }
  
  public double myPowBetter(double x, int n) {
    long N = n;
    if(n < 0) {
      N = -N;
      x = 1 / x;
    }
    
    double result = 1.0, product = x;
    while(N > 0) {
      if(N % 2 == 1)
        result = result * product;
      
      product = product * product;
      
      N = N / 2;
    }
    return result;
  }
}
