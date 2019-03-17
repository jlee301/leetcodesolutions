package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.Stack;

public class LeetCode0316 {
  /*
   * Given a string which contains only lowercase letters, remove duplicate
   * letters so that every letter appear once and only once. You must make sure
   * your result is the smallest in lexicographical order among all possible
   * results.
   * 
   * https://leetcode.com/problems/remove-duplicate-letters/description/
   */
  private String result;
  private HashMap<Integer,TreeSet<Integer>> map;
  private int target;
  
  public String removeDuplicateLetters(String s) {
    result = "{";
    // Store into index position(s) of each char
    map = new HashMap<>();
    for(int i = 0; i < s.length(); i++)
      map.computeIfAbsent(s.charAt(i) - 'a', k -> new TreeSet<>()).add(i);
    
    target = map.size();
    helper("", new Stack<>());
    return result;
  }
  
  private void helper(String str, Stack<Integer> pos) {
    // System.out.println(str + " | " + result);
    // str follows result lexicographically
    if(str.compareTo(result) >= 0)
      return;
    
    if(str.length() == target) {
      // str precedes result lexicographically
      result = str;
      return;
    }

    // Can I create a str combination with all chars with what is remaining?
    int lastPos = pos.isEmpty() ? -1 : pos.peek();
    int minChar = 0;
    for(int i = 0; i < 26; i++) {
      if(map.containsKey(i)) {
        if(str.indexOf(i+'a') >= 0)
          continue;
        
        minChar = Math.min(minChar, i);
        Integer next = map.get(i).higher(lastPos);
        if(next == null)
          return;
      }
    }
    
    // It it confirmed above that we can create a str combination, now lets attempt
    // to assemble the smallest lexicographically representation of the str
    for(int i = minChar; i < 26; i++) {
      if(map.containsKey(i)) {
        // string already contains this char
        if(str.indexOf(i+'a') >= 0)
          continue;
        
        Integer next = map.get(i).higher(lastPos);
        // Backtracking
        pos.push(next);
        str = str + (char)(i+'a');
        helper(str, pos);
        pos.pop();
        str = str.substring(0, str.length()-1);
      }
    }
  }
}
