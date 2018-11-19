package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode943 {
  /*
   * Given an array A of strings, find any smallest string that contains each
   * string in A as a substring.
   * 
   * We may assume that no string in A is substring of another string in A.
   * 
   * https://leetcode.com/problems/find-the-shortest-superstring/
   */
  public String shortestSuperstring(String[] A) {
    char[] used = new char[A.length];
    Arrays.fill(used, '0');
    return helper(A, 0, used, new HashMap<>());
  }
  
  private String helper(String[] A, int pos, char[] used, HashMap<String,String> memo) {
    if(pos == A.length)
      return "";
    
    String key = String.valueOf(used);
    if(memo.containsKey(key))
      return memo.get(key);
    
    String superString = null;
    for(int i = 0; i < A.length; i++) {
      if(used[i] == '1')
        continue;
      
      // can any of these words be combined with str
      // ie remain = "abc", A[i] = "cd" --> str = "abcd"
      used[i] = '1';
      String curr = A[i];
      String remain = helper(A, pos+1, used, memo);

      // Check to see if the end of A[i] overlaps with the beginning of remain
      int j = remain.length();
      while(!curr.endsWith(remain.substring(0, j)))
        j--;
      
      String next = "";
      next = curr + remain.substring(j);
      if(superString == null || next.length() < superString.length())
        superString = next;
      
      // Check to see if the end of remain overlaps with the beginning of A[i]
      j = A[i].length();
      while(!remain.endsWith(curr.substring(0, j)))
        j--;
      
      next = remain + curr.substring(j);
      if(next.length() < superString.length())
        superString = next;
        
      used[i] = '0';
    }
    
    memo.put(key, superString);
    return superString;
  }
}
