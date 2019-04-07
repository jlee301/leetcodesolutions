package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1023 {
  /*
   * https://leetcode.com/contest/weekly-contest-131/problems/camelcase-matching/
   */
  public List<Boolean> camelMatch(String[] queries, String pattern) {
    List<Boolean> list = new ArrayList<>();
    for(String query : queries) {
      // pattern = FoBaT
      // query = FooBar
      int i = 0, j = 0;
      boolean match = true;
      search: while(i < pattern.length()) {
        char chPAT = pattern.charAt(i);
        
        while(j < query.length()) {
          char chQUE = query.charAt(j);
          if(chPAT == chQUE) {
            // Matches, check next character in pattern
            j++;
            break;
          }
          
          // You can only insert additional lower case letters
          if(Character.isUpperCase(chQUE)) {
            match = false;
            break search;
          }
          
          j++;
          // Reached end of query before finding match of current pattern
          if(j == query.length())
            match = false;
        }
        
        i++;
      }
      
      // Check remaining characters of query for any upper case
      while(j < query.length()) {
        if(Character.isUpperCase(query.charAt(j))) {
          match = false;
          break;
        }        
        j++;
      }
      
      if(match)
        list.add(true);
      else
        list.add(false);
    }
    return list;
  }
}
