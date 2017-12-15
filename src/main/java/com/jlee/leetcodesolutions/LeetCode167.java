package com.jlee.leetcodesolutions;

public class LeetCode167 {
  /*
   * Given an array of integers that is already sorted in ascending order, find
   * two numbers such that they add up to a specific target number.
   *  
   * The function twoSum should return indices of the two numbers such that they
   * add up to the target, where index1 must be less than index2. Please note that
   * your returned answers (both index1 and index2) are not zero-based.
   * 
   * You may assume that each input would have exactly one solution and you may
   * not use the same element twice.
   * 
   * Input: numbers={2, 7, 11, 15}, target=9
   * Output: index1=1, index2=2
   * 
   * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
   */
  public int[] twoSum(int[] numbers, int target) {
    if(numbers == null)
      return null;
    int left = 0;
    int right = numbers.length - 1;

    // This logic only works if you assume the array is in ascending order
    // If input array was random { 7, 2, 1, 15 } then this would not work.
    while(left < right) {
      int sum = numbers[left] + numbers[right];
      if(sum > target) {
        // The sum is higher, so decrease right pointer to lower the sum
        right--;
      } else if(sum < target) {
        // The sum is lower, so increase left pointer to increase the sum
        left++;
      } else {
        return new int[] { left + 1, right + 1 };
      }
    }
    // No solution was found
    return null;
  }
}
