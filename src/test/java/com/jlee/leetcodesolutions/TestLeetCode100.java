package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode100;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode100 {
  @Test
  public void testSameTree(){
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);
    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    q.right = new TreeNode(3);
    
    LeetCode100 solution = new LeetCode100();
    boolean result = solution.isSameTree(p, q);
    Assert.assertTrue(result);
  }

  @Test
  public void testDiffTree(){
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(1);
    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(1);
    q.right = new TreeNode(2);
    
    LeetCode100 solution = new LeetCode100();
    boolean result = solution.isSameTree(p, q);
    Assert.assertFalse(result);
  }

  @Test
  public void testLeftRightSame(){
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    TreeNode q = new TreeNode(1);
    q.right = new TreeNode(2);
    
    LeetCode100 solution = new LeetCode100();
    boolean result = solution.isSameTree(p, q);
    Assert.assertFalse(result);
  }

  @Test
  public void testRightLeftSame(){
    TreeNode p = new TreeNode(1);
    p.right = new TreeNode(2);
    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    
    LeetCode100 solution = new LeetCode100();
    boolean result = solution.isSameTree(p, q);
    Assert.assertFalse(result);
  }

  @Test
  public void testNullTrees(){
    LeetCode100 solution = new LeetCode100();
    boolean result = solution.isSameTree(null, null);
    Assert.assertTrue(result);
  }}