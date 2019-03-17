package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0099;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0099 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.right = new TreeNode(2);
    LeetCode0099 solution = new LeetCode0099();
    solution.recoverTree(root);
    Assert.assertEquals(3, root.val);
    Assert.assertEquals(1, root.left.val);
    Assert.assertEquals(2, root.left.right.val);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(1);
    root.right = new TreeNode(4);
    root.right.left = new TreeNode(2);
    LeetCode0099 solution = new LeetCode0099();
    solution.recoverTree(root);
    Assert.assertEquals(2, root.val);
    Assert.assertEquals(1, root.left.val);
    Assert.assertEquals(4, root.right.val);
    Assert.assertEquals(3, root.right.left.val);
  }
}
