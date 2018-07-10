package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode679 {
  /*
   * You have 4 cards each containing a number from 1 to 9. You need to judge
   * whether they could operated through *, /, +, -, (, ) to get the value of 24.
   * 
   * https://leetcode.com/problems/24-game/description/
   */
  public boolean judgePoint24(int[] nums) {
    // We are using Double to compensate for real division
    List<Double> list = new ArrayList<>();
    for(int num : nums)
      list.add((double) num);
    
    return judgePoint24(list);
  }
  
  private boolean judgePoint24(List<Double> nums) {
    int N = nums.size();
    if(N == 1) {
      if(Math.abs(nums.get(0)-24.0) < 0.0001)
        return true;
    }
    // Perform the operation on any two number combination
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        if(i == j) continue;
        
        List<Double> subNums = new ArrayList<>();
        // Add all numbers not i and j
        for(int k = 0; k < N; k++) {
          if(k != i && k != j)
            subNums.add(nums.get(k));
        }

        // Now add the operation of i and j to the list
        // We will perform all four operations
        for(int k = 0; k < 4; k++) {
          if(k == 0)
            subNums.add(nums.get(i) + nums.get(j));
          
          if(k == 1)
            subNums.add(nums.get(i) * nums.get(j));
          
          if(k == 2)
            subNums.add(nums.get(i) - nums.get(j));
          
          if(k == 3) {
            // Avoid invalid operation
            if(nums.get(j) == 0) 
              continue;
            subNums.add(nums.get(i) / nums.get(j));
          }
          
          if(judgePoint24(subNums))
            return true;
          
          // Backtracking, remove the last operation on i and j
          subNums.remove(subNums.size()-1);
        }
      }
    }
    return false;
  }
}
