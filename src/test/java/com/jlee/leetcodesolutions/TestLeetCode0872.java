package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0872;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0872 {
  @Test
  public void testProblemCase1() {
    TreeNode root1 = new TreeNode(3);
    root1.left = new TreeNode(5);
    root1.left.left = new TreeNode(6);
    root1.left.right = new TreeNode(2);
    root1.left.right.left = new TreeNode(7);
    root1.left.right.right = new TreeNode(4);
    root1.right = new TreeNode(1);
    root1.right.left = new TreeNode(9);
    root1.right.right = new TreeNode(8);
    
    TreeNode root2 = new TreeNode(3);
    root2.left = new TreeNode(5);
    root2.left.left = new TreeNode(6);
    root2.left.right = new TreeNode(7);
    root2.right = new TreeNode(1);
    root2.right.left = new TreeNode(4);
    root2.right.right = new TreeNode(2);
    root2.right.right.left = new TreeNode(9);
    root2.right.right.right = new TreeNode(8);
    
    LeetCode0872 solution = new LeetCode0872();
    Assert.assertTrue(solution.leafSimilar(root1, root2));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root1 = new TreeNode(3);
    root1.left = new TreeNode(5);
    root1.left.left = new TreeNode(6);
    root1.left.right = new TreeNode(2);
    root1.left.right.left = new TreeNode(7);
    root1.left.right.right = new TreeNode(4);
    root1.right = new TreeNode(1);
    root1.right.left = new TreeNode(9);
    root1.right.right = new TreeNode(8);
    
    TreeNode root2 = new TreeNode(3);
    root2.left = new TreeNode(5);
    
    LeetCode0872 solution = new LeetCode0872();
    Assert.assertFalse(solution.leafSimilar(root1, root2));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root1 = new TreeNode(3);
    root1.left = new TreeNode(5);
    root1.right = new TreeNode(1);
    
    TreeNode root2 = new TreeNode(3);
    root2.left = new TreeNode(5);
    root2.right = new TreeNode(2);
    
    LeetCode0872 solution = new LeetCode0872();
    Assert.assertFalse(solution.leafSimilar(root1, root2));
  }

  @Test
  public void testProblemCase4() {
    TreeNode root1 = new TreeNode(3);
    root1.right = new TreeNode(1);
    
    TreeNode root2 = new TreeNode(3);
    root2.right = new TreeNode(2);
    
    LeetCode0872 solution = new LeetCode0872();
    Assert.assertFalse(solution.leafSimilar(root1, root2));
  }
}
