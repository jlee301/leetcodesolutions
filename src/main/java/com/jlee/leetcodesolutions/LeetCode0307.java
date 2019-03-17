package com.jlee.leetcodesolutions;

public class LeetCode0307 {
  /*
   * Given an integer array nums, find the sum of the elements between indices i
   * and j (i ≤ j), inclusive.
   * 
   * The update(i, val) function modifies nums by updating the element at index i
   * to val.
   * 
   * Example: 
   * Given nums = [1, 3, 5] 
   * sumRange(0, 2) -> 9 
   * update(1, 2) 
   * sumRange(0, 2) -> 8
   * 
   * Note: 
   * 1. The array is only modifiable by the update function.
   * 
   * 2. You may assume the number of calls to update and sumRange function is
   * distributed evenly.
   * 
   * https://leetcode.com/problems/range-sum-query-mutable/description/
   */
  class NumArray {
    private int[] nums;
    private int[] BITree;
    private int size;
    
    public NumArray(int[] nums) {
      if(nums == null || nums.length == 0)
        return;
      size = nums.length;
      this.nums = new int[size];
      BITree = new int[size+1];
      for(int i = 0; i < size; i++)
        update(i, nums[i]);
    }
    
    /*
     * In a BIT array, to calculate the parent, you the last set bit of the index.
     * index 9  1001
     *       1  0001 +
     *          ----
     *      10  1010  (meaning index 10 is the parent of index 9)
     */
    public void update(int i, int val) {
      if(nums == null) return;
      int diff = val - nums[i];
      nums[i] = val;
      // Update BITreee for i+1 and all its parents
      i++;
      while(i <= size) {
        BITree[i] += diff;
        i = i + (i & -i); // Set i to the parent
      }
    }
    
    public int sumRange(int i, int j) {
      if(nums == null) return 0;
      return getSum(j) - getSum(i-1);
    }
    
    /*
     * To sum the values, but the parent is obtained by subtracting the last set bit of the index
     * index 10  1010
     *        2  0010 -
     *           ----
     *        8  1000 (meaning index 8 is a parent of index 10)   
     */
    private int getSum(int i) {
      int sum = 0;
      // Sum the data from the i+1 and all its parents
      i++;
      while(i > 0) {
        sum += BITree[i];
        i = i - (i & -i); // Set i to the parent
      }
      return sum;
    }
  }
}
