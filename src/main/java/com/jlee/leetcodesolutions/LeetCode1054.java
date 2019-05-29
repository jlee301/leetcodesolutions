package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode1054 {
  /*
   * https://leetcode.com/problems/distant-barcodes/
   */
  public int[] rearrangeBarcodes(int[] barcodes) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int maxCount = 0;
    int maxKey = 0;
    
    // Find the most frequent barcode
    for(int key : barcodes) {
      int count = map.getOrDefault(key, 0) + 1;
      map.put(key, count);
      
      if(maxCount < count) {
        maxCount = count;
        maxKey = key;
      }
    }
    map.remove(maxKey);    

    // [1,1,1,1,2,2,3,3]
    // First populate all even indexes with the most frequent barcodes
    // [1,0,1,0,1,0,1,0]
    int[] result = new int[barcodes.length];    
    int i = 0;
    for(; maxCount > 0; maxCount--) {
      result[i] = maxKey;
      i += 2;
    }
    
    // Then populate remaining indexes with remaining barcodes
    // [1,2,1,2,1,0,1,0]
    // [1,2,1,2,1,3,1,3]
    for(int key : map.keySet()) {
      int count = map.get(key);
      for(; count > 0; count--) {
        if(i >= result.length)
          i = 1;
        
        result[i] = key;
        i += 2;
      }
    }
    return result;
  }
}
