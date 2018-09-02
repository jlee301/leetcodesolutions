package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode897;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode897 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(5);
    
    root.left = new TreeNode(3);
    root.right = new TreeNode(6);
    
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right.right = new TreeNode(8);
    
    root.left.left.left = new TreeNode(1);
    root.right.right.left = new TreeNode(7);
    root.right.right.right = new TreeNode(9);
    
    LeetCode897 solution = new LeetCode897();
    TreeNode result = solution.increasingBST(root);
    
    for(int i = 1; i <= 9; i++) {
      Assert.assertEquals(i, result.val);
      Assert.assertNull(result.left);
      result = result.right;
    }
    Assert.assertNull(result);
  }
}
