package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.BSTIterator;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode173 {
  @Test
  public void testOneLevel() {
    TreeNode root = new TreeNode(5);
    int[] nums = {5};
    BSTIterator iter = new BSTIterator(root);
    for(int num : nums) {
      Assert.assertTrue(iter.hasNext());
      Assert.assertEquals(num, iter.next());
    }
    Assert.assertFalse(iter.hasNext());
  }

  @Test
  public void testTwoLevel() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.right = new TreeNode(7);
    int[] nums = {3,5,7};
    BSTIterator iter = new BSTIterator(root);
    for(int num : nums) {
      Assert.assertTrue(iter.hasNext());
      Assert.assertEquals(num, iter.next());
    }
    Assert.assertFalse(iter.hasNext());
  }

  @Test
  public void testThreeLevel() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(7);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(8);
    int[] nums = {1,3,4,5,6,7,8};
    BSTIterator iter = new BSTIterator(root);
    for(int num : nums) {
      Assert.assertTrue(iter.hasNext());
      Assert.assertEquals(num, iter.next());
    }
    Assert.assertFalse(iter.hasNext());
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    BSTIterator iter = new BSTIterator(root);
    Assert.assertFalse(iter.hasNext());
  }
}
