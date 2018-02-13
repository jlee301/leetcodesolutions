package com.jlee.leetcodesolutions;

public class LeetCode096 {
  /*
   * Given n, how many structurally unique BST's (binary search trees) that store
   * values 1...n?
   * 
   * For example, Given n = 3, there are a total of 5 unique BST's.
   * 
   * https://leetcode.com/problems/unique-binary-search-trees/description/
   */
  public int numTrees(int n) {
    if(n <= 1)
      return 1;
    
    int[] data = new int[n+1];
    data[0] = 1;
    data[1] = 1;
    
    /*
     * n=2 [1,2], data[2]
     *         1                   1
     *          \                 /
     *           2               2
     *  data[0]*data[1]  +  data[1]*data[0] = data[2]
     *  
     * n=3 [1,2,3], data[3]
     *         1                   2                   3
     *          \                 / \                 /
     *          2,3              1   3              1,2
     *  data[0]*data[2]  +  data[1]*data[1]  +  data[2]*data[0] = data[3]
     */
    for(int i = 2; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        data[i] += data[j-1] * data[i-j];
      }
    }
    return data[n];
  }
}
