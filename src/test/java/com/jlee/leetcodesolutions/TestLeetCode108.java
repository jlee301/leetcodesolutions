package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode108;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode108 {
  @Test
  public void testOneNode(){
    int[] nums = { 0 };
    LeetCode108 solution = new LeetCode108();
    TreeNode result = solution.sortedArrayToBST(nums);
    Assert.assertEquals(0, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testTwoNode(){
    int[] nums = { -1, 0, 1 };
    LeetCode108 solution = new LeetCode108();
    TreeNode result = solution.sortedArrayToBST(nums);
    Assert.assertEquals(0, result.val);
    Assert.assertEquals(-1, result.left.val);
    Assert.assertEquals(1, result.right.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }

  @Test
  public void testThreeNode(){
    int[] nums = { -2, -1, 0, 1, 2 };
    LeetCode108 solution = new LeetCode108();
    TreeNode result = solution.sortedArrayToBST(nums);
    Assert.assertEquals(0, result.val);
    Assert.assertEquals(-2, result.left.val);
    Assert.assertEquals(1, result.right.val);
    Assert.assertNull(result.left.left);
    Assert.assertEquals(-1, result.left.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertEquals(2, result.right.right.val);
  }

  @Test
  public void testRightDepthPlusOne(){
    int[] nums = { -2, -1, 0, 1 };
    LeetCode108 solution = new LeetCode108();
    TreeNode result = solution.sortedArrayToBST(nums);
    Assert.assertEquals(-1, result.val);
    Assert.assertEquals(-2, result.left.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertEquals(0, result.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertEquals(1, result.right.right.val);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }

  @Test
  public void testEmpty(){
    int[] nums = {};
    LeetCode108 solution = new LeetCode108();
    TreeNode result = solution.sortedArrayToBST(nums);
    Assert.assertNull(result);
  }

  @Test
  public void testNull(){
    LeetCode108 solution = new LeetCode108();
    TreeNode result = solution.sortedArrayToBST(null);
    Assert.assertNull(result);
  }
}