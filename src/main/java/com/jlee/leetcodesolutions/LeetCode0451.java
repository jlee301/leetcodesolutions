package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class LeetCode0451 {
  /*
   * Given a string, sort it in decreasing order based on the frequency of
   * characters.
   * 
   * Example 1:
   * Input: "tree"
   * Output: "eert"
   * Explanation: 'e' appears twice while 'r' and 't' both appear once. So 'e'
   * must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

   * Example 2:
   * Input: "cccaaa"
   * Output: "cccaaa"
   * Explanation: Both 'c' and 'a' appear three times, so "aaaccc" is also a valid
   * answer. Note that "cacaca" is incorrect, as the same characters must be
   * together. 
   * 
   * Example 3:
   * Input: "Aabb"
   * Output: "bbAa"
   * Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect. Note
   * that 'A' and 'a' are treated as two different characters.
   * 
   * https://leetcode.com/problems/sort-characters-by-frequency/description/
   */
  public String frequencySort(String s) {
    if(s == null)
      return "";
    
    // Find frequency of each character. Store as HashMap<Character, Integer>
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0)+1);
    }
    
    // Converting HashMap into ordered TreeMap<Integer, List<Character>>
    TreeMap<Integer, List<Character>> countMap = new TreeMap<>();
    for(char ch : map.keySet()) {
      int count = map.get(ch);
      if(!countMap.containsKey(count))
        countMap.put(count, new ArrayList<>());
      countMap.get(count).add(ch);
    }
    
    StringBuilder sb = new StringBuilder();
    // Using descendingKeySet
    for(int count : countMap.descendingKeySet()) {
      List<Character> chars = countMap.get(count);
      for(char ch : chars) {
        for(int i = 0; i < count; i++)
          sb.append(ch);
      }
    }
    return sb.toString();
  }
}
