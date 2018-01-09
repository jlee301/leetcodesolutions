package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode563;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode563 {
  @Test
  public void testJustRoot() {
    TreeNode root = new TreeNode(1);
    LeetCode563 solution = new LeetCode563();
    Assert.assertEquals(0, solution.findTilt(root));
  }

  @Test
  public void testRootLeft() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    LeetCode563 solution = new LeetCode563();
    Assert.assertEquals(2, solution.findTilt(root));
  }

  @Test
  public void testRootRight() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
    LeetCode563 solution = new LeetCode563();
    Assert.assertEquals(3, solution.findTilt(root));
  }

  @Test
  public void testRootLeftRight() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode563 solution = new LeetCode563();
    Assert.assertEquals(1, solution.findTilt(root));
  }

  @Test
  public void testThreeNodeLeft() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    LeetCode563 solution = new LeetCode563();
    Assert.assertEquals(2, solution.findTilt(root));
  }

  @Test
  public void testThreeNodeRight() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    LeetCode563 solution = new LeetCode563();
    Assert.assertEquals(2, solution.findTilt(root));
  }

  @Test
  public void testThreeNodeLeftRight() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    LeetCode563 solution = new LeetCode563();
    Assert.assertEquals(3, solution.findTilt(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode563 solution = new LeetCode563();
    Assert.assertEquals(0, solution.findTilt(root));
  }
}
