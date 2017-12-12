package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode107 {
  /*
   * Given a binary tree, return the bottom-up level order traversal of its nodes'
   * values. (ie, from left to right, level by level from leaf to root).
   * 
   * Input: [3,9,20,null,null,15,7]
   *     3
   *    / \
   *   9  20
   *     /  \
   *    15   7
   * 
   * Output: [
   *          [15,7],
   *          [9,20],
   *          [3]
   *         ]
   */
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> result = new LinkedList<List<Integer>>();
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    
    if(root == null)
      return result;
    else
      queue.offer(root);
    
    while(!queue.isEmpty()) {
      List<Integer> temp = new LinkedList<Integer>();
      int numOfLeaves = queue.size();
      for(int i = 0; i < numOfLeaves; i++) {
        if(queue.peek().left != null)
          queue.offer(queue.peek().left);
        
        if(queue.peek().right != null)
          queue.offer(queue.peek().right);
        
        // This will remove the top most entry from queue and store into my temp List
        temp.add(queue.poll().val);
      }
      // Store at the top, pushes everything else down so that way it is bottom-up
      result.add(0, temp);
    }    
    return result;
  }
}
