package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0530;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0530 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(2);
    LeetCode0530 solution = new LeetCode0530();
    Assert.assertEquals(1, solution.getMinimumDifference(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(6);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(9);
    LeetCode0530 solution = new LeetCode0530();
    Assert.assertEquals(1, solution.getMinimumDifference(root));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(6);
    root.left.left = new TreeNode(2);
    LeetCode0530 solution = new LeetCode0530();
    Assert.assertEquals(4, solution.getMinimumDifference(root));
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(6);
    LeetCode0530 solution = new LeetCode0530();
    Assert.assertEquals(4, solution.getMinimumDifference(root));
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(6);
    root.right = new TreeNode(12);
    LeetCode0530 solution = new LeetCode0530();
    Assert.assertEquals(2, solution.getMinimumDifference(root));
  }

  @Test
  public void testProblemCase6() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(6);
    root.right = new TreeNode(12);
    root.right.left = new TreeNode(11);
    root.right.right = new TreeNode(25);
    LeetCode0530 solution = new LeetCode0530();
    Assert.assertEquals(1, solution.getMinimumDifference(root));
  }

  @Test
  public void testProblemCase7() {
    TreeNode root = new TreeNode(10);
    LeetCode0530 solution = new LeetCode0530();
    Assert.assertEquals(Integer.MAX_VALUE, solution.getMinimumDifference(root));
  }

  @Test
  public void testProblemCase8() {
    TreeNode root = null;
    LeetCode0530 solution = new LeetCode0530();
    Assert.assertEquals(Integer.MAX_VALUE, solution.getMinimumDifference(root));
  }
}
