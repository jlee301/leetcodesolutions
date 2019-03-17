package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0958;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0958 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    LeetCode0958 solution = new LeetCode0958();
    Assert.assertTrue(solution.isCompleteTree(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(7);
    LeetCode0958 solution = new LeetCode0958();
    Assert.assertFalse(solution.isCompleteTree(root));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.right.right = new TreeNode(6);
    LeetCode0958 solution = new LeetCode0958();
    Assert.assertFalse(solution.isCompleteTree(root));
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    LeetCode0958 solution = new LeetCode0958();
    Assert.assertFalse(solution.isCompleteTree(root));
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(1);
    LeetCode0958 solution = new LeetCode0958();
    Assert.assertTrue(solution.isCompleteTree(root));
  }

  @Test
  public void testProblemCase6() {
    TreeNode root = null;
    LeetCode0958 solution = new LeetCode0958();
    Assert.assertTrue(solution.isCompleteTree(root));
  }
}
