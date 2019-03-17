package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0111;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0111 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    
    LeetCode0111 solution = new LeetCode0111();
    int result = solution.minDepth(root);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    
    LeetCode0111 solution = new LeetCode0111();
    int result = solution.minDepth(root);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    
    LeetCode0111 solution = new LeetCode0111();
    int result = solution.minDepth(root);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    LeetCode0111 solution = new LeetCode0111();
    int result = solution.minDepth(root);
    Assert.assertEquals(2, result);
  }
  
  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    
    LeetCode0111 solution = new LeetCode0111();
    int result = solution.minDepth(root);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase6() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    
    LeetCode0111 solution = new LeetCode0111();
    int result = solution.minDepth(root);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase7() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(5);
    
    LeetCode0111 solution = new LeetCode0111();
    int result = solution.minDepth(root);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase8() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);
    
    LeetCode0111 solution = new LeetCode0111();
    int result = solution.minDepth(root);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase9() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    
    LeetCode0111 solution = new LeetCode0111();
    int result = solution.minDepth(root);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase10() {
    LeetCode0111 solution = new LeetCode0111();
    int result = solution.minDepth(null);
    Assert.assertEquals(0, result);
  }
 }
