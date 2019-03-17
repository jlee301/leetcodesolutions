package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0297 {
  /*
   * Serialization is the process of converting a data structure or object into a
   * sequence of bits so that it can be stored in a file or memory buffer, or
   * transmitted across a network connection link to be reconstructed later in the
   * same or another computer environment.
   * 
   * Design an algorithm to serialize and deserialize a binary tree. There is no
   * restriction on how your serialization/deserialization algorithm should work.
   * You just need to ensure that a binary tree can be serialized to a string and
   * this string can be deserialized to the original tree structure.
   * 
   * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
   */
  //Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    if(root == null)
      return "#|";
    
    String result = root.val + "|";
    result = result + serialize(root.left) + serialize(root.right);
    return result;
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    // 1|2|#|#|3|4|#|#|5|#|#|
    // [1,2,#,#,3,4,#,#,5,#,#]
    String[] sdata = data.split("\\|");
    Queue<String> queue = new LinkedList<>(Arrays.asList(sdata));
    return helper(queue);
  }
  
  private TreeNode helper(Queue<String> queue) {
    if(queue.peek().equals("#")) {
      queue.poll();
      return null;
    }
    
    TreeNode node = new TreeNode(Integer.valueOf(queue.poll()));
    node.left = helper(queue);
    node.right = helper(queue);
    
    return node;
  }
}
