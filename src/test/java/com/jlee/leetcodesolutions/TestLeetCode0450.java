package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0450;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0450 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(6);
    root.right.right = new TreeNode(7);
    int key = 3;
    LeetCode0450 solution = new LeetCode0450();
    TreeNode result = solution.deleteNode(root, key);
    Assert.assertEquals(5, result.val);
    Assert.assertEquals(4, result.left.val);
    Assert.assertEquals(2, result.left.left.val);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.left.left.left);
    Assert.assertNull(result.left.left.right);
    Assert.assertEquals(6, result.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertEquals(7, result.right.right.val);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }
  
  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(6);
    root.right.right = new TreeNode(7);
    int key = 6;
    LeetCode0450 solution = new LeetCode0450();
    TreeNode result = solution.deleteNode(root, key);
    Assert.assertEquals(5, result.val);
    Assert.assertEquals(3, result.left.val);
    Assert.assertEquals(2, result.left.left.val);
    Assert.assertNull(result.left.left.left);
    Assert.assertNull(result.left.left.right);
    Assert.assertEquals(4, result.left.right.val);
    Assert.assertNull(result.left.right.left);
    Assert.assertNull(result.left.right.right);
    Assert.assertEquals(7, result.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }
  
  @Test
  public void testTree1() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.right = new TreeNode(6);
    int key = 5;
    LeetCode0450 solution = new LeetCode0450();    
    TreeNode result = solution.deleteNode(root, key);
    Assert.assertEquals(6, result.val);
    Assert.assertEquals(3, result.left.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right);
  }

  @Test
  public void testTree2() {
    TreeNode root = new TreeNode(5);
    root.right = new TreeNode(6);
    int key = 5;
    LeetCode0450 solution = new LeetCode0450();    
    TreeNode result = solution.deleteNode(root, key);
    Assert.assertEquals(6, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testTree3() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    int key = 5;
    LeetCode0450 solution = new LeetCode0450();    
    TreeNode result = solution.deleteNode(root, key);
    Assert.assertEquals(3, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testTree4() {
    TreeNode root = new TreeNode(5);
    int key = 5;
    LeetCode0450 solution = new LeetCode0450();    
    TreeNode result = solution.deleteNode(root, key);
    Assert.assertNull(result);
  }

  @Test
  public void testKeyDoesNotExist() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.right = new TreeNode(6);
    int key = 1;
    LeetCode0450 solution = new LeetCode0450();    
    TreeNode result = solution.deleteNode(root, key);
    Assert.assertEquals(5, result.val);
    Assert.assertEquals(3, result.left.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertEquals(6, result.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }
  
  @Test
  public void testWrongAns() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    int key = 2;
    LeetCode0450 solution = new LeetCode0450();
    TreeNode result = solution.deleteNode(root, key);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    int key = 5;
    LeetCode0450 solution = new LeetCode0450();    
    TreeNode result = solution.deleteNode(root, key);
    Assert.assertNull(result);
  }
}
