package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode216 {
  /*
   * Find all possible combinations of k numbers that add up to a number n, given
   * that only numbers from 1 to 9 can be used and each combination should be a
   * unique set of numbers.
   * 
   * Example 1:
   * Input: k = 3, n = 7
   * Output: [[1,2,4]]
   * 
   * Example 2:
   * Input: k = 3, n = 9
   * Output: [[1,2,6], [1,3,5], [2,3,4]]
   * 
   * https://leetcode.com/problems/combination-sum-iii/description/
   */
  public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> res = new ArrayList<>();
    csHelper(res, new ArrayList<>(), k, n, 1, 9);
    return res;
  }
  
  private void csHelper(List<List<Integer>> res, List<Integer> temp, int k, int n, int start, int end) {
    if(k < 0 || n < 0)
      return;
    if(k == 0) {
      if(n == 0)
        res.add(new ArrayList<>(temp));
      return;
    }
    for(int i = start; i <= end; i++) {
      temp.add(i);
      csHelper(res, temp, k-1, n-i, i+1, end);
      temp.remove(temp.size()-1);
    }
  }
}
