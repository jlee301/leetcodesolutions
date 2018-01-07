package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode543;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode543 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(3, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testLongerLeftRight() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.right.left = new TreeNode(6);
    root.left.right.right = new TreeNode(7);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(4, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testLongerLeftLeft() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(4, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testMoreRight() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(5, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testMoreRightToo() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(5, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testMoreRightTrice() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(9);
    root.right.right.right = new TreeNode(10);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(6, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testMoreRightTriceAgain() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(9);
    root.right.right.right = new TreeNode(10);
    root.right.right.left = new TreeNode(11);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(6, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testJustRoot() {
    TreeNode root = new TreeNode(1);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(0, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testJustRootLeft() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(1, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testJustRootRight() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(1, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testJustRootLeftRight() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(2, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode543 solution = new LeetCode543();
    Assert.assertEquals(0, solution.diameterOfBinaryTree(root));
  }
}
