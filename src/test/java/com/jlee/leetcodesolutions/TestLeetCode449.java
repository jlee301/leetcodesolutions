package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode449;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode449 {
  @Test
  public void testOneLevel() {
    TreeNode root = new TreeNode(1);
    LeetCode449 solution = new LeetCode449();
    Assert.assertEquals("1,#,#,", solution.serialize(root));
    TreeNode result = solution.deserialize("1,#,#,");
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testTwoLevel() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode449 solution = new LeetCode449();
    Assert.assertEquals("1,2,#,#,3,#,#,", solution.serialize(root));
    TreeNode result = solution.deserialize("1,2,#,#,3,#,#,");
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.left.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertEquals(3, result.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }

  @Test
  public void testThreeLevel() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    LeetCode449 solution = new LeetCode449();
    Assert.assertEquals("1,2,4,#,#,5,#,#,3,6,#,#,7,#,#,", solution.serialize(root));
    TreeNode result = solution.deserialize("1,2,4,#,#,5,#,#,3,6,#,#,7,#,#,");
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.left.val);
    Assert.assertEquals(4, result.left.left.val);
    Assert.assertNull(result.left.left.left);
    Assert.assertNull(result.left.left.right);
    Assert.assertEquals(5, result.left.right.val);
    Assert.assertNull(result.left.right.left);
    Assert.assertNull(result.left.right.right);
    Assert.assertEquals(3, result.right.val);
    Assert.assertEquals(6, result.right.left.val);
    Assert.assertNull(result.right.left.left);
    Assert.assertNull(result.right.left.right);
    Assert.assertEquals(7, result.right.right.val);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode449 solution = new LeetCode449();
    Assert.assertEquals("#,", solution.serialize(root));
    TreeNode result = solution.deserialize("#,");
    Assert.assertNull(result);
  }
}
