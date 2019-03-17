package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0105;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0105 {
  @Test
  public void testProblemCase() {
    int[] preorder = {3,9,20,15,7};
    int[] inorder = {9,3,15,20,7};
    LeetCode0105 solution = new LeetCode0105();
    TreeNode root = solution.buildTree(preorder, inorder);
    Assert.assertEquals(3, root.val);
    Assert.assertEquals(9, root.left.val);
    Assert.assertNull(root.left.left);
    Assert.assertNull(root.left.right);
    Assert.assertEquals(20, root.right.val);
    Assert.assertEquals(15, root.right.left.val);
    Assert.assertNull(root.right.left.left);
    Assert.assertNull(root.right.left.right);
    Assert.assertEquals(7, root.right.right.val);
    Assert.assertNull(root.right.right.left);
    Assert.assertNull(root.right.right.right);
  }

  @Test
  public void testPreorderEmpty() {
    int[] preorder = {};
    int[] inorder = {9,3,15,20,7};
    LeetCode0105 solution = new LeetCode0105();
    TreeNode root = solution.buildTree(preorder, inorder);
    Assert.assertNull(root);
  }

  @Test
  public void testInorderEmpty() {
    int[] preorder = {3,9,20,15,7};
    int[] inorder = {};
    LeetCode0105 solution = new LeetCode0105();
    TreeNode root = solution.buildTree(preorder, inorder);
    Assert.assertNull(root);
  }

  @Test
  public void testPreorderNull() {
    int[] preorder = null;
    int[] inorder = {9,3,15,20,7};
    LeetCode0105 solution = new LeetCode0105();
    TreeNode root = solution.buildTree(preorder, inorder);
    Assert.assertNull(root);
  }

  @Test
  public void testInorderNull() {
    int[] preorder = {3,9,20,15,7};
    int[] inorder = null;
    LeetCode0105 solution = new LeetCode0105();
    TreeNode root = solution.buildTree(preorder, inorder);
    Assert.assertNull(root);
  }
}
