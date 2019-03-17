package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0124;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0124 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode0124 solution = new LeetCode0124();
    Assert.assertEquals(6, solution.maxPathSum(root));
  }  

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(-10);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    LeetCode0124 solution = new LeetCode0124();
    Assert.assertEquals(42, solution.maxPathSum(root));
  }  

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(1);
    root.right.right = new TreeNode(1);
    LeetCode0124 solution = new LeetCode0124();
    Assert.assertEquals(4, solution.maxPathSum(root));
  }  

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(-9);
    root.left = new TreeNode(-10);
    root.right = new TreeNode(-8);
    root.right.left = new TreeNode(-7);
    root.right.right = new TreeNode(-6);
    LeetCode0124 solution = new LeetCode0124();
    Assert.assertEquals(-6, solution.maxPathSum(root));
  }  
}
