package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode1104 {
  /*
   * https://leetcode.com/problems/path-in-zigzag-labelled-binary-tree/
   */
  public List<Integer> pathInZigZagTree(int label) {
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
    
    List<Integer> list = new ArrayList<>();
    list.add(label);
    int i = bRange.size()-2;
    boolean wrap = true;
    while(i >= 0) {
      label /= 2;
      if(wrap) {
        int[] curr = bRange.get(i);
        int diff = curr[1] - label;
        list.add(curr[0] + diff);
      }
      else {
        list.add(label);
      }
      i--;
      wrap = !wrap;
    }    
    Collections.reverse(list);;
    return list;
  }
}
