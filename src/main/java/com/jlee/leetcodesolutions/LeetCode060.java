package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode060 {
  /*
   * The set [1,2,3,…,n] contains a total of n! unique permutations.
   * 
   * By listing and labeling all of the permutations in order, We get the
   * following sequence (ie, for n = 3):
   * 1. "123" 
   * 2. "132" 
   * 3. "213" 
   * 4. "231" 
   * 5. "312" 
   * 6. "321"
   * 
   * Given n and k, return the kth permutation sequence.
   * 
   * Note: Given n will be between 1 and 9 inclusive.
   * 
   * https://leetcode.com/problems/permutation-sequence/description/
   */
  private List<List<Integer>> result;
  
  public String getPermutation(int n, int k) {
    result = new ArrayList<>();
    int[] nums = new int[n];
    for(int i = 0; i < n; i++)
      nums[i] = i + 1;
    
    helper(new ArrayList<>(), nums, k);
    StringBuilder sb = new StringBuilder();
    for(int num : result.get(result.size()-1))
      sb.append(num);

    return sb.toString();
  }
  
  private void helper(List<Integer> temp, int[] nums, int k) {
    if(result.size() == k)
      return;
    else if(temp.size() == nums.length)
      result.add(new ArrayList<Integer>(temp));
    else {
      for(int i = 0; i < nums.length; i++) {
        if(temp.contains(nums[i])) continue;
        temp.add(nums[i]);
        helper(temp, nums, k);
        temp.remove(temp.size()-1);
      }
    }
  }
  
  public String getPermutationBetter(int n, int k) {
    // Put factorials into an array for quick reference
    int[] factorials = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };
    
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int i = 1; i <= n; i++)
      nums.add(i);
    
    // We are decrementing because ie permutations 1-6 is actually 0-5.
    k--;
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= n; i++) {
      // This calculation returns the index of next number
      int index = k / factorials[n-i];
      sb.append(nums.remove(index));
      // This calculation subtract possible permutations from k total.
      k -= index * factorials[n-i];
    }
    return sb.toString();
  }
}
