package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

public class LeetCode0432 {
  /*
   * Implement a data structure supporting the following operations:
   * 
   * Inc(Key) - Inserts a new key with value 1. Or increments an existing key by
   * 1. Key is guaranteed to be a non-empty string.
   * 
   * Dec(Key) - If Key's value is 1, remove it from the data structure. Otherwise
   * decrements an existing key by 1. If the key does not exist, this function
   * does nothing. Key is guaranteed to be a non-empty string.
   * 
   * GetMaxKey() - Returns one of the keys with maximal value. If no element
   * exists, return an empty string "".
   * 
   * GetMinKey() - Returns one of the keys with minimal value. If no element
   * exists, return an empty string "".
   * 
   * https://leetcode.com/problems/all-oone-data-structure/description/
   */
  private HashMap<String,Integer> keymap;
  private TreeMap<Integer,List<String>> valuemap; 
  private Random rand;
  
  /** Initialize your data structure here. */
  public LeetCode0432() {
    // maps key -> value
    keymap = new HashMap<>();
    // maps value -> keys
    valuemap = new TreeMap<>();
    rand = new Random();
  }
  
  /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
  public void inc(String key) {
    int value = keymap.getOrDefault(key, 0);
    keymap.put(key, value+1);
    
    // Remove from existing value map
    if(value != 0) {
      if(valuemap.get(value).size() == 1) {
        // No more keys for this value, remove it
        valuemap.remove(value);
      }
      else {
        // Remove the key from the value map
        valuemap.get(value).remove(key);
      }
    }
    
    // Add to new value map
    valuemap.computeIfAbsent(value+1, k -> new ArrayList<>());
    valuemap.get(value+1).add(key);
  }
  
  /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
  public void dec(String key) {
    int value = keymap.getOrDefault(key, 0);
    
    if(value == 0) {
      // key did not exist to begin with
      return;
    }
    else if(value == 1) {
      // Remove key because it becomes zero
      keymap.remove(key);
    }
    else {
      // Standard decrement
      keymap.put(key, value-1);
    }
    
    if(valuemap.get(value).size() == 1) {
      // No more keys for this value, remove it
      valuemap.remove(value);
    }
    else {
      // Remove the key from the value map
      valuemap.get(value).remove(key);
    }
    
    // Now add the key to the new value map
    if(value > 1) {
      valuemap.computeIfAbsent(value-1, k -> new ArrayList<>());
      valuemap.get(value-1).add(key);
    }
  }
  
  /** Returns one of the keys with maximal value. */
  public String getMaxKey() {
    if(!valuemap.isEmpty()) {
      Integer key = valuemap.lastKey();
      int idx = rand.nextInt(valuemap.get(key).size());
      return valuemap.get(key).get(idx);
    }
    return "";
  }
  
  /** Returns one of the keys with Minimal value. */
  public String getMinKey() {
    if(!valuemap.isEmpty()) {
      Integer key = valuemap.firstKey();
      int idx = rand.nextInt(valuemap.get(key).size());
      return valuemap.get(key).get(idx);
    }
    return "";      
  }
}
