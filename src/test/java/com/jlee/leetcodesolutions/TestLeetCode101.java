package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode101;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode101 {
  @Test
  public void testProblemCase1(){
    TreeNode root = new TreeNode(1);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase2(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase3(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase4(){
    TreeNode root = new TreeNode(1);
    root.left = null;
    root.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase5(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.right = null;

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase6(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase7(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(4);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testProblemCase8(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = null;
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testProblemCase9(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = null;
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testProblemCase10(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = null;
    root.right.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase11(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(4);
    root.right.right = null;

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase12(){
    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(null);
    Assert.assertTrue(result);
  }
}
