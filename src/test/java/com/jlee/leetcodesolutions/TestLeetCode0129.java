package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0129;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0129 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode0129 solution = new LeetCode0129();
    Assert.assertEquals(25, solution.sumNumbers(root));
  }

  @Test
  public void testJustLeft() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    LeetCode0129 solution = new LeetCode0129();
    Assert.assertEquals(12, solution.sumNumbers(root));
  }

  @Test
  public void testJustRight() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
    LeetCode0129 solution = new LeetCode0129();
    Assert.assertEquals(13, solution.sumNumbers(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode0129 solution = new LeetCode0129();
    Assert.assertEquals(0, solution.sumNumbers(root));
  }
}
