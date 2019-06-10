package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1080;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1080 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(-99);
    root.right.left = new TreeNode(-99);
    root.right.right = new TreeNode(7);
    
    root.left.left.left = new TreeNode(8);
    root.left.left.right = new TreeNode(9);
    root.left.right.left = new TreeNode(-99);
    root.left.right.right = new TreeNode(-99);
    root.right.left.left = new TreeNode(12);
    root.right.left.right = new TreeNode(13);
    root.right.right.left = new TreeNode(-99);
    root.right.right.right = new TreeNode(14);
    
    int limit = 1;
    LeetCode1080 solution = new LeetCode1080();
    TreeNode result = solution.sufficientSubset(root, limit);
    Assert.assertEquals(1, result.val);
    
    Assert.assertEquals(2, result.left.val);
    Assert.assertEquals(3, result.right.val);
    
    Assert.assertEquals(4, result.left.left.val);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right.left);
    Assert.assertEquals(7, result.right.right.val);
    
    Assert.assertEquals(8, result.left.left.left.val);
    Assert.assertEquals(9, result.left.left.right.val);
    Assert.assertNull(root.right.right.left);
    Assert.assertEquals(14, result.right.right.right.val);
  }
  
  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(5);
    
    root.left = new TreeNode(4);
    root.right = new TreeNode(8);
    
    root.left.left = new TreeNode(11);
    root.right.left = new TreeNode(17);
    root.right.right = new TreeNode(4);
    
    root.left.left.left = new TreeNode(7);
    root.left.left.right = new TreeNode(1);
    root.right.right.left = new TreeNode(5);
    root.right.right.right = new TreeNode(3);
    
    int limit = 22;
    LeetCode1080 solution = new LeetCode1080();
    TreeNode result = solution.sufficientSubset(root, limit);
    Assert.assertEquals(5, result.val);
    
    Assert.assertEquals(4, result.left.val);
    Assert.assertEquals(8, result.right.val);
    
    Assert.assertEquals(11, result.left.left.val);
    Assert.assertEquals(17, result.right.left.val);
    Assert.assertEquals(4, result.right.right.val);
    
    Assert.assertEquals(7, result.left.left.left.val);
    Assert.assertNull(result.left.left.right);
    Assert.assertEquals(5, result.right.right.left.val);
    Assert.assertNull(result.right.right.right);
  }
  
  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.right = new TreeNode(10);
    int limit = 21;
    LeetCode1080 solution = new LeetCode1080();
    TreeNode result = solution.sufficientSubset(root, limit);
    Assert.assertNull(result);
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(-3);
    root.right = new TreeNode(-3);
    int limit = 2;
    LeetCode1080 solution = new LeetCode1080();
    TreeNode result = solution.sufficientSubset(root, limit);
    Assert.assertNull(result);
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(3);
    root.right = new TreeNode(-3);
    int limit = 2;
    LeetCode1080 solution = new LeetCode1080();
    TreeNode result = solution.sufficientSubset(root, limit);
    Assert.assertNull(result);
  }
}
