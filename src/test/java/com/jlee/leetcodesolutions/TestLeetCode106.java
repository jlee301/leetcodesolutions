package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode106;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode106 {
  @Test
  public void testProblemCase() {
    int[] inorder = {9,3,15,20,7};
    int[] postorder = {9,15,7,20,3};
    LeetCode106 solution = new LeetCode106();
    TreeNode root = solution.buildTree(inorder, postorder);
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
  public void testInorderEmpty() {
    int[] inorder = {};
    int[] postorder = {9,15,7,20,3};
    LeetCode106 solution = new LeetCode106();
    TreeNode root = solution.buildTree(inorder, postorder);
    Assert.assertNull(root);
  }

  @Test
  public void testPostorderEmpty() {
    int[] inorder = {9,3,15,20,7};
    int[] postorder = {};
    LeetCode106 solution = new LeetCode106();
    TreeNode root = solution.buildTree(inorder, postorder);
    Assert.assertNull(root);
  }

  @Test
  public void testInorderNull() {
    int[] inorder = null;
    int[] postorder = {9,15,7,20,3};
    LeetCode106 solution = new LeetCode106();
    TreeNode root = solution.buildTree(inorder, postorder);
    Assert.assertNull(root);
  }

  @Test
  public void testPostorderNull() {
    int[] inorder = {9,3,15,20,7};
    int[] postorder = null;
    LeetCode106 solution = new LeetCode106();
    TreeNode root = solution.buildTree(inorder, postorder);
    Assert.assertNull(root);
  }
}