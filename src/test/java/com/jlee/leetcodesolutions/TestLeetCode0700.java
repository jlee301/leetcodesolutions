package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0700;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0700 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(4);

    root.left = new TreeNode(2);
    root.right = new TreeNode(7);
    
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    
    LeetCode0700 solution = new LeetCode0700();
    TreeNode result = solution.searchBST(root, 2);
    Assert.assertEquals(root.left, result);
    
    result = solution.searchBST(root, 5);
    Assert.assertNull(result);
    
    result = solution.searchBST(root, 7);
    Assert.assertEquals(root.right, result);
  }
}
