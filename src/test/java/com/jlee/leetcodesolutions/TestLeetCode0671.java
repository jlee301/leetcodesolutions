package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0671;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0671 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(2);
    LeetCode0671 solution = new LeetCode0671();
    Assert.assertEquals(-1, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    LeetCode0671 solution = new LeetCode0671();
    Assert.assertEquals(-1, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    LeetCode0671 solution = new LeetCode0671();
    Assert.assertEquals(5, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);
    LeetCode0671 solution = new LeetCode0671();
    Assert.assertEquals(5, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(5);
    LeetCode0671 solution = new LeetCode0671();
    Assert.assertEquals(3, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testProblemCase6() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(5);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);
    LeetCode0671 solution = new LeetCode0671();
    Assert.assertEquals(3, solution.findSecondMinimumValue(root));
  }
}
