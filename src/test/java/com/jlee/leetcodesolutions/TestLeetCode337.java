package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode337;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode337 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(1);
    LeetCode337 solution = new LeetCode337();
    Assert.assertEquals(7, solution.rob(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(4);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(5);
    root.right.right = new TreeNode(1);
    LeetCode337 solution = new LeetCode337();
    Assert.assertEquals(9, solution.rob(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode337 solution = new LeetCode337();
    Assert.assertEquals(0, solution.rob(root));
  }
}
