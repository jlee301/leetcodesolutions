package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class LeetCode381 {
  /*
   * Design a data structure that supports all following operations in average
   * O(1) time.
   * 
   * Note: Duplicate elements are allowed.
   * insert(val): Inserts an item val to the collection.
   * remove(val): Removes an item val from the collection if present.
   * getRandom: Returns a random element from current collection of elements. The
   * probability of each element being returned is linearly related to the number
   * of same value the collection contains.
   * 
   * https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/description/
   */
  private List<Integer> nums;
  private HashMap<Integer,HashSet<Integer>> intIdx;
  private Random rand;
  
  /** Initialize your data structure here. */  
  public LeetCode381() {
    // Store integer into a list
    nums = new ArrayList<>();
    // Associate the index from the list to its val group
    intIdx = new HashMap<>();
    rand = new Random();
  }
  
  /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
  public boolean insert(int val) {
    nums.add(val);
    boolean result = intIdx.containsKey(val);
    intIdx.computeIfAbsent(val, k -> new HashSet<>()).add(nums.size()-1);
    return !result;
  }
  
  /** Removes a value from the collection. Returns true if the collection contained the specified element. */
  public boolean remove(int val) {
    boolean result = intIdx.containsKey(val);
    // There are no integers in this val group to remove
    if(!result)
      return false;
    
    // Obtain index to remove from the val group and remove it
    int idxToRemove = intIdx.get(val).iterator().next();
    if(intIdx.get(val).size() == 1)
      intIdx.remove(val);
    else
      intIdx.get(val).remove(idxToRemove);

    if(idxToRemove == nums.size()-1) {
      // If element to remove is already last element in the list, just remove it
      nums.remove(idxToRemove);
    }
    else {
      // Shift last element in nums to the element we are removing
      nums.set(idxToRemove, nums.remove(nums.size()-1));
      int groupKey = nums.get(idxToRemove);
      intIdx.get(groupKey).add(idxToRemove);
      intIdx.get(groupKey).remove(nums.size());
    }    
    return result;
  }
  
  /** Get a random element from the collection. */
  public int getRandom() {
    return nums.get(rand.nextInt(nums.size()));
  }
}
