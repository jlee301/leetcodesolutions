package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0842 {
  /*
   * Given a string S of digits, such as S = "123456579", we can split it into a
   * Fibonacci-like sequence [123, 456, 579].
   * 
   * Formally, a Fibonacci-like sequence is a list F of non-negative integers such
   * that:
   * 1. 0 <= F[i] <= 2^31 - 1, (that is, each integer fits a 32-bit signed integer
   * type);
   * 2. F.length >= 3;
   * 3. and F[i] + F[i+1] = F[i+2] for all 0 <= i < F.length - 2.
   * 
   * Also, note that when splitting the string into pieces, each piece must not
   * have extra leading zeroes, except if the piece is the number 0 itself.
   * 
   * Return any Fibonacci-like sequence split from S, or return [] if it cannot be
   * done.
   * 
   * https://leetcode.com/problems/split-array-into-fibonacci-sequence/description/
   */
  public List<Integer> splitIntoFibonacci(String S) {
    int N = S.length();
    // Generate all possible first and second numbers
    for(int i = 0; i < N; i++) {
      List<Integer> list = new ArrayList<>();
      
      // Cannot start with a leading zero or beyond MAX
      if(i > 0 && S.charAt(0) == '0') continue;
      long first = Long.valueOf(S.substring(0, i+1));
      if(first > Integer.MAX_VALUE) break;
      
      for(int j = i+1; j < N; j++) {
        list.clear();
        
        // Cannot start with a leading zero or beyond MAX
        if(j > i+1 && S.charAt(i+1) == '0') continue;
        long second = Long.valueOf(S.substring(i+1, j+1));
        if(second > Integer.MAX_VALUE) break; 
        
        list.add((int) first);
        list.add((int) second);
        
        int k = j+1;
        if(isFib(S, list, k, N))
          return list;        
      }
    }
    return new ArrayList<>();
  }
  
  private boolean isFib(String S, List<Integer> list, int k, int N) {
    if(k == N && list.size() > 2)
      return true;
    
    long next = (long) list.get(list.size()-1) + (long) list.get(list.size()-2);
    String Snext = String.valueOf(next);
    // Checking to see if next number in the sequence meets requirements
    if(next <= Integer.MAX_VALUE && S.substring(k).startsWith(Snext)){
      list.add((int) next);
      k += Snext.length();
      return isFib(S, list, k, N);
    }
    return false;
  }
}
