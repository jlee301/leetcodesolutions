package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0508;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0508 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.right = new TreeNode(-3);
    LeetCode0508 solution = new LeetCode0508();
    Assert.assertArrayEquals(new int[] {2,-3,4}, solution.findFrequentTreeSum(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.right = new TreeNode(-5);
    LeetCode0508 solution = new LeetCode0508();
    Assert.assertArrayEquals(new int[] {2}, solution.findFrequentTreeSum(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode0508 solution = new LeetCode0508();
    Assert.assertArrayEquals(new int[] {}, solution.findFrequentTreeSum(root));
  }
}
