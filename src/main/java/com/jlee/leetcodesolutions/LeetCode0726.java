package com.jlee.leetcodesolutions;

import java.util.TreeMap;

public class LeetCode0726 {
  private int pos;
  private int N;
  
  public String countOfAtoms(String formula) {
    pos = 0;
    N = formula.length();

    // Store the element name and frequency
    TreeMap<String,Integer> map = helper(formula);
    
    // Since TreeMap defaults to ordering by key, we just need to append the
    // key name and its frequency value into a string
    StringBuilder sb = new StringBuilder();
    for(String key : map.keySet()) {
      sb.append(key);
      int freq = map.get(key);
      if(freq > 1)
        sb.append(freq);
    }
    return sb.toString();
  }
  
  private TreeMap<String,Integer> helper(String formula) {
    TreeMap<String,Integer> map = new TreeMap<>();
    while(pos < N && formula.charAt(pos) != ')') {
      if(formula.charAt(pos) == '(') {
        // Parse inner formula
        pos++;
        TreeMap<String,Integer> innerMap = helper(formula);
        for(String key : innerMap.keySet())
          map.put(key, map.getOrDefault(key, 0) + innerMap.get(key));
      }
      
      else {
        // Parse element name
        int start = pos;
        pos++;
        while(pos < N && Character.isLowerCase(formula.charAt(pos))) pos++;
        String key = formula.substring(start, pos);
        
        // Parse frequency of the element
        start = pos;
        while(pos < N && Character.isDigit(formula.charAt(pos))) pos++;
        // frequency is 1 if there is no digit following the element
        int freq = start < pos ? Integer.valueOf(formula.substring(start, pos)) : 1;
        map.put(key, map.getOrDefault(key, 0) + freq);
      }
    }
    
    // Is there is a multiplier after ')'?
    pos++;
    int start = pos;
    while(pos < N && Character.isDigit(formula.charAt(pos))) pos++;
    if(start < pos) {
      int multi = Integer.valueOf(formula.substring(start, pos));
      // Multiply every key/value by the multiplier
      for(String key : map.keySet())
        map.put(key, map.get(key) * multi);
    }
    
    return map;
  }
}
