package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode0898 {
  /*
   * We have an array A of non-negative integers.
   * 
   * For every (contiguous) subarray B = [A[i], A[i+1], ..., A[j]] (with i <= j),
   * we take the bitwise OR of all the elements in B, obtaining a result A[i] |
   * A[i+1] | ... | A[j].
   * 
   * Return the number of possible results. (Results that occur more than once are
   * only counted once in the final answer.)
   * 
   * https://leetcode.com/problems/bitwise-ors-of-subarrays/description/
   */
  public int subarrayBitwiseORs(int[] A) {
    HashSet<Integer> ans = new HashSet<>();
    HashSet<Integer> tmp1 = new HashSet<>();
    for(int x : A) {
      HashSet<Integer> tmp2 = new HashSet<>();
      tmp2.add(x);
      
      // Now OR x with every contiguous combination with x at the end
      // ie {1,2,x} --> {1|2|x}, {2|x}, {x}
      //
      // A = {1,2,4}
      // x = 4
      // tmp1 = { [2]=2, [1|2]=3 }
      // tmp2 = { 4=4, 4|[2]=6, 4|[1|2]=7 }
      //  ans = { [1]=1, [2]=2, [1|2]=3, [4]=4, [2|4]=6, [1|2|4]=7 }
      for(int y : tmp1) {
        tmp2.add(x | y);
      }
      ans.addAll(tmp2);
      tmp1 = tmp2;
    }
    return ans.size();
  }
}
