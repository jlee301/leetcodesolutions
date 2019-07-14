package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1123 {
  /*
   * https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/
   */
  public TreeNode lcaDeepestLeaves(TreeNode root) {
    HashMap<TreeNode,TreeNode> parentMap = new HashMap<>();
    HashMap<Integer,Queue<TreeNode>> levelMap = new HashMap<>();
    dfs(root, null, parentMap, levelMap, 0);
    
    // Get all the nodes of the deepest level
    Queue<TreeNode> queue = levelMap.get(levelMap.size()-1);
    while(queue.size() > 1) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        // For each node at this level, obtain the parent node for next iteration
        TreeNode curr = queue.poll();
        TreeNode parent = parentMap.get(curr);
        if(!queue.contains(parent))
          queue.add(parent);
      }        
    }    
    return queue.poll();
  }
  
  private void dfs(TreeNode node, TreeNode parent, HashMap<TreeNode,TreeNode> parentMap, HashMap<Integer,Queue<TreeNode>> levelMap, int level) {
    if(node == null)
      return;
    
    parentMap.put(node, parent);
    levelMap.computeIfAbsent(level, k -> new LinkedList<>()).add(node);
    dfs(node.left, node, parentMap, levelMap, level+1);
    dfs(node.right, node, parentMap, levelMap, level+1);
  }
}
