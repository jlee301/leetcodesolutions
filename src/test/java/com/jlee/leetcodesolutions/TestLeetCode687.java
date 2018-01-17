package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode687;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode687 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(4);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(1);
    root.right = new TreeNode(5);
    root.right.right = new TreeNode(5);
    LeetCode687 solution = new LeetCode687();
    Assert.assertEquals(2, solution.longestUnivaluePath(root));
  }
  
  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(4);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(5);
    root.right.right = new TreeNode(5);
    LeetCode687 solution = new LeetCode687();
    Assert.assertEquals(2, solution.longestUnivaluePath(root));
  }
  
  @Test
  public void testRoot() {
    TreeNode root = new TreeNode(1);
    LeetCode687 solution = new LeetCode687();
    Assert.assertEquals(0, solution.longestUnivaluePath(root));    
  }

  @Test
  public void testTwoLevelSame() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    LeetCode687 solution = new LeetCode687();
    Assert.assertEquals(2, solution.longestUnivaluePath(root));
  }
  
  @Test
  public void testTwoLevelRightDiff() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(2);
    LeetCode687 solution = new LeetCode687();
    Assert.assertEquals(1, solution.longestUnivaluePath(root));
  }
  
  @Test
  public void testTwoLevelAllDiff() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode687 solution = new LeetCode687();
    Assert.assertEquals(0, solution.longestUnivaluePath(root));
  }
  
  @Test
  public void testThreeLevelAllSame() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(5);
    root.right = new TreeNode(5);
    root.right.right = new TreeNode(5);
    LeetCode687 solution = new LeetCode687();
    Assert.assertEquals(4, solution.longestUnivaluePath(root));
  }
  
  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode687 solution = new LeetCode687();
    Assert.assertEquals(0, solution.longestUnivaluePath(root));    
  }
}
