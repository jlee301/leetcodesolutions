package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode0890 {
  /*
   * https://leetcode.com/contest/weekly-contest-98/problems/find-and-replace-pattern/
   */
  public List<String> findAndReplacePattern(String[] words, String pattern) {
    HashMap<Integer,Integer> map = new HashMap<>();
    HashSet<Integer> alreadyMapped = new HashSet<>();
    List<String> result = new ArrayList<>();
    for(String word : words) {
      map.clear();
      alreadyMapped.clear();
      
      // If word and pattern are different length, then not possible
      if(word.length() != pattern.length()) 
        continue;
      
      // Attempt to map every char in pattern to the word
      boolean valid = true;
      for(int i = 0; i < pattern.length(); i++) {
        int pch = pattern.charAt(i)-'a';
        int wch = word.charAt(i)-'a';
        if(!map.containsKey(pch)) {
          // Check to make sure the char is not already mapped to another
          // abb -> ccc
          if(alreadyMapped.contains(wch)) {
            valid = false;
            break;
          }
          map.put(pch, wch);
          alreadyMapped.add(wch);
        }
        else {
          // If we already have a map, then confirm that it matches the expected character
          if(map.get(pch) != wch) {
            valid = false;
            break;
          }
        }
      }
      if(valid)
        result.add(word);
    }
    return result;
  }
}
