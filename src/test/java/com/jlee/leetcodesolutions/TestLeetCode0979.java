package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0979;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0979 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(0);
    root.right = new TreeNode(0);
    LeetCode0979 solution = new LeetCode0979();
    Assert.assertEquals(2, solution.distributeCoins(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(3);
    root.right = new TreeNode(0);
    LeetCode0979 solution = new LeetCode0979();
    Assert.assertEquals(3, solution.distributeCoins(root));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(2);
    LeetCode0979 solution = new LeetCode0979();
    Assert.assertEquals(2, solution.distributeCoins(root));
  }
  
  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(0);
    root.left.right = new TreeNode(3);
    LeetCode0979 solution = new LeetCode0979();
    Assert.assertEquals(4, solution.distributeCoins(root));
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    LeetCode0979 solution = new LeetCode0979();
    Assert.assertEquals(0, solution.distributeCoins(root));
  }
}
