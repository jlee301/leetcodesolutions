package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode110;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode110 {
  @Test
  public void testOneNode(){
    TreeNode root = new TreeNode(1);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testTwoNodeExtraLeft(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testTwoNodeExtraRight(){
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testTwoNode(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testThreeNodeTwoExtraLeft(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testThreeNodeOneExtraLeft(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.right = new TreeNode(4);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testThreeNodeTwoExtraRight(){
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testThreeNodeOneExtraRight(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testThreeNode(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(4);
    root.left.left = new TreeNode(5);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testNull(){
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(null);
    Assert.assertTrue(result);
  }
}