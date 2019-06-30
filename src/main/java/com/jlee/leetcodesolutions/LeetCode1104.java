package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode1104 {
  /*
   * https://leetcode.com/problems/path-in-zigzag-labelled-binary-tree/
   */
  public List<Integer> pathInZigZagTree(int label) {
    // Generate the ranges per level
    // level 0: [1, 1]
    // level 1: [2, 3]
    // level 2: [4, 7]
    // level 3: [8, 15]
    List<int[]> bRange = new ArrayList<>();
    int start = 1, end = 1;
    bRange.add(new int[] {start, end});
    int bInc = 1;
    while(end < label) {
      bInc <<= 1;
      start = end + 1;
      end += bInc;
      bRange.add(new int[] {start, end});
    }
    
    // Now work backwards to determine path taken
    List<Integer> list = new ArrayList<>();
    list.add(label);
    int i = bRange.size()-2;
    while(i >= 0) {
      // Find what the label would be if it was entirely left to right
      // Take the difference from the end range of that level and add it to the start
      // to get the actual zigzag label
      label /= 2;
      int[] curr = bRange.get(i);
      int diff = curr[1] - label;
      label = curr[0] + diff;
      list.add(label);
      i--;
    }    
    Collections.reverse(list);
    return list;
  }
}
