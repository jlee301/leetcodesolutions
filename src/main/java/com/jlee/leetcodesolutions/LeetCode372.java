package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode372 {
  /*
   * Your task is to calculate ab mod 1337 where a is a positive integer and b is
   * an extremely large positive integer given in the form of an array.
   * 
   * Example1:
   * a = 2 b = [3]
   * Result: 8 
   * 
   * Example2:
   * a = 2 b = [1,0]
   * Result: 1024
   * 
   * https://leetcode.com/problems/super-pow/description/
   */
  private static final int LEET = 1337;

  public int superPow(int a, int[] b) {
    //
    // a^123 % k  ==  (a^120 % k) * (a^3 % k)) % k
    //            ==  ( ((a^12 % k)^10 % k) * (a^3 % k) ) % k
    //
    if(b == null || b.length == 0)
      return 1;
    
    int last = b[b.length-1];
    b = Arrays.copyOf(b, b.length-1);
    return (powHelper(superPow(a, b), 10) * powHelper(a, last)) % LEET;
  }
  
  private int powHelper(int a, int k) {
    //
    // (a * b) % k  ==  ( (a % k) * (b % k) ) % k
    //
    a = a % LEET;
    int result = 1;
    for(int i = 0; i < k; i++)
      result = (result * a) % LEET;
    return result;
  }
}
