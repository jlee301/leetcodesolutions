package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode437;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode437 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(2);
    root.left.left.left = new TreeNode(3);
    root.left.left.right = new TreeNode(-2);
    root.left.right.right = new TreeNode(1);
    root.right = new TreeNode(-3);
    root.right.right = new TreeNode(11);
    LeetCode437 solution = new LeetCode437();
    Assert.assertEquals(0, solution.pathSum(root, 0));
    Assert.assertEquals(2, solution.pathSum(root, 1));
    Assert.assertEquals(1, solution.pathSum(root, 2));
    Assert.assertEquals(3, solution.pathSum(root, 3));
    Assert.assertEquals(0, solution.pathSum(root, 4));
    Assert.assertEquals(1, solution.pathSum(root, 5));
    Assert.assertEquals(2, solution.pathSum(root, 6));
    Assert.assertEquals(2, solution.pathSum(root, 7));
    Assert.assertEquals(3, solution.pathSum(root, 8));
    Assert.assertEquals(0, solution.pathSum(root, 9));
    Assert.assertEquals(1, solution.pathSum(root, 10));
    Assert.assertEquals(1, solution.pathSum(root, 15));
    Assert.assertEquals(1, solution.pathSum(root, 16));
    Assert.assertEquals(3, solution.pathSum(root, 18));
    Assert.assertEquals(0, solution.pathSum(root, 55));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = null;
    LeetCode437 solution = new LeetCode437();
    Assert.assertEquals(0, solution.pathSum(root, 8));
  }
}
