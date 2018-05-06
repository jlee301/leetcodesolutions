package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode830 {
  /*
   * In a string S of lowercase letters, these letters form consecutive groups of
   * the same character.
   * 
   * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx",
   * "z" and "yy".
   * 
   * Call a group large if it has 3 or more characters. We would like the starting
   * and ending positions of every large group.
   * 
   * The final answer should be in lexicographic order.
   * 
   * https://leetcode.com/contest/weekly-contest-83/problems/positions-of-large-groups/
   */
  public List<List<Integer>> largeGroupPositions(String S) {
    char[] data = S.toCharArray();
    List<List<Integer>> result = new ArrayList<>();
    for(int i = 0; i < data.length; i++) {
      char ch = data[i];
      int left = i;
      // Advance i until characters do not match.
      while(i+1 < data.length && ch == data[i+1]) i++;
      int right = i;
      
      // Only store if the size of the group is greater than or equal to 3
      if(right - left >= 2)
        result.add(Arrays.asList(left,right));
    }
    return result;
  }
}
