package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode662;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode662 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(9);
    LeetCode662 solution = new LeetCode662();
    Assert.assertEquals(4, solution.widthOfBinaryTree(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(3);
    LeetCode662 solution = new LeetCode662();
    Assert.assertEquals(2, solution.widthOfBinaryTree(root));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(5);
    root.right = new TreeNode(2);
    LeetCode662 solution = new LeetCode662();
    Assert.assertEquals(2, solution.widthOfBinaryTree(root));
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(9);
    root.right.right.right = new TreeNode(7);
    LeetCode662 solution = new LeetCode662();
    Assert.assertEquals(8, solution.widthOfBinaryTree(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode662 solution = new LeetCode662();
    Assert.assertEquals(0, solution.widthOfBinaryTree(root));
  }
}
