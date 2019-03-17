package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0543;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0543 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(3, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.right.left = new TreeNode(6);
    root.left.right.right = new TreeNode(7);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(4, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(4, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(5, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(5, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase6() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(9);
    root.right.right.right = new TreeNode(10);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(6, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase7() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(9);
    root.right.right.right = new TreeNode(10);
    root.right.right.left = new TreeNode(11);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(6, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase8() {
    TreeNode root = new TreeNode(1);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(0, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase9() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(1, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase10() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(1, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase11() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(2, solution.diameterOfBinaryTree(root));
  }

  @Test
  public void testProblemCase12() {
    TreeNode root = null;
    LeetCode0543 solution = new LeetCode0543();
    Assert.assertEquals(0, solution.diameterOfBinaryTree(root));
  }
}
