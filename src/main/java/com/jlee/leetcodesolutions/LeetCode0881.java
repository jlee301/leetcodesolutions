package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0881 {
  /*
   * The i-th person has weight people[i], and each boat can carry a maximum
   * weight of limit.
   * 
   * Each boat carries at most 2 people at the same time, provided the sum of the
   * weight of those people is at most limit.
   * 
   * Return the minimum number of boats to carry every given person. (It is
   * guaranteed each person can be carried by a boat.)
   * 
   * https://leetcode.com/contest/weekly-contest-96/problems/boats-to-save-people/
   */
  public int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);
    // Sliding window
    // {3,2,2,1} --> {1,2,2,3}
    // We keep trying to pair the heavier weighted people with lighter weighted
    int boats = 0;
    int left = 0;
    int right = people.length - 1;
    while(left <= right) {
      if(people[left] + people[right] <= limit)
        left++;
      boats++;
      right--;
    }
    return boats;
  }
}
