package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode828 {
  /*
   * A character is unique in string S if it occurs exactly once in it.
   * 
   * For example, in string S = "LETTER", the only unique characters are "L" and
   * "R".
   * 
   * Let's define UNIQ(S) as the number of unique characters in string S.
   * 
   * For example, UNIQ("LETTER") = 2.
   * 
   * Given a string S with only uppercases, calculate the sum of UNIQ(substring)
   * over all non-empty substrings of S.
   * 
   * If there are two or more equal substrings at different positions in S, we
   * consider them different.
   * 
   * Since the answer can be very large, retrun the answer modulo 10 ^ 9 + 7.
   * 
   * https://leetcode.com/problems/unique-letter-string/description/
   */
  public int uniqueLetterString(String S) {
    // Map index occurrences of each character
    HashMap<Character, List<Integer>> map = new HashMap<>();
    for(int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);
      if(!map.containsKey(ch))
        map.put(ch, new ArrayList<>());
      map.get(ch).add(i);
    }
    
    int sum = 0;
    for(List<Integer> list : map.values()) {
      for(int i = 0; i < list.size(); i++) {
        // Determine the no. of substrings left of i (inclusive)
        // Determine the no. of substrings right of i (inclusive)
        // Product of the two is the total no. of possible substrings for i
        int curr = list.get(i);
        int prev = i > 0 ? list.get(i-1) : -1;
        int next = i < list.size()-1 ? list.get(i+1) : S.length();
        sum += (curr - prev) * (next - curr);
      }
    }
    return sum;
  }
}
