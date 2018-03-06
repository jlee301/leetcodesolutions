package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode230;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode230 {
  @Test
  public void testOneLevel() {
    TreeNode root = new TreeNode(1);
    LeetCode230 solution = new LeetCode230();
    Assert.assertEquals(1, solution.kthSmallest(root, 1));
  }

  @Test
  public void testTwoLevel() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode230 solution = new LeetCode230();
    Assert.assertEquals(1, solution.kthSmallest(root, 1));
    Assert.assertEquals(2, solution.kthSmallest(root, 2));
    Assert.assertEquals(3, solution.kthSmallest(root, 3));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode230 solution = new LeetCode230();
    Assert.assertEquals(Integer.MAX_VALUE, solution.kthSmallest(root, 1));
  }
}
