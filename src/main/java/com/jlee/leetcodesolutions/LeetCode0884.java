package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode0884 {
  /*
   * We are given two sentences A and B. (A sentence is a string of space
   * separated words. Each word consists only of lowercase letters.)
   * 
   * A word is uncommon if it appears exactly once in one of the sentences, and
   * does not appear in the other sentence.
   * 
   * Return a list of all uncommon words.
   * 
   * You may return the list in any order.
   * 
   * https://leetcode.com/contest/weekly-contest-97/problems/uncommon-words-from-two-sentences/
   */
  public String[] uncommonFromSentences(String A, String B) {
    // Map frequency of each word into a Map
    HashMap<String,Integer> map = new HashMap<>();
    String[] data = A.split(" ");
    for(String word : data)
      map.put(word, map.getOrDefault(word, 0) + 1);
    
    data = B.split(" ");
    for(String word : data)
      map.put(word, map.getOrDefault(word, 0) + 1);
    
    // If the word only occurs once, add into List
    List<String> list = new ArrayList<>();
    for(String key : map.keySet()) {
      if(map.get(key) == 1)
        list.add(key);
    }
    
    data = new String[list.size()];
    return list.toArray(data);
  }
}
