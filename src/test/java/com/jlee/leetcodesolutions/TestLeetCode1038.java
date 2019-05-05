package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1038;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1038 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(4);
    
    root.left = new TreeNode(1);
    root.right = new TreeNode(6);
    
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(2);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);
    
    root.left.right.right = new TreeNode(3);
    root.right.right.right = new TreeNode(8);
    
    LeetCode1038 solution = new LeetCode1038();
    TreeNode result = solution.bstToGst(root);
    Assert.assertEquals(30, result.val);
    
    Assert.assertEquals(36, result.left.val);
    Assert.assertEquals(21, result.right.val);
    
    Assert.assertEquals(36, result.left.left.val);
    Assert.assertEquals(35, result.left.right.val);
    Assert.assertEquals(26, result.right.left.val);
    Assert.assertEquals(15, result.right.right.val);

    Assert.assertEquals(33, result.left.right.right.val);
    Assert.assertEquals(8, result.right.right.right.val);
  }
}
