package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0235 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(2);
    TreeNode q = new TreeNode(8);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(6, result.val);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(2);
    TreeNode q = new TreeNode(4);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(2, result.val);
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(0);
    TreeNode q = new TreeNode(5);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(2, result.val);
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(3);
    TreeNode q = new TreeNode(5);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(4, result.val);
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(4);
    TreeNode q = new TreeNode(3);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(4, result.val);
  }

  @Test
  public void testProblemCase6() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(7);
    TreeNode q = new TreeNode(9);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(8, result.val);
  }

  @Test
  public void testProblemCase7() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(8);
    TreeNode q = new TreeNode(9);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(8, result.val);
  }

  @Test
  public void testProblemCase8() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(8);
    TreeNode q = new TreeNode(7);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(8, result.val);
  }

  @Test
  public void testProblemCase9() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(6);
    TreeNode q = new TreeNode(7);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(6, result.val);
  }

  @Test
  public void testProblemCase10() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(6);
    TreeNode q = new TreeNode(7);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(6, result.val);
  }
  
  @Test
  public void testProblemCase11() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(8);
    TreeNode q = new TreeNode(6);
    
    LeetCode0235 solution = new LeetCode0235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(6, result.val);
  }
}
