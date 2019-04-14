package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1026;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1026 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(8);
    
    root.left = new TreeNode(3);
    root.right = new TreeNode(10);
    
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(6);
    root.right.right = new TreeNode(14);
    
    root.left.right.left = new TreeNode(4);
    root.left.right.right = new TreeNode(7);
    root.right.right.left = new TreeNode(13);
    
    LeetCode1026 solution = new LeetCode1026();    
    Assert.assertEquals(7, solution.maxAncestorDiff(root));
  }
}
