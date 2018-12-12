package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode701;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode701 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(4);

    root.left = new TreeNode(2);
    root.right = new TreeNode(7);
    
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    
    LeetCode701 solution = new LeetCode701();
    TreeNode result = solution.insertIntoBST(root, 5);
    Assert.assertEquals(4, result.val);

    Assert.assertEquals(2, result.left.val);
    Assert.assertEquals(7, result.right.val);

    Assert.assertEquals(1, result.left.left.val);
    Assert.assertEquals(3, result.left.right.val);
    Assert.assertEquals(5, result.right.left.val);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(4);

    root.left = new TreeNode(2);
    root.right = new TreeNode(7);
    
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    
    LeetCode701 solution = new LeetCode701();
    TreeNode result = solution.insertIntoBST(root, 8);
    Assert.assertEquals(4, result.val);

    Assert.assertEquals(2, result.left.val);
    Assert.assertEquals(7, result.right.val);

    Assert.assertEquals(1, result.left.left.val);
    Assert.assertEquals(3, result.left.right.val);
    Assert.assertEquals(8, result.right.right.val);
  }
}
