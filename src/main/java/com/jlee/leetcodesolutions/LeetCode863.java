package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode863 {
  /*
   * We are given a binary tree (with root node root), a target node, and an
   * integer value `K`.
   * 
   * Return a list of the values of all nodes that have a distance K from the
   * target node. The answer can be returned in any order.
   * 
   * https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/description/
   */
  public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
    // Since TreeNode does not have a way to track back, we need to associate the
    // current node with its parent using DFS
    HashMap<TreeNode,TreeNode> parentMap = new HashMap<>();
    dfs(root, null, parentMap);
    
    // Starting from target, proceeds down the tree K times, using BFS
    Queue<TreeNode> queue = new LinkedList<>();
    HashSet<TreeNode> visited = new HashSet<>();
    queue.add(target);
    visited.add(target);
    int dist = 0;
    while(!queue.isEmpty() && dist != K) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        TreeNode node = queue.poll();
        // Add left node
        if(node.left != null && !visited.contains(node.left)) {
          queue.add(node.left);
          visited.add(node.left);
        }
        
        // Add right node
        if(node.right != null && !visited.contains(node.right)) {
          queue.add(node.right);
          visited.add(node.right);
        }
        
        // Add parent node
        TreeNode parent = parentMap.get(node);
        if(parent != null && !visited.contains(parent)) {
          queue.add(parent);
          visited.add(parent);
        }
      }
      dist++;
    }
    
    // Store the nodes remaining into list
    List<Integer> result = new ArrayList<>();
    while(!queue.isEmpty())
      result.add(queue.poll().val);
    
    return result;
  }
  
  private void dfs(TreeNode node, TreeNode parent, HashMap<TreeNode,TreeNode> parentMap) {
    if(node == null) 
      return;
    
    parentMap.put(node, parent);
    dfs(node.left, node, parentMap);
    dfs(node.right, node, parentMap);
  }
}
