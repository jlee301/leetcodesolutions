package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.PriorityQueue;

public class LeetCode0987 {
  /*
   * https://leetcode.com/contest/weekly-contest-122/problems/vertical-order-traversal-of-a-binary-tree/
   */  
  private HashMap<Integer,HashMap<Integer,PriorityQueue<Integer>>> map;
  public List<List<Integer>> verticalTraversal(TreeNode root) {
    map = new HashMap<>();
    dfs(root, 0, 0, map);
    
    PriorityQueue<Integer> Xkeys = new PriorityQueue<>(map.keySet());
    List<List<Integer>> result = new ArrayList<>();
    while(!Xkeys.isEmpty()) {
      List<Integer> temp = new ArrayList<>();
      HashMap<Integer,PriorityQueue<Integer>> curr = map.get(Xkeys.poll());
      
      // Set Y keys to be descending
      PriorityQueue<Integer> Ykeys = new PriorityQueue<>((a,b) -> b - a);
      Ykeys.addAll(curr.keySet());
      while(!Ykeys.isEmpty()) {
        PriorityQueue<Integer> Yvals = curr.get(Ykeys.poll());
        // We cannot used temp.addAll(Yvals) because it will not reverse the ordering of the queue
        while(!Yvals.isEmpty()) 
          temp.add(Yvals.poll());
      }
      result.add(new ArrayList<>(temp));
    }
    return result;
  }
  
  private void dfs(TreeNode node, int X, int Y, HashMap<Integer,HashMap<Integer,PriorityQueue<Integer>>> map) {
    if(node == null)
      return;
    
    map.computeIfAbsent(X, k -> new HashMap<>()).computeIfAbsent(Y, l -> new PriorityQueue<>()).add(node.val);
    dfs(node.left, X-1, Y-1, map);
    dfs(node.right, X+1, Y-1, map);
  }
}
