package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode114;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode114 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(5);
    root.right.right = new TreeNode(6);
    LeetCode114 solution = new LeetCode114();
    solution.flatten(root);
    Assert.assertEquals(1, root.val);
    Assert.assertNull(root.left);
    Assert.assertEquals(2, root.right.val);
    Assert.assertNull(root.right.left);
    Assert.assertEquals(3, root.right.right.val);
    Assert.assertNull(root.right.right.left);
    Assert.assertEquals(4, root.right.right.right.val);
    Assert.assertNull(root.right.right.right.left);
    Assert.assertEquals(5, root.right.right.right.right.val);
    Assert.assertNull(root.right.right.right.right.left);
    Assert.assertEquals(6, root.right.right.right.right.right.val);
    Assert.assertNull(root.right.right.right.right.right.left);
    Assert.assertNull(root.right.right.right.right.right.right);
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode114 solution = new LeetCode114();
    solution.flatten(root);
    Assert.assertNull(root);
  }
}
