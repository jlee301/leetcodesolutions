package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0938;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0938 {
  @Test
  public void testProblemCase1() {
    int L = 7, R = 15;
    TreeNode root = new TreeNode(10);
    
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);
    
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right.right = new TreeNode(18);
    
    LeetCode0938 solution = new LeetCode0938();
    Assert.assertEquals(32, solution.rangeSumBST(root, L, R));
  }

  @Test
  public void testProblemCase2() {
    int L = 6, R = 10;
    TreeNode root = new TreeNode(10);
    
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);
    
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right.left = new TreeNode(13);
    root.right.right = new TreeNode(18);
    
    root.left.left.left = new TreeNode(1);
    root.left.right.left = new TreeNode(6);
    
    LeetCode0938 solution = new LeetCode0938();
    Assert.assertEquals(23, solution.rangeSumBST(root, L, R));
  }
}
