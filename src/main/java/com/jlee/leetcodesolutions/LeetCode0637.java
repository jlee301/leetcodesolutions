package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode0637 {
  /*
   * Given a non-empty binary tree, return the average value of the nodes on each
   * level in the form of an array.
   * 
   * Example 1: 
   * Input: 
   *    3 
   *   / \ 
   *  9  20 
   *    /  \ 
   *   15   7 
   * 
   * Output: [3, 14.5, 11]
   * 
   * Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5,
   * and on level 2 is 11. Hence return [3, 14.5, 11].
   * 
   * Note: The range of node's value is in the range of 32-bit signed integer.
   * 
   * https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
   */
  public List<Double> averageOfLevels(TreeNode root) {
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    traverse(root, 0, map);
    
    List<Double> result = new ArrayList<>();
    for(int i = 0; i < map.size(); i++) {
      double avg = 0.0;
      List<Integer> list = map.get(i);
      for(int n : list)
        avg += n;
      
      avg /= list.size();
      result.add(avg);
    }
    return result;
  }
  
  private void traverse(TreeNode node, int level, HashMap<Integer,List<Integer>> map) {
    if(node == null)
      return;
    
    map.computeIfAbsent(level, k -> new ArrayList<>()).add(node.val);
    traverse(node.left, level+1, map);
    traverse(node.right, level+1, map);
  }
}
