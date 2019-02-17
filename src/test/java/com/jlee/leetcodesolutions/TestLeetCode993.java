package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode993;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode993 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    root.left.left = new TreeNode(4);

    int x = 4, y = 3;

    LeetCode993 solution = new LeetCode993();
    Assert.assertFalse(solution.isCousins(root, x, y));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    root.left.right = new TreeNode(4);
    root.right.right = new TreeNode(5);

    int x = 5, y = 4;

    LeetCode993 solution = new LeetCode993();
    Assert.assertTrue(solution.isCousins(root, x, y));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    root.left.right = new TreeNode(4);

    int x = 2, y = 3;

    LeetCode993 solution = new LeetCode993();
    Assert.assertFalse(solution.isCousins(root, x, y));
  }
}
