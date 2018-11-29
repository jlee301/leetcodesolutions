package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode110;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode110 {
  @Test
  public void testProblemCase1(){
    TreeNode root = new TreeNode(1);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase2(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase3(){
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase4(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase5(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase6(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.right = new TreeNode(4);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase7(){
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testProblemCase8(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testProblemCase9(){
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
  public void testProblemCase10(){
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(null);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase11(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(4);
    root.left.left.left.left = new TreeNode(5);
    root.right = new TreeNode(2);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertFalse(result);
  }  

  @Test
  public void testProblemCase12(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    root.right.right.right = new TreeNode(4);
    root.right.right.right.right = new TreeNode(5);
    
    LeetCode110 solution = new LeetCode110();
    boolean result = solution.isBalanced(root);
    Assert.assertFalse(result);
  }  
}
