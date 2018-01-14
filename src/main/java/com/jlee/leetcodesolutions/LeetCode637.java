package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode637 {
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
  private HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

  public List<Double> averageOfLevels(TreeNode root) {
    int level = 0;
    populateMap(root, level);
    
    List<Double> result = new ArrayList<Double>();
    for(int key: map.keySet()) {
      ArrayList<Integer> list = map.get(key);
      long avg = 0;
      for(int i = 0; i < list.size(); i++) {
        avg += list.get(i);
      }
      result.add((double) avg / (long) list.size());
    }
    return result;
  }
  
  private void populateMap(TreeNode node, int level) {
    if(node == null)
      return;
    
    if(!map.containsKey(level))
      map.put(level, new ArrayList<Integer>());
    
    map.get(level).add(node.val);
    
    level++;
    populateMap(node.left, level);
    populateMap(node.right, level);
  }
}
