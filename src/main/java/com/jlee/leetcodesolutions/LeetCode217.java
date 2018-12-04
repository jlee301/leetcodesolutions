package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode217 {
  /*
   * Given an array of integers, find if the array contains any duplicates. Your
   * function should return true if any value appears at least twice in the array,
   * and it should return false if every element is distinct.
   * 
   * https://leetcode.com/problems/contains-duplicate/description/
   */
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    // Use a set to determine if there are duplicates. If the set returns false on
    // an add, it means there exist an entry already
    for(int next : nums) {
      if(!set.add(next))
        return true;
    }
    return false;
  }
}
