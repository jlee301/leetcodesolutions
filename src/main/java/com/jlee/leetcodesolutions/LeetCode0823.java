package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode0823 {
  /*
   * Given an array of unique integers, each integer is strictly greater than 1.
   * 
   * We make a binary tree using these integers and each number may be used for
   * any number of times.
   * 
   * Each non-leaf node's value should be equal to the product of the values of
   * it's children.
   * 
   * How many binary trees can we make? Return the answer modulo 10^9 + 7.
   * 
   * Example 1:
   * Input: A = [2, 4]
   * Output: 3
   * Explanation: We can make these trees: [2], [4], [4, 2, 2]
   * 
   * Example 2:
   * Input: A = [2, 4, 5, 10]
   * Output: 7
   * Explanation: We can make these trees: [2], [4], [5], [10], [4, 2, 2], [10, 2,
   * 5], [10, 5, 2].
   * 
   * 
   * Note:
   * 1. 1 <= A.length <= 1000.
   * 2. 2 <= A[i] <= 10 ^ 9.
   * 
   * https://leetcode.com/problems/binary-trees-with-factors/description/
   */
  public int numFactoredBinaryTrees(int[] A) {
    int MOD = 1000000007;
    Arrays.sort(A);
    int len = A.length;

    // Map A[i] to index position
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i < len; i++)
      map.put(A[i], i);
    
    // memo[i] = The number of binary trees for A[i]
    // Every A[i] has at least 1 tree (itself)
    long[] memo = new long[len];
    Arrays.fill(memo, 1);
    
    // Calculate the number of binary trees per A[i]
    for(int i = 0; i < len; i++) {
      for(int j = 0; j < len; j++) {
        // Find two elements that are the product of A[i]
        if(A[i] % A[j] == 0) {
          int temp = A[i] / A[j];
          // Check to see if temp is an available element
          if(map.containsKey(temp))
            memo[i] = (memo[i] + memo[j] * memo[map.get(temp)]) % MOD;
        }
      }
    }
    
    // Sum of the values of memo[0] to memo[len-1]
    long sum = 0;
    for(long num : memo)
      sum += num;
    return (int) (sum % MOD);
  }
}
