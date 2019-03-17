package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0654;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0654 {
  @Test
  public void testProblemCase() {
    int[] nums = {3,2,1,6,0,5};
    LeetCode0654 solution = new LeetCode0654();
    TreeNode result = solution.constructMaximumBinaryTree(nums);
    // Level 0
    Assert.assertEquals(6, result.val);
    
    // Level 1
    Assert.assertEquals(3, result.left.val);
    Assert.assertEquals(5, result.right.val);
    
    // Level 2
    Assert.assertNull(result.left.left);
    Assert.assertEquals(2, result.left.right.val);
    Assert.assertEquals(0, result.right.left.val);
    Assert.assertNull(result.right.right);
    
    // Level 3
    Assert.assertNull(result.left.right.left);
    Assert.assertEquals(1, result.left.right.right.val);
    Assert.assertNull(result.right.left.left);
    Assert.assertNull(result.right.left.right);

    // Level 4
    Assert.assertNull(result.left.right.right.left);
    Assert.assertNull(result.left.right.right.right);
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0654 solution = new LeetCode0654();
    TreeNode result = solution.constructMaximumBinaryTree(nums);
    Assert.assertNull(result);
  }
}
