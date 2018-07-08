package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode866 {
  /*
   * Given a binary tree rooted at root, the depth of each node is the shortest
   * distance to the root.
   * 
   * A node is deepest if it has the largest depth possible.
   * 
   * Return the node with the largest depth such that it contains all the deepest
   * nodes in it's subtree.
   * 
   * https://leetcode.com/contest/weekly-contest-92/problems/smallest-subtree-with-all-the-deepest-nodes/
   */
  public TreeNode subtreeWithAllDeepest(TreeNode root) {
    HashMap<TreeNode,TreeNode> parents = new HashMap<>();
    HashMap<Integer,HashSet<TreeNode>> depths = new HashMap<>();
    findDepthAndParents(root, depths, 0, parents);
    
    // The last level in the map are the deepest nodes
    // Now we must find the common node for all nodes in the last level.
    // Worst case scenario it points back to root node
    HashSet<TreeNode> set = new HashSet<>(depths.get(depths.size()-1));
    while(set.size() != 1) {
      HashSet<TreeNode> nextSet = new HashSet<>();
      for(TreeNode node : set)
        nextSet.add(parents.get(node));
      set = nextSet;
    }
    return set.iterator().next();
  }
  
  private void findDepthAndParents(TreeNode node, HashMap<Integer,HashSet<TreeNode>> depths, int level, HashMap<TreeNode,TreeNode> parents) {
    if(node == null)
      return;
    
    // Add to depths
    if(!depths.containsKey(level))
      depths.put(level, new HashSet<>());
    depths.get(level).add(node);
    
    // Record the parents
    if(node.left != null)
      parents.put(node.left, node);
    if(node.right != null)
      parents.put(node.right, node);
    
    findDepthAndParents(node.left, depths, level+1, parents);
    findDepthAndParents(node.right, depths, level+1, parents);
  }
}
