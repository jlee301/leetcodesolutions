package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode104;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode104 {
  @Test
  public void testOneNode(){
    TreeNode root = new TreeNode(1);

    LeetCode104 solution = new LeetCode104();
    int result = solution.maxDepth(root);
    Assert.assertEquals(1, result);
  }

  public void testTwoNodeLeft(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);

    LeetCode104 solution = new LeetCode104();
    int result = solution.maxDepth(root);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testTwoNodeRight(){
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);

    LeetCode104 solution = new LeetCode104();
    int result = solution.maxDepth(root);
    Assert.assertEquals(2, result);
  }
  
  @Test
  public void testTwoNode(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    LeetCode104 solution = new LeetCode104();
    int result = solution.maxDepth(root);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testThreeNode(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);

    LeetCode104 solution = new LeetCode104();
    int result = solution.maxDepth(root);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testThreeNodeLeft(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);

    LeetCode104 solution = new LeetCode104();
    int result = solution.maxDepth(root);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testThreeNodeRight(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(7);

    LeetCode104 solution = new LeetCode104();
    int result = solution.maxDepth(root);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testAllLeft(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(4);
    root.left.left.left.left = new TreeNode(5);

    LeetCode104 solution = new LeetCode104();
    int result = solution.maxDepth(root);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testAllRight(){
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    root.right.right.right = new TreeNode(4);
    root.right.right.right.right = new TreeNode(5);

    LeetCode104 solution = new LeetCode104();
    int result = solution.maxDepth(root);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testNull(){
    LeetCode104 solution = new LeetCode104();
    int result = solution.maxDepth(null);
    Assert.assertEquals(0, result);
  }
}
