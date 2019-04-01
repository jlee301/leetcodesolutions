package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode1012 {
  /*
   * https://leetcode.com/problems/numbers-with-repeated-digits/
   */
  public int numDupDigitsAtMostN(int N) {
    // Find the count of non-repeating digits <= N
    int count = 0;

    List<Integer> list = new ArrayList<>();
    int NplusOne = N + 1;
    while(NplusOne > 0) {
      list.add(0, NplusOne % 10);
      NplusOne /= 10;
    }
    
    // 20 -> count of non-repeating digits from 0 - 9
    // 200 -> count of non-repeating digits from 0 - 99
    // 350 -> count of non-repeating digits from 0 - 99
    // 1000 -> count of non-repeating digits from 0 - 999
    // 3500 -> count of non-repeating digits from 0 - 999
    for(int i = 0; i < list.size()-1; i++)
      count += 9 * perm(9, i);
    
    // System.out.println(count);
    
    // example, if N = 350 we must find the count of non-repeating digits from 100 - 350
    // 3XX --> perm(9, 2)
    // X5X --> perm(8, 1)
    // XX1 --> perm(7, 0)
    HashSet<Integer> visited = new HashSet<>();
    for(int i = 0; i < list.size(); i++) {
      int d = list.get(i);      
      for(int j = (i == 0) ? 1 : 0; j < d; j++) {
        // Leading digit cannot be zero
        // If we already used the digit, we skip to avoid double counting
        // 0XX --> perm(9, 2) --> skipped
        // 1XX --> perm(9, 2)
        // 2XX --> perm(9, 2)
        // X0X --> perm(8, 1)
        // X1X --> perm(8, 1)
        // X2X --> perm(8, 1)
        // X3X --> perm(8, 1) --> skipped
        // X4X --> perm(8, 1)
        // XX0 --> perm(7, 0)
        if(visited.contains(j))
          continue;
        
        count += perm(9-i, list.size()-i-1);
      }
      
      // If the digit has already been checked, there is no reason to keep checking, ie 110
      if(!visited.add(d))
        break;
    }
    // System.out.println(count);
    return N - count;
  }
  
  // P(n,r) = n! / (n-r)!
  private int perm(int numOfDigits, int numOfVary) {
    int total = 1;
    for(int i = numOfDigits; i > numOfDigits - numOfVary; i--)
      total *= i;
    
    return total;
  }
}
