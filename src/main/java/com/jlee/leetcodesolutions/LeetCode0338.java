package com.jlee.leetcodesolutions;

public class LeetCode0338 {
  /*
   * Given a non negative integer number num. For every numbers i in the range 0 ≤
   * i ≤ num calculate the number of 1's in their binary representation and return
   * them as an array.
   * 
   * Example: 
   * For num = 5 you should return [0,1,1,2,1,2].
   * 
   * Follow up:
   * 1. It is very easy to come up with a solution with run time
   * O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a
   * single pass?
   * 2. Space complexity should be O(n).
   * 3. Can you do it like a boss? Do it without using any builtin function like
   * __builtin_popcount in c++ or in any other language.
   * 
   * https://leetcode.com/problems/counting-bits/description/
   */
  public int[] countBits(int num) {
    int[] result = new int[num+1];
    for(int i = 0; i <= num; i++) {
      int bitCount = 0;
      int n = i;
      while(n > 0) {
        if((n & 1) == 1)
          bitCount++;
        n >>= 1;
        // Keep shifting bits to the right until zero.
      }
      result[i] = bitCount;
    }
    return result;
  }
}
