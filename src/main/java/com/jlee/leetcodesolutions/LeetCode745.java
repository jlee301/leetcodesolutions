package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode745 {
  /*
   * Given many words, words[i] has weight i.
   * 
   * Design a class WordFilter that supports one function, WordFilter.f(String
   * prefix, String suffix). It will return the word with given prefix and suffix
   * with maximum weight. If no word exists, return -1.
   * 
   * https://leetcode.com/problems/prefix-and-suffix-search/description/
   */
  class WordFilter {
    private HashMap<String, List<Integer>> mapPre;
    private HashMap<String, List<Integer>> mapSuf;
    
    public WordFilter(String[] words) {
      // Create an entry for every prefix suffix
      mapPre = new HashMap<>();
      mapSuf = new HashMap<>();
      for(int i = 0; i < words.length; i++) {
        for(int j = 0; j <= 10 && j <= words[i].length(); j++) {
          String key = words[i].substring(0, j);
          if(!mapPre.containsKey(key))
            mapPre.put(key, new ArrayList<>());
          mapPre.get(key).add(i);
          
          key = words[i].substring(words[i].length()-j);
          if(!mapSuf.containsKey(key))
            mapSuf.put(key, new ArrayList<>());
          mapSuf.get(key).add(i);
        }
      }
    }
    
    public int f(String prefix, String suffix) {
      if(!mapPre.containsKey(prefix) || !mapSuf.containsKey(suffix))
        return -1;
      
      List<Integer> pre = mapPre.get(prefix);
      List<Integer> suf = mapSuf.get(suffix);
      
      // Search backwards until we find a match
      int i = pre.size()-1, j = suf.size()-1;
      while(i >= 0 && j >= 0) {
        int p = pre.get(i);
        int s = suf.get(j);
        if(p < s) 
          j--;
        else if(p > s) 
          i--;
        else 
          return p;        
      }
      return -1;
    }
  }
}
