package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode0049 {
  /*
   * Given an array of strings, group anagrams together.
   * 
   * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
   * Return: [ ["ate", "eat","tea"], 
   *           ["nat","tan"], 
   *           ["bat"] ]
   * 
   * Note: All inputs will be in lower-case.
   * 
   * https://leetcode.com/problems/group-anagrams/description/
   */
  public List<List<String>> groupAnagrams(String[] strs){
    if(strs == null)
      return new ArrayList<>();
    
    HashMap<String,List<String>> map = new HashMap<>();
    for(String str : strs) {
      char[] temp = str.toCharArray();
      Arrays.sort(temp);
      String sTemp = Arrays.toString(temp);
      if(!map.containsKey(sTemp))
        map.put(sTemp, new ArrayList<>());
      
      map.get(sTemp).add(str);
    }
    return new ArrayList<>(map.values());
  }
}
