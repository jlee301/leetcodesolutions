package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode889;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode889 {
  @Test
  public void testProblemCase1() {
    int[] pre = {1,2,4,5,3,6,7}, post = {4,5,2,6,7,3,1};
    LeetCode889 solution = new LeetCode889();
    TreeNode result = solution.constructFromPrePost(pre, post);
    Assert.assertEquals(result.val, 1);

    Assert.assertEquals(result.left.val, 2);
    Assert.assertEquals(result.right.val, 3);
    
    Assert.assertEquals(result.left.left.val, 4);
    Assert.assertEquals(result.left.right.val, 5);
    Assert.assertEquals(result.right.left.val, 6);
    Assert.assertEquals(result.right.right.val, 7);
    
    Assert.assertNull(result.left.left.left);
    Assert.assertNull(result.left.left.right);
    Assert.assertNull(result.left.right.left);
    Assert.assertNull(result.left.right.right);

    Assert.assertNull(result.right.left.left);
    Assert.assertNull(result.right.left.right);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }

  @Test
  public void testProblemCase2() {
    int[] pre = {}, post = {};
    LeetCode889 solution = new LeetCode889();
    TreeNode result = solution.constructFromPrePost(pre, post);
    Assert.assertNull(result);
  }
}
