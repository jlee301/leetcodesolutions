package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {
  /*
   * Given an index k, return the kth row of the Pascal's triangle.
   * 
   * Input: 3
   * Output: [1,3,3,1].
   * 
   * Note:
   * Could you optimize your algorithm to use only O(k) extra space?
   * 
   * https://leetcode.com/problems/pascals-triangle-ii/description/
   */
  public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new ArrayList<Integer>();
    if(rowIndex < 0) {
      return result;
    }

    // This is pretty much the same function from 118 if you designed it to keep
    // reusing the same List.
    for(int i = 0; i < rowIndex + 1; i++) {
      result.add(0, 1);
      for(int j = 1; j < result.size() - 1; j++) {
        result.set(j, result.get(j) + result.get(j + 1));
      }
    }
    return result;
  }
}
