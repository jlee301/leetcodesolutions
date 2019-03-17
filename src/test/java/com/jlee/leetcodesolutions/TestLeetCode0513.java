package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0513;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0513 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    LeetCode0513 solution = new LeetCode0513();
    Assert.assertEquals(1, solution.findBottomLeftValue(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(5);
    root.right.left.left = new TreeNode(7);
    root.right.right = new TreeNode(6);
    LeetCode0513 solution = new LeetCode0513();
    Assert.assertEquals(7, solution.findBottomLeftValue(root));
  }

  @Test
  public void testLevel0() {
    TreeNode root = new TreeNode(1);
    LeetCode0513 solution = new LeetCode0513();
    Assert.assertEquals(1, solution.findBottomLeftValue(root));
  }

  @Test
  public void testLevel1Left() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    LeetCode0513 solution = new LeetCode0513();
    Assert.assertEquals(2, solution.findBottomLeftValue(root));
  }

  @Test
  public void testLevel1Right() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
    LeetCode0513 solution = new LeetCode0513();
    Assert.assertEquals(3, solution.findBottomLeftValue(root));
  }

  @Test
  public void testLevel1Full() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode0513 solution = new LeetCode0513();
    Assert.assertEquals(2, solution.findBottomLeftValue(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode0513 solution = new LeetCode0513();
    Assert.assertEquals(Integer.MIN_VALUE, solution.findBottomLeftValue(root));
  }
}