package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode965;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode965 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(1);
    root.right.right = new TreeNode(1);

    LeetCode965 solution = new LeetCode965();
    Assert.assertTrue(solution.isUnivalTree(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(2);
    
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    LeetCode965 solution = new LeetCode965();
    Assert.assertFalse(solution.isUnivalTree(root));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(1);
    root.right.right = new TreeNode(2);

    LeetCode965 solution = new LeetCode965();
    Assert.assertFalse(solution.isUnivalTree(root));
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = null;
    
    LeetCode965 solution = new LeetCode965();
    Assert.assertTrue(solution.isUnivalTree(root));
  }
}
