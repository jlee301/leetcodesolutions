package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode404;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode404 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    
    LeetCode404 solution = new LeetCode404();
    Assert.assertEquals(24, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testOneNode() {
    TreeNode root = new TreeNode(3);
    
    LeetCode404 solution = new LeetCode404();
    Assert.assertEquals(0, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testTwoNodeLeft() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    
    LeetCode404 solution = new LeetCode404();
    Assert.assertEquals(9, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testTwoNodeRight() {
    TreeNode root = new TreeNode(3);
    root.right = new TreeNode(9);
    
    LeetCode404 solution = new LeetCode404();
    Assert.assertEquals(0, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testTwoNode() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    
    LeetCode404 solution = new LeetCode404();
    Assert.assertEquals(9, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testThreeNodeLeft() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(15);
    root.left.right = new TreeNode(7);
    root.right = new TreeNode(20);
    
    LeetCode404 solution = new LeetCode404();
    Assert.assertEquals(15, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testThreeNodeRight() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.right = new TreeNode(7);
    
    LeetCode404 solution = new LeetCode404();
    Assert.assertEquals(9, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testThreeNode() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(2);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    
    LeetCode404 solution = new LeetCode404();
    Assert.assertEquals(16, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    
    LeetCode404 solution = new LeetCode404();
    Assert.assertEquals(0, solution.sumOfLeftLeaves(root));
  }
}
