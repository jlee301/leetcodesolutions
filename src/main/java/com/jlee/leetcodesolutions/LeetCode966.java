package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode966 {
  /*
   * https://leetcode.com/problems/vowel-spellchecker/
   */
  public String[] spellchecker(String[] wordlist, String[] queries) {
    HashMap<String,Integer> mapIdxCS = new HashMap<>();
    HashMap<String,Integer> mapIdxCIS = new HashMap<>();
    for(int i = 0; i < wordlist.length; i++) {
      mapIdxCS.put(wordlist[i], i);
      String key = wordlist[i].toLowerCase();
      if(!mapIdxCIS.containsKey(key))
        mapIdxCIS.put(key, i);
    }
    
    String[] result = new String[queries.length];
    for(int i = 0; i < queries.length; i++) {
      // 1. Case sensitive
      if(mapIdxCS.containsKey(queries[i])) {
        result[i] = wordlist[mapIdxCS.get(queries[i])];
        continue;
      }
      
      // 2. Case insensitive
      String lowered = queries[i].toLowerCase();
      if(mapIdxCIS.containsKey(lowered)) {
        result[i] = wordlist[mapIdxCIS.get(lowered)];
        continue;
      }
      
      // 3. Vowel replacement
      int idx = helper(lowered, wordlist, mapIdxCIS, 0);
      result[i] = idx == Integer.MAX_VALUE ? "" : wordlist[idx];
    }
    return result;
  }
  
  private static final char[] vowels = {'a','e','i','o','u'};  
  
  /*
   * Returns idx of matching word in wordlist. Returns Integer.MAX_VALUE if no match is found.
   */
  private int helper(String str, String[] wordlist, HashMap<String,Integer> mapIdxCIS, int pos) {
    int idx = mapIdxCIS.containsKey(str) ? mapIdxCIS.get(str) : Integer.MAX_VALUE;
    if(pos == str.length())
      return idx;
    
    char ch = str.charAt(pos);
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      // Attempt every vowel at this position
      char[] cdata = str.toCharArray();
      for(char nxt : vowels) {
        cdata[pos] = nxt;
        idx = Math.min(idx, helper(String.valueOf(cdata), wordlist, mapIdxCIS, pos+1));
      }
    }
    else {
      // Not a vowel, move to next character
      idx = Math.min(idx, helper(str, wordlist, mapIdxCIS, pos+1));
    }
    return idx;
  }
}
