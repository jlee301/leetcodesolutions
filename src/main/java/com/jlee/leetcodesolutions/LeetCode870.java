package com.jlee.leetcodesolutions;

import java.util.TreeMap;

public class LeetCode870 {
  /*
   * Given two arrays A and B of equal size, the advantage of A with respect to B
   * is the number of indices i for which A[i] > B[i].
   * 
   * Return any permutation of A that maximizes its advantage with respect to B.
   * 
   * https://leetcode.com/contest/weekly-contest-93/problems/advantage-shuffle/
   */
  public int[] advantageCount(int[] A, int[] B) {
    // Store the frequency of each number into a TreeMap
    TreeMap<Integer,Integer> map = new TreeMap<>();
    for(int num : A)
      map.put(num, map.getOrDefault(num, 0) + 1);
    
    int N = B.length;
    int[] result = new int[N];
    for(int i = 0; i < N; i++) {
      // Obtain the next higher value of B[i] from A
      Integer key = map.higherKey(B[i]);
      if(key != null)
        result[i] = key;
      else {
        // If there is no higher value, then use the lowest entry
        key = map.firstKey();
        result[i] = key;
      }
      
      // Decrement the usage from the TreeMap
      int value = map.get(key);
      if(value == 1)
        map.remove(key);
      else
        map.put(key, value-1);
    }
    return result;
  }
}
