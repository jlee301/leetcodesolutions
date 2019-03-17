package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0222;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0222 {
  @Test
  public void testFullThreeLevel() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    LeetCode0222 solution = new LeetCode0222();
    Assert.assertEquals(7, solution.countNodes(root));
  }

  @Test
  public void testPartialThreeLevel1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    LeetCode0222 solution = new LeetCode0222();
    Assert.assertEquals(6, solution.countNodes(root));
  }

  @Test
  public void testPartialThreeLevel2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    LeetCode0222 solution = new LeetCode0222();
    Assert.assertEquals(5, solution.countNodes(root));
  }

  @Test
  public void testPartialThreeLevel3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    LeetCode0222 solution = new LeetCode0222();
    Assert.assertEquals(4, solution.countNodes(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode0222 solution = new LeetCode0222();
    Assert.assertEquals(0, solution.countNodes(root));
  }
}
