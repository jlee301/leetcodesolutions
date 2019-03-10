package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1008;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1008 {
  @Test
  public void testProblemCase1() {
    int[] preorder = {8,5,1,7,10,12};
    LeetCode1008 solution = new LeetCode1008();
    TreeNode result = solution.bstFromPreorder(preorder);
    Assert.assertEquals(8, result.val);
    
    Assert.assertEquals(5, result.left.val);
    Assert.assertEquals(10, result.right.val);
    
    Assert.assertEquals(1, result.left.left.val);
    Assert.assertEquals(7, result.left.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertEquals(12, result.right.right.val);
    
    Assert.assertNull(result.left.left.left);
    Assert.assertNull(result.left.left.right);
    Assert.assertNull(result.left.right.left);
    Assert.assertNull(result.left.right.right);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }
}
