package com.jlee.leetcodesolutions;

import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class LeetCode715 {
  /*
   * A Range Module is a module that tracks ranges of numbers. Your task is to
   * design and implement the following interfaces in an efficient manner.
   * 
   * 1. addRange(int left, int right) Adds the half-open interval [left, right),
   * tracking every real number in that interval. Adding an interval that
   * partially overlaps with currently tracked numbers should add any numbers in
   * the interval [left, right) that are not already tracked.
   * 
   * 2. queryRange(int left, int right) Returns true if and only if every real
   * number in the interval [left, right) is currently being tracked.
   * 
   * 3. removeRange(int left, int right) Stops tracking every real number
   * currently being tracked in the interval [left, right).
   * 
   * https://leetcode.com/problems/range-module/description/
   */
  class RangeModule {
    // Each entry is left, right
    private TreeMap<Integer,Integer> map;
    
    public RangeModule() {
      map = new TreeMap<>();
    }
    
    public void addRange(int left, int right) {      
      Integer start = map.floorKey(left);
      Integer end = map.floorKey(right);
      
      // Range is clear to be added
      if(start == null && end == null)
        map.put(left, right);
      
      // The range is absorbed by an existing entry
      else if(start != null && map.get(start) >= left)
        map.put(start, Math.max(map.get(start), Math.max(map.get(end), right)));
      
      else
        map.put(left, Math.max(map.get(end), right));
      
      // Remove all entries in between
      // We must export the keys into a brand new Set to avoid ConcurrentModificationException
      Map<Integer,Integer> subMap = map.subMap(left, false, right, true);
      Set<Integer> set = new HashSet<>(subMap.keySet());
      for(int key : set)
        map.remove(key);
    }
    
    public boolean queryRange(int left, int right) {
      Integer key = map.floorKey(left);
      if(key == null)
        return false;
      return map.get(key) >= right;
    }
    
    public void removeRange(int left, int right) {
      Integer start = map.floorKey(left);
      Integer end = map.floorKey(right);

      if(end != null && map.get(end) > right)
        map.put(right, map.get(end));

      if(start != null && map.get(start) > left)
        map.put(start, left);
            
      // Remove all entries in between
      // We must export the keys into a brand new Set to avoid ConcurrentModificationException
      Map<Integer,Integer> subMap = map.subMap(left, true, right, false);
      Set<Integer> set = new HashSet<>(subMap.keySet());
      for(int key : set)
        map.remove(key);
    }
  }
}
