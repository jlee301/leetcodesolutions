package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0100;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0100 {
  @Test
  public void testProblemCase1(){
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);
    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    q.right = new TreeNode(3);
    
    LeetCode0100 solution = new LeetCode0100();
    boolean result = solution.isSameTree(p, q);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase2(){
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(1);
    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(1);
    q.right = new TreeNode(2);
    
    LeetCode0100 solution = new LeetCode0100();
    boolean result = solution.isSameTree(p, q);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase3(){
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    TreeNode q = new TreeNode(1);
    q.right = new TreeNode(2);
    
    LeetCode0100 solution = new LeetCode0100();
    boolean result = solution.isSameTree(p, q);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase4(){
    TreeNode p = new TreeNode(1);
    p.right = new TreeNode(2);
    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    
    LeetCode0100 solution = new LeetCode0100();
    boolean result = solution.isSameTree(p, q);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase5(){
    LeetCode0100 solution = new LeetCode0100();
    boolean result = solution.isSameTree(null, null);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase6(){
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(3);
    
    LeetCode0100 solution = new LeetCode0100();
    boolean result = solution.isSameTree(p, q);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase7(){
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);
    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    q.right = new TreeNode(4);
    
    LeetCode0100 solution = new LeetCode0100();
    boolean result = solution.isSameTree(p, q);
    Assert.assertFalse(result);
  }
}
