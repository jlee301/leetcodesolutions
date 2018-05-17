package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode814;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode814 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(1);
    LeetCode814 solution = new LeetCode814();
    TreeNode result = solution.pruneTree(root);
    // level 0
    Assert.assertEquals(1, result.val);
    
    // level 1
    Assert.assertNull(result.left);
    Assert.assertEquals(0, result.right.val);
    
    // level 2
    Assert.assertNull(result.right.left);
    Assert.assertEquals(1, result.right.right.val);
    
    // level 3
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }
  
  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(0);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(1);
    LeetCode814 solution = new LeetCode814();
    TreeNode result = solution.pruneTree(root);
    // level 0
    Assert.assertEquals(1, result.val);
    
    // level 1
    Assert.assertNull(result.left);
    Assert.assertEquals(1, result.right.val);
    
    // level 2
    Assert.assertNull(result.right.left);
    Assert.assertEquals(1, result.right.right.val);
    
    // level 3
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.left.left.left = new TreeNode(0);
    root.left.right = new TreeNode(1);
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(1);
    LeetCode814 solution = new LeetCode814();
    TreeNode result = solution.pruneTree(root);
    // level 0
    Assert.assertEquals(1, result.val);
    
    // level 1
    Assert.assertEquals(1, result.left.val);
    Assert.assertEquals(0, result.right.val);
    
    // level 2
    Assert.assertEquals(1, result.left.left.val);
    Assert.assertEquals(1, result.left.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertEquals(1, result.right.right.val);

    // level 3
    Assert.assertNull(result.left.left.left);
    Assert.assertNull(result.left.left.right);
    Assert.assertNull(result.left.right.left);
    Assert.assertNull(result.left.right.right);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }
  
  @Test
  public void testBaseCase1() {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(1);
    LeetCode814 solution = new LeetCode814();
    TreeNode result = solution.pruneTree(root);
    // level 0
    Assert.assertEquals(0, result.val);
    
    // level 1
    Assert.assertEquals(1, result.left.val);
    Assert.assertNull(result.right);
    
    // level 2
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
  }

  @Test
  public void testBaseCase2() {
    TreeNode root = new TreeNode(0);
    root.right = new TreeNode(1);
    LeetCode814 solution = new LeetCode814();
    TreeNode result = solution.pruneTree(root);
    // level 0
    Assert.assertEquals(0, result.val);
    
    // level 1
    Assert.assertNull(result.left);
    Assert.assertEquals(1, result.right.val);
    
    // level 2
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }
}
