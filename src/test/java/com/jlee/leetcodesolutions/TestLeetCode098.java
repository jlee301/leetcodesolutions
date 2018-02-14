package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode098;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode098 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    LeetCode098 solution = new LeetCode098();
    Assert.assertTrue(solution.isValidBST(root));
  }

  @Test
  public void testInvalidMin() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(4);
    root.right = new TreeNode(3);
    LeetCode098 solution = new LeetCode098();
    Assert.assertFalse(solution.isValidBST(root));
  }

  @Test
  public void testInvalidMax() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(0);
    LeetCode098 solution = new LeetCode098();
    Assert.assertFalse(solution.isValidBST(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode098 solution = new LeetCode098();
    Assert.assertTrue(solution.isValidBST(root));
  }
}
