package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LeetCode0384 {
  /*
   * Shuffle a set of numbers without duplicates.
   * 
   * https://leetcode.com/problems/shuffle-an-array/description/
   */
  private List<Integer> list; 
  private int[] nums;
  private int len;
  
  public LeetCode0384(int[] nums) {
    this.nums = nums.clone();
    len = nums.length;
    list = new ArrayList<>();
    for(int num : nums)
      list.add(num);
  }

  /** Resets the array to its original configuration and return it. */
  public int[] reset() {
    return nums;
  }

  /** Returns a random shuffling of the array. */
  public int[] shuffle() {
    // Make copy of list
    List<Integer> temp = new ArrayList<>(list);
    Random rand = new Random();
    int[] result = new int[len];
    for(int i = 0; i < len; i++) {
      // We use nextInt to create the random shuffled array.
      int index = rand.nextInt(temp.size());
      result[i] = temp.get(index);
      temp.remove(index);
    }
    return result;
  }  
}
