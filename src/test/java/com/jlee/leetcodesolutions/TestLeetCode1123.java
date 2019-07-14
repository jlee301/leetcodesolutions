package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1123;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1123 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    LeetCode1123 solution = new LeetCode1123();
    TreeNode result = solution.lcaDeepestLeaves(root);
    Assert.assertEquals(1, result.val);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    
    LeetCode1123 solution = new LeetCode1123();
    TreeNode result = solution.lcaDeepestLeaves(root);
    Assert.assertEquals(4, result.val);
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    
    LeetCode1123 solution = new LeetCode1123();
    TreeNode result = solution.lcaDeepestLeaves(root);
    Assert.assertEquals(2, result.val);
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(6);
    
    LeetCode1123 solution = new LeetCode1123();
    TreeNode result = solution.lcaDeepestLeaves(root);
    Assert.assertEquals(1, result.val);
  }
}
