package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode0791 {
  /*
   * 
   * S and T are strings composed of lowercase letters. In S, no letter occurs
   * more than once.
   * 
   * S was sorted in some custom order previously. We want to permute the
   * characters of T so that they match the order that S was sorted. More
   * specifically, if x occurs before y in S, then x should occur before y in the
   * returned string.
   * 
   * Return any permutation of T (as a string) that satisfies this property.
   * 
   * Example:
   * Input:
   * S = "cba"
   * T = "abcd"
   * Output: "cbad"
   * Explanation:
   * "a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b",
   * and "a". Since "d" does not appear in S, it can be at any position in T.
   * "dcba", "cdba", "cbda" are also valid outputs.
   * 
   * 
   * Note:
   * 1. S has length at most 26, and no character is repeated in S.
   * 2. T has length at most 200.
   * 3. S and T consist of lowercase letters only.
   * 
   * https://leetcode.com/problems/custom-sort-string/description/
   */
  private int[] pos;
  
  public String customSortString(String S, String T) {
    // Create a map indicating char position from S
    pos = new int[26];
    Arrays.fill(pos, -1);
    int len = S.length();
    for(int i = 0; i < len; i++)
      pos[S.charAt(i) - 'a'] = i;
    // Now fill any -1 with increments of len
    for(int i = 0; i < 26; i++) {
      if(pos[i] == -1)
        pos[i] = len++;
    }
    Character[] data = new Character[T.length()];
    for(int i = 0; i < T.length(); i++)
      data[i] = T.charAt(i);
     
    Arrays.sort(data, new CustomCharSort());
    StringBuilder sb = new StringBuilder();
    for(char ch : data)
      sb.append(ch);
    return sb.toString();
  }
  
  private class CustomCharSort implements Comparator<Character> {
    @Override
    public int compare(Character a, Character b) {
      return pos[a - 'a'] - pos[b - 'a'];
    }
  }
}
