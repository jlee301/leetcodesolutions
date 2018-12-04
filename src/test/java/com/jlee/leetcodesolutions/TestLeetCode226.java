package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode226;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode226 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(7);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(9);
    
    LeetCode226 solution = new LeetCode226();
    TreeNode result = solution.invertTree(root);
    Assert.assertEquals(4, result.val);
    Assert.assertEquals(7, result.left.val);
    Assert.assertEquals(9, result.left.left.val);
    Assert.assertNull(result.left.left.left);
    Assert.assertNull(result.left.left.right);
    Assert.assertEquals(6, result.left.right.val);
    Assert.assertNull(result.left.right.left);
    Assert.assertNull(result.left.right.right);
    Assert.assertEquals(2, result.right.val);
    Assert.assertEquals(3, result.right.left.val);
    Assert.assertNull(result.right.left.left);
    Assert.assertNull(result.right.left.right);
    Assert.assertEquals(1, result.right.right.val);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(4);
    
    LeetCode226 solution = new LeetCode226();
    TreeNode result = solution.invertTree(root);
    Assert.assertEquals(4, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }
  
  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    
    LeetCode226 solution = new LeetCode226();
    TreeNode result = solution.invertTree(root);
    Assert.assertEquals(4, result.val);
    Assert.assertNull(result.left);
    Assert.assertEquals(2, result.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = null;
    
    LeetCode226 solution = new LeetCode226();
    TreeNode result = solution.invertTree(root);
    Assert.assertNull(result);
  }
}
