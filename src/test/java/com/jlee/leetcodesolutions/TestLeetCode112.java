package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode112;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode112 {
  @Test
  public void testOneNodeSumEqual() {
    TreeNode root = new TreeNode(1);
    
    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 1);
    Assert.assertTrue(result);
  }

  @Test
  public void testOneNodeSumNotEqual() {
    TreeNode root = new TreeNode(1);
    
    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 2);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testTwoNodeLeftSumEqual() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 3);
    Assert.assertTrue(result);
  }

  @Test
  public void testTwoNodeLeftSumNotEqual() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 1);
    Assert.assertFalse(result);
  }

  @Test
  public void testTwoNodeRightSumEqual() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 3);
    Assert.assertTrue(result);
  }

  @Test
  public void testTwoNodeRightSumNotEqual() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 1);
    Assert.assertFalse(result);
  }

  @Test
  public void testTwoNodeSumEqual() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 3);
    Assert.assertTrue(result);
    result = solution.hasPathSum(root, 4);
    Assert.assertTrue(result);
  }

  @Test
  public void testTwoNodeNotEqual() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 1);
    Assert.assertFalse(result);
  }

  @Test
  public void testNull() {
    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(null, 0);
    Assert.assertFalse(result);
  }
}