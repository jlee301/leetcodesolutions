package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode1012 {
  /*
   * https://leetcode.com/contest/weekly-contest-128/problems/complement-of-base-10-integer/
   */
  public int bitwiseComplement(int N) {
    if(N == 0)
      return 1;
    
    // "1010"  --> "0101"
    Stack<Integer> stack = new Stack<>();
    while(N > 0) {
      if((N & 1) == 0)
        stack.add(1);
      else
        stack.add(0);
      
      N >>= 1;
    }
    
    int comp = 0;
    while(!stack.isEmpty()) {
      comp <<= 1;
      int curr = stack.pop();
      if(curr == 1)
        comp |= 1;
    }
    return comp;
  }
}
