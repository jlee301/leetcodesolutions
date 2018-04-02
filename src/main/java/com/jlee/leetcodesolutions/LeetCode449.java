package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode449 {
  /*
   * Serialization is the process of converting a data structure or object into a
   * sequence of bits so that it can be stored in a file or memory buffer, or
   * transmitted across a network connection link to be reconstructed later in the
   * same or another computer environment.
   * 
   * Design an algorithm to serialize and deserialize a binary search tree. There
   * is no restriction on how your serialization/deserialization algorithm should
   * work. You just need to ensure that a binary search tree can be serialized to
   * a string and this string can be deserialized to the original tree structure.
   * 
   * The encoded string should be as compact as possible.
   * 
   * Note: Do not use class member/global/static variables to store states. Your
   * serialize and deserialize algorithms should be stateless.
   * 
   * https://leetcode.com/problems/serialize-and-deserialize-bst/description/
   */
  private final static String SEP = ",";
  private final static String NULL = "#";
  
  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    serialize(root, sb);
    return sb.toString();
  }
  
  private void serialize(TreeNode node, StringBuilder sb) {
    if(node == null) {
      sb.append(NULL + SEP);
      return;
    }
    sb.append(node.val + SEP);
    serialize(node.left, sb);
    serialize(node.right, sb);
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    String[] strs = data.split(SEP);
    Queue<String> queue = new LinkedList<>();
    for(String str : strs)
      queue.add(str);
    return deserialize(queue);
  }
  
  private TreeNode deserialize(Queue<String> queue) {
    String curr = queue.poll();
    if(curr.equals(NULL))
      return null;
    TreeNode node = new TreeNode(Integer.valueOf(curr));
    node.left = deserialize(queue);
    node.right = deserialize(queue);
    return node;
  }
}
