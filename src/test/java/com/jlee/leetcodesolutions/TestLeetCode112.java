package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode112;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode112 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    
    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 1);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    
    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 2);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 3);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 1);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 3);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase6() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 1);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase7() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 3);
    Assert.assertTrue(result);
    result = solution.hasPathSum(root, 4);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase8() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 1);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase9() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(4);
    root.left.left = new TreeNode(11);
    root.left.left.left = new TreeNode(7);
    root.left.left.right = new TreeNode(2);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(13);
    root.right.right = new TreeNode(4);
    root.right.right.right = new TreeNode(1);

    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(root, 22);
    Assert.assertTrue(result);
    result = solution.hasPathSum(root, 27);
    Assert.assertTrue(result);
    result = solution.hasPathSum(root, 26);
    Assert.assertTrue(result);
    result = solution.hasPathSum(root, 18);
    Assert.assertTrue(result);
    result = solution.hasPathSum(root, 17);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testProblemCase10() {
    LeetCode112 solution = new LeetCode112();
    boolean result = solution.hasPathSum(null, 0);
    Assert.assertFalse(result);
  }
}
