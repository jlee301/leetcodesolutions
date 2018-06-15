package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode761 {
  /*
   * Special binary strings are binary strings with the following two properties:
   * 1. The number of 0's is equal to the number of 1's.
   * 2. Every prefix of the binary string has at least as many 1's as 0's.
   * 
   * Given a special string S, a move consists of choosing two consecutive,
   * non-empty, special substrings of S, and swapping them. (Two strings are
   * consecutive if the last character of the first string is exactly one index
   * before the first character of the second string.)
   * 
   * At the end of any number of moves, what is the lexicographically largest
   * resulting string possible?
   * 
   * https://leetcode.com/problems/special-binary-string/description/
   */
  public String makeLargestSpecial(String S) {
    List<String> list = new ArrayList<>();
    for(int i = 0, j = 0, count = 0; j < S.length(); j++) {
      if(S.charAt(j) == '1')
        count++;
      else
        count--;
      
      if(count == 0) {
        // Do recursion on all data between "1" and "0"
        // S = 11011000 --> "1" + S = 101100 + "0"
        list.add("1" + makeLargestSpecial(S.substring(i+1, j)) + "0");
        i = j+1;
      }
    }
    
    // Sort by lexicographically largest
    // [ [10], [1100] ] --> [ [1100], [10] ]
    Collections.sort(list, Collections.reverseOrder());
    String result = "";
    for(String str : list)
      result = result + str;
    
    return result;
  }
}
