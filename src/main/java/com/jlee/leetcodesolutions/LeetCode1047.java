package com.jlee.leetcodesolutions;

public class LeetCode1047 {
  /*
   * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
   */
  public String removeDuplicates(String S) {
    String[] search = { "aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "kk", "ll", "mm", "nn", "oo", "pp",
        "qq", "rr", "ss", "tt", "uu", "vv", "ww", "xx", "yy", "zz" };
    
    boolean adjacentFound = true;
    while(adjacentFound) {
      adjacentFound = false;
      // Check to see if there are any adjacent duplicate letters
      for(String term : search) {
        int index = S.indexOf(term);
        if(index > -1) {
          // Build next iteration of String with the removal of the duplicate
          S = S.substring(0, index) + S.substring(index+2);
          adjacentFound = true;
        }
      }
    }
    return S;
  }
}
