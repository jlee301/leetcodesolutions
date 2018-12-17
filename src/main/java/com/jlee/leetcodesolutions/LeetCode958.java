package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode958 {
  /*
   * https://leetcode.com/problems/check-completeness-of-a-binary-tree/
   */
  public boolean isCompleteTree(TreeNode root) {
    HashMap<Integer,List<TreeNode>> map = new HashMap<>();
    traverse(root, 0, map);
    
    int size = map.size();
    if(size <= 1)
      return true;
    
    // Check level completeness except last
    for(int i = 0, expected = 1; i < size-1; i++) {
      if(map.get(i).size() != expected)
        return false;
      expected <<= 1;
    }
    
    // Check to make sure last row is far left
    List<TreeNode> lastRow = map.get(size-1);
    List<TreeNode> prevRow = map.get(size-2);
    for(int i = 0; i < lastRow.size(); i++) {
      // prevRow   0    1   2
      // lastRow  0,1  2,3 4,5
      if(i % 2 == 0) {
        // Check prev left
        if(lastRow.get(i) != prevRow.get(i/2).left)
          return false;
      }
      else {
        // Check prev right
        if(lastRow.get(i) != prevRow.get(i/2).right)
          return false;
      }
    }
    return true;
  }
  
  private void traverse(TreeNode node, int level, HashMap<Integer,List<TreeNode>> map) {
    if(node == null)
      return;
    
    map.computeIfAbsent(level, k -> new ArrayList<>()).add(node);
    traverse(node.left, level+1, map);
    traverse(node.right, level+1, map);
  }
}
