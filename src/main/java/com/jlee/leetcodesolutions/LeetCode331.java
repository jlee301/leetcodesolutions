package com.jlee.leetcodesolutions;

public class LeetCode331 {
  /*
   * One way to serialize a binary tree is to use pre-order traversal. When we
   * encounter a non-null node, we record the node's value. If it is a null node,
   * we record using a sentinel value such as #.
   * 
   * For example, the above binary tree can be serialized to the string
   * "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.
   * 
   * Given a string of comma separated values, verify whether it is a correct
   * preorder traversal serialization of a binary tree. Find an algorithm without
   * reconstructing the tree.
   * 
   * Each comma separated value in the string must be either an integer or a
   * character '#' representing null pointer.
   * 
   * You may assume that the input format is always valid, for example it could
   * never contain two consecutive commas such as "1,,3".
   * 
   * https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/description/
   */
  public boolean isValidSerialization(String preorder) {
    if(preorder == null || preorder.length() == 0)
      return false;
    
    // Every non-null node provides 2 outdegree, 1 indegree (2 child, 1 parent) except root
    // Every null node provides 0 outdegree, 1 indegree (0 child, 1 parent)
    // Summing the difference should equal 0 if tree is valid
    // It should never go below 0 at any point
    int count = 1; // We offset by 1 to compensate root not having an indegree
    String[] strs = preorder.split(",");
    for(String str : strs) {
      count--; // Every node have 1 indegree
      if(count < 0) // It should never go below 0 at any point.
        return false;
      if(!str.equals("#")) // Adding 2 outdegree
        count += 2;
    }
    return count == 0;
  }
}
