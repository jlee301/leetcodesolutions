package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0108;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0108 {
  @Test
  public void testProblemCase1(){
    int[] nums = { 0 };
    LeetCode0108 solution = new LeetCode0108();
    TreeNode result = solution.sortedArrayToBST(nums);
    Assert.assertEquals(0, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testProblemCase2(){
    int[] nums = { -1, 0, 1 };
    LeetCode0108 solution = new LeetCode0108();
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
  public void testProblemCase3(){
    int[] nums = { -2, -1, 0, 1, 2 };
    LeetCode0108 solution = new LeetCode0108();
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
  public void testProblemCase4(){
    int[] nums = { -2, -1, 0, 1 };
    LeetCode0108 solution = new LeetCode0108();
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
  public void testProblemCase5(){
    int[] nums = {};
    LeetCode0108 solution = new LeetCode0108();
    TreeNode result = solution.sortedArrayToBST(nums);
    Assert.assertNull(result);
  }
}
