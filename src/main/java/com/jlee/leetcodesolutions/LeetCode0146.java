package com.jlee.leetcodesolutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class LeetCode0146 {
  /*
   * Design and implement a data structure for Least Recently Used (LRU) cache. It
   * should support the following operations: get and put.
   * 
   * get(key) - Get the value (will always be positive) of the key if the key
   * exists in the cache, otherwise return -1.
   * 
   * put(key, value) - Set or insert the value if the key is not already present.
   * When the cache reached its capacity, it should invalidate the least recently
   * used item before inserting a new item.
   * 
   * https://leetcode.com/problems/lru-cache/
   */
  private final int capacity;
  private Deque<Integer> priority;
  private HashMap<Integer,Integer> map;
  
  public LeetCode0146(int capacity) {
    this.capacity = capacity;
    // bottom of priority = LRU
    priority = new ArrayDeque<>();
    map = new HashMap<>();
  }
  
  public int get(int key) {
    if(priority.contains(key)) {
      // Update priority
      priority.remove(key);
      priority.addFirst(key);
    }
    return map.getOrDefault(key, -1);
  }
  
  public void put(int key, int value) {
    // If key exist, update priority
    if(priority.contains(key)) {
      priority.remove(key);
      priority.addFirst(key);
    }
    // If key does not exist - at capacity?
    else {
      if(priority.size() == capacity) {
        // Must remove LRU
        int LRUKey = priority.removeLast();
        map.remove(LRUKey);
      }
      priority.addFirst(key);
    }
    map.put(key, value);
  }
}
