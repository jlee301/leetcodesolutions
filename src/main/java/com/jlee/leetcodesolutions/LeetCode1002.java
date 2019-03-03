package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1002 {
  /*
   * https://leetcode.com/contest/weekly-contest-126/problems/find-common-characters/
   */
  public List<String> commonChars(String[] A) {
    int[][] count = new int[A.length][26];
    for(int i = 0; i < A.length; i++) {
      for(int j = 0; j < A[i].length(); j++)
        count[i][A[i].charAt(j) - 'a']++;
    }
    
   List<String> result = new ArrayList<>();
   for(int i = 0; i < 26; i++) {
     // Check each word for min count for this character
     int min = Integer.MAX_VALUE;
     for(int j = 0; j < count.length; j++)
       min = Math.min(min, count[j][i]);
     
     for(int k = 0; k < min; k++)
       result.add("" + (char) ('a' + i));
   }
   return result;
  }
}
