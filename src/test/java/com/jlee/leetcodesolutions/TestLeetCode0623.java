package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0623;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0623 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(1);
    root.right = new TreeNode(6);
    root.right.left = new TreeNode(5);
    int v = 1, d = 2;
    LeetCode0623 solution = new LeetCode0623();
    TreeNode result = solution.addOneRow(root, v, d);

    // Level 1
    Assert.assertEquals(4, result.val);
    
    // Level 2
    Assert.assertEquals(1, result.left.val);
    Assert.assertEquals(1, result.right.val);

    // Level 3
    Assert.assertEquals(2, result.left.left.val);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right.left);
    Assert.assertEquals(6, result.right.right.val);

    // Level 4
    Assert.assertEquals(3, result.left.left.left.val);
    Assert.assertEquals(1, result.left.left.right.val);
    Assert.assertEquals(5, result.right.right.left.val);
    Assert.assertNull(result.right.right.right);

    // Level 5
    Assert.assertNull(result.left.left.left.left);
    Assert.assertNull(result.left.left.left.right);
    Assert.assertNull(result.left.left.right.left);
    Assert.assertNull(result.left.left.right.right);
    Assert.assertNull(result.right.right.left.left);
    Assert.assertNull(result.right.right.left.right);
  }
  
  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(1);
    int v = 1, d = 3;
    LeetCode0623 solution = new LeetCode0623();
    TreeNode result = solution.addOneRow(root, v, d);
    
    // Level 1
    Assert.assertEquals(4, result.val);
    
    // Level 2
    Assert.assertEquals(2, result.left.val);
    Assert.assertNull(result.right);
    
    // Level 3
    Assert.assertEquals(1, result.left.left.val);
    Assert.assertEquals(1, result.left.right.val);
    
    // Level 4
    Assert.assertEquals(3, result.left.left.left.val);
    Assert.assertNull(result.left.left.right);
    Assert.assertNull(result.left.right.left);
    Assert.assertEquals(1, result.left.right.right.val);
    
    // Level 5
    Assert.assertNull(result.left.left.left.left);
    Assert.assertNull(result.left.left.left.right);
    Assert.assertNull(result.left.right.right.left);
    Assert.assertNull(result.left.right.right.right);
  }
  
  @Test
  public void testOnRoot() {
    TreeNode root = new TreeNode(4);
    int v = 1, d = 1;
    LeetCode0623 solution = new LeetCode0623();
    TreeNode result = solution.addOneRow(root, v, d);
    
    // Level 1
    Assert.assertEquals(1, result.val);
    
    // Level 2
    Assert.assertEquals(4, result.left.val);
    Assert.assertNull(result.right);
    
    // Level 3
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
  }
}
