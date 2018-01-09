package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode538;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode538 {
  @Test
  public void testThreeNode() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(13);
    root.right.left = new TreeNode(12);
    root.right.right = new TreeNode(20);
    LeetCode538 solution = new LeetCode538();
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
  public void testTwoNode() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.right = new TreeNode(13);
    LeetCode538 solution = new LeetCode538();
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
  public void testOneNode() {
    TreeNode root = new TreeNode(5);
    LeetCode538 solution = new LeetCode538();
    TreeNode result = solution.convertBST(root);
    Assert.assertEquals(5, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode538 solution = new LeetCode538();
    TreeNode result = solution.convertBST(root);
    Assert.assertNull(result);
    Assert.assertNull(result);
  }
}
