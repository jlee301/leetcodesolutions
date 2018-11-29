package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.List;

public class LeetCode119 {
  /*
   * Given an index k, return the kth row of the Pascal's triangle.
   * 
   * Input: 3
   * Output: [1,3,3,1].
   * 
   * Note:
   * Could you optimize your algorithm to use only O(k) extra space?
   * 
   * https://leetcode.com/problems/pascals-triangle-ii/description/
   */
  public List<Integer> getRow(int rowIndex) {
    Integer[] nums = new Integer[rowIndex+1];
    // Base case
    nums[0] = 1;

    // [1,2,1,null] --> [1,2,1,2] --> [1,3,1,2] --> [1,3,3,2] --> [1,3,3,1]
    // [1,3,3,1]
    for(int i = 1; i <= rowIndex; i++) {
      Integer prev = null;
      for(int j = 0; j < i; j++) {
        if(prev == null) {
          prev = nums[j];
          continue;
        }
        else {
          Integer temp = nums[j];
          nums[j] += prev;
          prev = temp;
        }  
      }
      nums[i] = prev;
    }
    return Arrays.asList(nums);
  }
}
