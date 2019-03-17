package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LeetCode0118 {
  /*
   * Given numRows, generate the first numRows of Pascal's triangle.
   * 
   * Input: 5
   * Output:
   * [
   *      [1],
   *     [1,1],
   *    [1,2,1],
   *   [1,3,3,1],
   *  [1,4,6,4,1]
   * ]
   * 
   * https://leetcode.com/problems/pascals-triangle/description/
   */
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    if(numRows == 0)
      return result;
    
    // Base case
    Integer[] prev = {1};
    result.add(Arrays.asList(prev));
    
    // Generate the remaining rows
    for(int i = 1; i < numRows; i++) {
      Integer[] next = new Integer[prev.length+1];
      for(int j = 0; j < next.length; j++)
        next[j] = (j == 0 ? 0 : prev[j-1]) + (j == next.length-1 ? 0 : prev[j]);
      
      result.add(Arrays.asList(next));
      prev = next;
    }
    return result;
  }
}
