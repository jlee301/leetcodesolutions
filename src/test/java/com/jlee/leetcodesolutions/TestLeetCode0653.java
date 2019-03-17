package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0653;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0653 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(5);
    int k = 5;
    LeetCode0653 solution = new LeetCode0653();
    Assert.assertFalse(solution.findTarget(root, k));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.right = new TreeNode(6);
    int k = 8;
    LeetCode0653 solution = new LeetCode0653();
    Assert.assertTrue(solution.findTarget(root, k));
    k = 11;
    Assert.assertTrue(solution.findTarget(root, k));
    k = 20;
    Assert.assertFalse(solution.findTarget(root, k));    
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(4);
    root.right = new TreeNode(5);
    int k = 10;
    LeetCode0653 solution = new LeetCode0653();
    Assert.assertTrue(solution.findTarget(root, k));
    k = 9;
    Assert.assertTrue(solution.findTarget(root, k));
    k = 20;
    Assert.assertFalse(solution.findTarget(root, k));    
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(6);
    root.right.right = new TreeNode(7);
    int k = 9;
    LeetCode0653 solution = new LeetCode0653();
    Assert.assertTrue(solution.findTarget(root, k));
    k = 5;
    Assert.assertTrue(solution.findTarget(root, k));
    k = 6;
    Assert.assertTrue(solution.findTarget(root, k));
    k = 7;
    Assert.assertTrue(solution.findTarget(root, k));
    k = 8;
    Assert.assertTrue(solution.findTarget(root, k));
    k = 10;
    Assert.assertTrue(solution.findTarget(root, k));
    k = 11;
    Assert.assertTrue(solution.findTarget(root, k));
    k = 12;
    Assert.assertTrue(solution.findTarget(root, k));
    k = 20;
    Assert.assertFalse(solution.findTarget(root, k));
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(-5);
    root.right = new TreeNode(10);
    int k = 0;
    LeetCode0653 solution = new LeetCode0653();
    Assert.assertTrue(solution.findTarget(root, k));
    k = 15;
    Assert.assertTrue(solution.findTarget(root, k));
  }

  @Test
  public void testProblemCase6() {
    TreeNode root = new TreeNode(-5);
    root.left = new TreeNode(-10);
    root.right = new TreeNode(10);
    int k = -15;
    LeetCode0653 solution = new LeetCode0653();
    Assert.assertTrue(solution.findTarget(root, k));
    k = 5;
    Assert.assertTrue(solution.findTarget(root, k));
  }

  @Test
  public void testProblemCase7() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    int k = 1;
    LeetCode0653 solution = new LeetCode0653();
    Assert.assertFalse(solution.findTarget(root, k));
    k = 2;
    Assert.assertTrue(solution.findTarget(root, k));
  }

  @Test
  public void testProblemCase8() {
    TreeNode root = null;
    int k = 1;
    LeetCode0653 solution = new LeetCode0653();
    Assert.assertFalse(solution.findTarget(root, k));
  }
}
