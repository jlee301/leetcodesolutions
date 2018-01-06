package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode530;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode530 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(2);
    LeetCode530 solution = new LeetCode530();
    Assert.assertEquals(1, solution.getMinimumDifference(root));
  }

  @Test
  public void testLeftSideTree() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(6);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(9);
    LeetCode530 solution = new LeetCode530();
    Assert.assertEquals(1, solution.getMinimumDifference(root));
  }

  @Test
  public void testLeftSideTreeMissingRightLeaf() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(6);
    root.left.left = new TreeNode(2);
    LeetCode530 solution = new LeetCode530();
    Assert.assertEquals(4, solution.getMinimumDifference(root));
  }

  @Test
  public void testLeftSideTwoTier() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(6);
    LeetCode530 solution = new LeetCode530();
    Assert.assertEquals(4, solution.getMinimumDifference(root));
  }

  @Test
  public void testTwoTierRightSmaller() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(6);
    root.right = new TreeNode(12);
    LeetCode530 solution = new LeetCode530();
    Assert.assertEquals(2, solution.getMinimumDifference(root));
  }

  @Test
  public void testThreeTierRightSmaller() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(6);
    root.right = new TreeNode(12);
    root.right.left = new TreeNode(11);
    root.right.right = new TreeNode(25);
    LeetCode530 solution = new LeetCode530();
    Assert.assertEquals(1, solution.getMinimumDifference(root));
  }

  @Test
  public void testOneNode() {
    TreeNode root = new TreeNode(10);
    LeetCode530 solution = new LeetCode530();
    Assert.assertEquals(Integer.MAX_VALUE, solution.getMinimumDifference(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode530 solution = new LeetCode530();
    Assert.assertEquals(Integer.MAX_VALUE, solution.getMinimumDifference(root));
  }
}
