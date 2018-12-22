package com.jlee.leetcodesolutions;

public class LeetCode706 {
  /*
   * Design a HashMap without using any built-in hash table libraries.
   * 
   * https://leetcode.com/problems/design-hashmap/
   */
  private Integer[] map;
  
  /** Initialize your data structure here. */
  public LeetCode706() {
    map = new Integer[1000001];
  }
    
  /** value will always be non-negative. */
  public void put(int key, int value) {
    map[key] = value;
  }
    
  /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
  public int get(int key) {
    return map[key] != null ? map[key] : -1;
  }
    
  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  public void remove(int key) {
    map[key] = null;
  }
}
