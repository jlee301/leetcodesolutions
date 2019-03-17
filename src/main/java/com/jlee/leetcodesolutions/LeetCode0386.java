package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0386 {
  /*
   * Given an integer n, return 1 - n in lexicographical order.
   * 
   * For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].
   * 
   * Please optimize your algorithm to use less time and space. The input size may
   * be as large as 5,000,000.
   * 
   * https://leetcode.com/problems/lexicographical-numbers/description/
   */
  public List<Integer> lexicalOrder(int n) {
    List<Integer> result = new ArrayList<>();
    for(int i = 1; i <= 9; i++)
      lexicalHelper(result, i, n);
    return result;
  }
  
  /*
   * Imagine preorder traversal tree
   *     1        2        3
   *    / \      / \      / \
   *   10-19    20-29    30-39
   *  /  \
   * 100-109
   */
  private void lexicalHelper(List<Integer> result, int curr, int n) {
    if(curr > n)
      return;
    
    result.add(curr);
    // System.out.println(result);
    for(int i = 0; i <= 9; i++) {
      if(10*curr+i > n) 
        break;
      lexicalHelper(result, 10*curr+i, n);
    }
  }
}
