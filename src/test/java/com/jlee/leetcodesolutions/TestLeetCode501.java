package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode501;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode501 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(2);
    LeetCode501 solution = new LeetCode501();
    int[] result = solution.findMode(root);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(2, result[0]);
  }

  @Test
  public void testMoreFrequencyThanOther() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(3);
    LeetCode501 solution = new LeetCode501();
    int[] result = solution.findMode(root);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(3, result[0]);
  }

  @Test
  public void testMultipleHighFrequencySame() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(3);
    LeetCode501 solution = new LeetCode501();
    int[] result = solution.findMode(root);
    Assert.assertEquals(2, result.length);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testNoDupes() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode501 solution = new LeetCode501();
    int[] result = solution.findMode(root);
    Assert.assertEquals(3, result.length);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
    Assert.assertEquals(3, result[2]);
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode501 solution = new LeetCode501();
    int[] result = solution.findMode(root);
    Assert.assertEquals(0, result.length);
  }
}
