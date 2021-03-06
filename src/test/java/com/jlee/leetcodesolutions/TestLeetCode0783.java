package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0783;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0783 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(6);
    LeetCode0783 solution = new LeetCode0783();
    Assert.assertEquals(1, solution.minDiffInBST(root));
  }

  @Test
  public void testJustRoot() {
    TreeNode root = new TreeNode(4);
    LeetCode0783 solution = new LeetCode0783();
    Assert.assertEquals(Integer.MAX_VALUE, solution.minDiffInBST(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode0783 solution = new LeetCode0783();
    Assert.assertEquals(Integer.MAX_VALUE, solution.minDiffInBST(root));
  }
}
