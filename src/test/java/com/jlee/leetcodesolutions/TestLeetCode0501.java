package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0501;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0501 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(2);
    LeetCode0501 solution = new LeetCode0501();
    int[] result = solution.findMode(root);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(2, result[0]);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(3);
    LeetCode0501 solution = new LeetCode0501();
    int[] result = solution.findMode(root);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(3, result[0]);
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(3);
    LeetCode0501 solution = new LeetCode0501();
    int[] result = solution.findMode(root);
    Assert.assertEquals(2, result.length);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode0501 solution = new LeetCode0501();
    int[] result = solution.findMode(root);
    Assert.assertEquals(3, result.length);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
    Assert.assertEquals(3, result[2]);
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = null;
    LeetCode0501 solution = new LeetCode0501();
    int[] result = solution.findMode(root);
    Assert.assertEquals(0, result.length);
  }
}
