package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode998;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode998 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(4);
    
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    
    root.right.left = new TreeNode(2);
    
    int val = 5;
    
    LeetCode998 solution = new LeetCode998();
    TreeNode result = solution.insertIntoMaxTree(root, val);
    
    Assert.assertEquals(5, result.val);
    
    Assert.assertEquals(4, result.left.val);
    Assert.assertNull(result.right);
    
    Assert.assertEquals(1,  result.left.left.val);
    Assert.assertEquals(3,  result.left.right.val);
    
    Assert.assertEquals(2, result.left.right.left.val);
    Assert.assertNull(result.left.right.right);    
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(5);
    
    root.left = new TreeNode(2);
    root.right = new TreeNode(4);
    
    root.left.right = new TreeNode(1);
    
    int val = 3;
    
    LeetCode998 solution = new LeetCode998();
    TreeNode result = solution.insertIntoMaxTree(root, val);
    
    Assert.assertEquals(5, result.val);
    
    Assert.assertEquals(2, result.left.val);
    Assert.assertEquals(4, result.right.val);
    
    Assert.assertNull(result.left.left);
    Assert.assertEquals(1, result.left.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertEquals(3, result.right.right.val);
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(5);
    
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    root.left.right = new TreeNode(1);
    
    int val = 4;
    
    LeetCode998 solution = new LeetCode998();
    TreeNode result = solution.insertIntoMaxTree(root, val);
    
    Assert.assertEquals(5, result.val);
    
    Assert.assertEquals(2, result.left.val);
    Assert.assertEquals(4, result.right.val);
    
    Assert.assertNull(result.left.left);
    Assert.assertEquals(1, result.left.right.val);
    Assert.assertEquals(3, result.right.left.val);
    Assert.assertNull(result.right.right);
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = null;    
    int val = 4;
    
    LeetCode998 solution = new LeetCode998();
    TreeNode result = solution.insertIntoMaxTree(root, val);
    
    Assert.assertEquals(4, result.val);
    
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }
}
