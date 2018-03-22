package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class LeetCode380 {
  /*
   * Design a data structure that supports all following operations in average
   * O(1) time.
   * 1. insert(val): Inserts an item val to the set if not already present.
   * 2. remove(val): Removes an item val from the set if present.
   * 3. getRandom: Returns a random element from current set of elements. Each
   * element must have the same probability of being returned.
   */
  class RandomizedSet {
    private HashMap<Integer, Integer> map; // < Element, Index in List >
    // Using a HashMap here is to provide O(1) average search times
    private List<Integer> list;
    // The list is primarily for the getRandom so we can provide equal weight on the
    // index
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
      map = new HashMap<>();
      list = new ArrayList<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain
     * the specified element.
     */
    public boolean insert(int val) {
      if(map.containsKey(val))
        return false;
      map.put(val, list.size());
      list.add(val);
      return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified
     * element.
     */
    public boolean remove(int val) {
      if(!map.containsKey(val))
        return false;
      // Update the last element of the list to the index of the element being
      // removed.
      int index = map.get(val);
      int lastElement = list.get(list.size()-1);
      map.put(lastElement, index);
      list.set(index, lastElement);
      map.remove(val);
      list.remove(list.size()-1);
      return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
      Random rand = new Random();
      // nextInt(int n) picks a number between 0 (inclusive) and n (exclusive)
      return list.get(rand.nextInt(list.size()));
    }
  }
}
