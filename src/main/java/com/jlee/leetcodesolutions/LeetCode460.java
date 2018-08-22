package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class LeetCode460 {
  /*
   * Design and implement a data structure for Least Frequently Used (LFU) cache.
   * It should support the following operations: get and put.
   * 
   * get(key) - Get the value (will always be positive) of the key if the key
   * exists in the cache, otherwise return -1.
   * 
   * put(key, value) - Set or insert the value if the key is not already present.
   * When the cache reaches its capacity, it should invalidate the least
   * frequently used item before inserting a new item. For the purpose of this
   * problem, when there is a tie (i.e., two or more keys that have the same
   * frequency), the least recently used key would be evicted.
   * 
   * https://leetcode.com/problems/lfu-cache/description/
   */
  private HashMap<Integer,Integer> cache;
  private HashMap<Integer,Integer> freq;
  private TreeMap<Integer,List<Integer>> freqId;
  private HashMap<Integer,Integer> timeId;
  private int capacity;
  private int time;
  
  public LeetCode460(int capacity) {
    this.capacity = capacity;
    cache = new HashMap<>();
    freq = new HashMap<>();
    freqId = new TreeMap<>();
    timeId = new HashMap<>();
    time = 0;
  }
  
  public int get(int key) {
    if(!cache.containsKey(key))
      return -1;
    
    // Update frequency for key
    int frequency = freq.get(key);
    freq.put(key, frequency+1);
    
    if(freqId.get(frequency).size() == 1)
      freqId.remove(frequency);
    else
      freqId.get(frequency).remove((Integer) key);

    List<Integer> ids = freqId.getOrDefault(frequency+1, new ArrayList<>());
    ids.add(key);
    freqId.put(frequency+1, ids);

    // Update time for key
    timeId.put(key, time++);
    
    return cache.get(key);
  }
  
  public void put(int key, int value) {
    // Special edge case
    if(capacity == 0)
      return;
    
    // If adding a new key and at capacity, need to remove LFU
    if(!cache.containsKey(key) && cache.size() == capacity) {
      // Of all the keys of the same frequency, remove least recently used
      int leastFreqKey = freqId.firstKey();
      int LFUTime = Integer.MAX_VALUE;
      int removeId = 0;
      for(int id : freqId.get(leastFreqKey)) {
        int temp = timeId.get(id);
        if(temp < LFUTime) {
          removeId = id;
          LFUTime = temp;
        }
      }
      timeId.remove(removeId);

      if(freqId.get(leastFreqKey).size() == 1)
        freqId.remove(leastFreqKey);
      else
        freqId.get(leastFreqKey).remove((Integer) removeId);
      
      freq.remove(removeId);
      cache.remove(removeId);
    }
    
    // Update frequency for key
    if(cache.containsKey(key)) {
      int frequency = freq.get(key);
      freq.put(key, frequency+1);
      
      if(freqId.get(frequency).size() == 1)
        freqId.remove(frequency);
      else
        freqId.get(frequency).remove((Integer) key);
      
      List<Integer> ids = freqId.getOrDefault(frequency+1, new ArrayList<>());
      ids.add(key);
      freqId.put(frequency+1, ids);      
    }
    else {
      freq.put(key, 0);
      List<Integer> ids = freqId.getOrDefault(0, new ArrayList<>());
      ids.add(key);
      freqId.put(0, ids);
    }
    // Add to time for key
    timeId.put(key, time++);
    cache.put(key, value);
  }
}
