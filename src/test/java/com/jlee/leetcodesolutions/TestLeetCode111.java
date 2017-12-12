package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode111;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode111 {
  @Test
  public void testOneNode() {
    TreeNode root = new TreeNode(1);
    
    LeetCode111 solution = new LeetCode111();
    int result = solution.minDepth(root);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testTwoNodeLeft() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    
    LeetCode111 solution = new LeetCode111();
    int result = solution.minDepth(root);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testTwoNodeRight() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    
    LeetCode111 solution = new LeetCode111();
    int result = solution.minDepth(root);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testTwoNode() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    LeetCode111 solution = new LeetCode111();
    int result = solution.minDepth(root);
    Assert.assertEquals(2, result);
  }
  
  @Test
  public void testThreeNodeTwoLeft() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    
    LeetCode111 solution = new LeetCode111();
    int result = solution.minDepth(root);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testThreeNodeTwoRight() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    
    LeetCode111 solution = new LeetCode111();
    int result = solution.minDepth(root);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testThreeNodeTwoLeftOneRight() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(5);
    
    LeetCode111 solution = new LeetCode111();
    int result = solution.minDepth(root);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testThreeNodeOneLeftTwoRight() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);
    
    LeetCode111 solution = new LeetCode111();
    int result = solution.minDepth(root);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testThreeNode() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    
    LeetCode111 solution = new LeetCode111();
    int result = solution.minDepth(root);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testNull() {
    LeetCode111 solution = new LeetCode111();
    int result = solution.minDepth(null);
    Assert.assertEquals(0, result);
  }
 }
