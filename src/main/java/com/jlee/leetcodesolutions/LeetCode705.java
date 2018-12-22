package com.jlee.leetcodesolutions;

public class LeetCode705 {
  /*
   * Design a HashSet without using any built-in hash table libraries.
   * 
   * https://leetcode.com/problems/design-hashset/
   */
  Integer[] map;
  
  /** Initialize your data structure here. */
  public LeetCode705() {
    map = new Integer[1000001];      
  }
    
  public void add(int key) {
    map[key] = key;
  }
    
  public void remove(int key) {
    map[key] = null;      
  }
    
  /** Returns true if this set contains the specified element */
  public boolean contains(int key) {
    return map[key] != null;
  }
}
