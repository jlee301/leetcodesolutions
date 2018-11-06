package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode936 {
  /*
   * https://leetcode.com/problems/stamping-the-sequence/
   */
  public int[] movesToStamp(String stamp, String target) {
    char[] goal = new char[target.length()];
    Arrays.fill(goal, '*');
    
    char[] curr = target.toCharArray();
    Stack<Integer> stack = new Stack<>();
    
    // Keep looping into goal == curr
    while(!Arrays.equals(goal, curr)) {
      int pos = helper(stamp, curr);
      if(pos < 0) {
        // no possible swap available
        return new int[] {};
      }
      stack.add(pos);
    }
    
    // Convert stack into array
    int N = stack.size();
    int[] result = new int[N];
    for(int i = 0; i < N; i++)
      result[i] = stack.pop();
    
    return result;
  }
  
  // Returns starting index of where the stamp occurs in target
  private int helper(String stamp, char[] curr) {
    // Check all possible combinations of stamp occurring in curr
    // return starting index of first instance found
    for(int i = 0; i <= curr.length - stamp.length(); i++) {
      int j = i, k = 0;
      boolean found = false;
      while(j < curr.length && k < stamp.length() && (curr[j] == '*' || curr[j] == stamp.charAt(k))) {
        // avoid matching stamp with all wildcards
        if(curr[j] != '*')
          found = true;
        
        j++;
        k++;
      }
      
      // Now replace [i : i+stamp.length()] with wildcard
      if(k == stamp.length() && found) {
        for(j = i; j < i + k; j++)
          curr[j] = '*';
        
        return i;
      }
    }
    // could not find any matches with stamp
    return -1;
  }
}
