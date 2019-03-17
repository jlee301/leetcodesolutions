package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class LeetCode0692 {
  /*
   * Given a non-empty list of words, return the k most frequent elements.
   * 
   * Your answer should be sorted by frequency from highest to lowest. If two
   * words have the same frequency, then the word with the lower alphabetical
   * order comes first.
   * 
   * https://leetcode.com/problems/top-k-frequent-words/description/
   */
  public List<String> topKFrequent(String[] words, int k) {
    // First map word by frequency
    HashMap<String,Integer> map = new HashMap<>();
    for(String word : words)
      map.put(word, map.getOrDefault(word, 0) + 1);
    
    // Then bucket frequency with list of words. Using TreeMap and TreeSet will keep
    // it ordered
    TreeMap<Integer,TreeSet<String>> counts = new TreeMap<>();
    for(String word : map.keySet()) {
      int key = map.get(word);
      if(!counts.containsKey(key))
        counts.put(key, new TreeSet<>());
      counts.get(key).add(word);
    }
    
    // Now store k frequent words into list.
    List<String> result = new ArrayList<>();
    outerloop:
      for(int key : counts.descendingKeySet()) {
        Iterator<String> iter = counts.get(key).iterator();
        while(iter.hasNext()) {
          result.add(iter.next());
          k--;
          if(k == 0) 
            break outerloop;
        }
      }
    return result;
  }
}
