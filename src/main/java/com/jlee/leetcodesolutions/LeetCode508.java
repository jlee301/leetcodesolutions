package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class LeetCode508 {
  /*
   * Given the root of a tree, you are asked to find the most frequent subtree
   * sum. The subtree sum of a node is defined as the sum of all the node values
   * formed by the subtree rooted at that node (including the node itself). So
   * what is the most frequent subtree sum value? If there is a tie, return all
   * the values with the highest frequency in any order.
   * 
   * Note: You may assume the sum of values in any subtree is in the range of
   * 32-bit signed integer.
   */
  public int[] findFrequentTreeSum(TreeNode root) {
    if(root == null)
      return new int[] {};

    // Find the frequency of each sum HashMap<Sum, Frequency>
    HashMap<Integer,Integer> map = new HashMap<>();
    sum(root, map);

    // Now convert to TreeMap<Frequency, List of Sums>
    TreeMap<Integer,List<Integer>> tmap = new TreeMap<>();
    for(int key : map.keySet()) {
      int count = map.get(key);
      if(!tmap.containsKey(count))
        tmap.put(count, new ArrayList<>());
      tmap.get(count).add(key);
    }

    // This returns the lastKey, which in a TreeMap will be the highest frequency
    int key = tmap.lastKey();
    List<Integer> list = tmap.get(key);
    
    // Convert list into array output
    int[] result = new int[list.size()];
    for(int i = 0; i < list.size(); i++)
      result[i] = list.get(i);
    return result;
  }
  
  private int sum(TreeNode node, HashMap<Integer,Integer> map) {
    if(node == null)
      return 0;
    
    int sumLeft = sum(node.left, map);
    int sumRight = sum(node.right, map);
    int sum = node.val + sumLeft + sumRight;
    map.put(sum,  map.getOrDefault(sum, 0) + 1);
    return sum;
  }
}
