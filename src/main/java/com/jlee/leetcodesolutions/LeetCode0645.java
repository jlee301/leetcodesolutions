package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode0645 {
  /*
   * The set S originally contains numbers from 1 to n. But unfortunately, due to
   * the data error, one of the numbers in the set got duplicated to another
   * number in the set, which results in repetition of one number and loss of
   * another number.
   * 
   * Given an array nums representing the data status of this set after the error.
   * Your task is to firstly find the number occurs twice and then find the number
   * that is missing. Return them in the form of an array.
   * 
   * Example 1:
   * Input: nums = [1,2,2,4]
   * Output: [2,3]
   * 
   * Note:
   * 1. The given array size will in the range [2, 10000].
   * 2. The given array's numbers won't have any order.
   * 
   * https://leetcode.com/problems/set-mismatch/description/
   */
  public int[] findErrorNums(int[] nums) {
    Arrays.sort(nums);
    int a = 0, b = 0;
    HashSet<Integer> set = new HashSet<>();
    boolean foundMissing = false;
    boolean foundDupe = false;
    int i = 1, j = 0;
    while(j < nums.length && (!foundMissing || !foundDupe)) {
      if(!foundDupe && !set.add(nums[j])) {
        foundDupe = true;
        a = nums[j];
        j++;
        continue;
      }
      
      if(!foundMissing && i != nums[j]) {
        foundMissing = true;
        b = i;
      }
      i++;
      j++;
    }
    return new int[] {a, foundMissing ? b : nums.length };
  }
}
