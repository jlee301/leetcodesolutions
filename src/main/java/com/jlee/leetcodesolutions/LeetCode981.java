package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.TreeMap;

public class LeetCode981 {
  /*
   * https://leetcode.com/problems/time-based-key-value-store/
   */
  private HashMap<String,TreeMap<Integer,String>> map;
  
  /** Initialize your data structure here. */
  public LeetCode981() {
    map = new HashMap<>();
  }
  
  public void set(String key, String value, int timestamp) {
    map.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
  }
  
  public String get(String key, int timestamp) {
    if(!map.containsKey(key))
      return "";
    
    Integer timeKey = map.get(key).floorKey(timestamp);
    if(timeKey == null)
      return "";
    else
      return map.get(key).get(timeKey);
  }
}
