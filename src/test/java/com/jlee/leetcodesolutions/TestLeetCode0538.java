package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0538;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0538 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(13);
    root.right.left = new TreeNode(12);
    root.right.right = new TreeNode(20);
    LeetCode0538 solution = new LeetCode0538();
    TreeNode result = solution.convertBST(root);
    Assert.assertEquals(50, result.val);
    Assert.assertEquals(55, result.left.val);
    Assert.assertEquals(56, result.left.left.val);
    Assert.assertEquals(53, result.left.right.val);
    Assert.assertEquals(33, result.right.val);
    Assert.assertEquals(45, result.right.left.val);
    Assert.assertEquals(20, result.right.right.val);
    Assert.assertNull(result.left.left.left);
    Assert.assertNull(result.left.left.right);
    Assert.assertNull(result.left.right.left);
    Assert.assertNull(result.left.right.right);
    Assert.assertNull(result.right.left.left);
    Assert.assertNull(result.right.left.right);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.right = new TreeNode(13);
    LeetCode0538 solution = new LeetCode0538();
    TreeNode result = solution.convertBST(root);
    Assert.assertEquals(18, result.val);
    Assert.assertEquals(20, result.left.val);
    Assert.assertEquals(13, result.right.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(5);
    LeetCode0538 solution = new LeetCode0538();
    TreeNode result = solution.convertBST(root);
    Assert.assertEquals(5, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = null;
    LeetCode0538 solution = new LeetCode0538();
    TreeNode result = solution.convertBST(root);
    Assert.assertNull(result);
  }
}
