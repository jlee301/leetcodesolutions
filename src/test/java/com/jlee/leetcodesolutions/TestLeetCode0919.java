package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0919;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0919 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    LeetCode0919 solution = new LeetCode0919(root);
    Assert.assertEquals(1, solution.insert(2));

    TreeNode result = solution.get_root();
    Assert.assertEquals(1, result.val);
    
    Assert.assertEquals(2, result.left.val);
    Assert.assertNull(result.right);
    
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    
    LeetCode0919 solution = new LeetCode0919(root);
    Assert.assertEquals(3, solution.insert(7));
    Assert.assertEquals(4, solution.insert(8));

    TreeNode result = solution.get_root();
    Assert.assertEquals(1, result.val);
    
    Assert.assertEquals(2, result.left.val);
    Assert.assertEquals(3, result.right.val);
    
    Assert.assertEquals(4, result.left.left.val);
    Assert.assertEquals(5, result.left.right.val);
    Assert.assertEquals(6, result.right.left.val);
    Assert.assertEquals(7, result.right.right.val);
    
    Assert.assertEquals(8, result.left.left.left.val);
    Assert.assertNull(result.left.left.right);
    Assert.assertNull(result.left.right.left);
    Assert.assertNull(result.left.right.right);
    Assert.assertNull(result.right.left.left);
    Assert.assertNull(result.right.left.right);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);

    Assert.assertNull(result.left.left.left.left);
    Assert.assertNull(result.left.left.left.right);
  }
}
