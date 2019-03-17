package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0404;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0404 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    
    LeetCode0404 solution = new LeetCode0404();
    Assert.assertEquals(24, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(3);
    
    LeetCode0404 solution = new LeetCode0404();
    Assert.assertEquals(0, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    
    LeetCode0404 solution = new LeetCode0404();
    Assert.assertEquals(9, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(3);
    root.right = new TreeNode(9);
    
    LeetCode0404 solution = new LeetCode0404();
    Assert.assertEquals(0, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    
    LeetCode0404 solution = new LeetCode0404();
    Assert.assertEquals(9, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testProblemCase6() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(15);
    root.left.right = new TreeNode(7);
    root.right = new TreeNode(20);
    
    LeetCode0404 solution = new LeetCode0404();
    Assert.assertEquals(15, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testProblemCase7() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.right = new TreeNode(7);
    
    LeetCode0404 solution = new LeetCode0404();
    Assert.assertEquals(9, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testProblemCase8() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(2);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    
    LeetCode0404 solution = new LeetCode0404();
    Assert.assertEquals(16, solution.sumOfLeftLeaves(root));
  }

  @Test
  public void testProblemCase9() {
    TreeNode root = null;
    
    LeetCode0404 solution = new LeetCode0404();
    Assert.assertEquals(0, solution.sumOfLeftLeaves(root));
  }
}
