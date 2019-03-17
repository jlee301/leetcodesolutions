package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0297;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0297 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);
    
    LeetCode0297 solution = new LeetCode0297();
    String result = solution.serialize(root);
    // System.out.println(result);
    TreeNode node = solution.deserialize(result);
    Assert.assertEquals(1, node.val);
    
    Assert.assertEquals(2, node.left.val);
    Assert.assertEquals(3, root.right.val);
    
    Assert.assertNull(node.left.left);
    Assert.assertNull(node.left.right);
    Assert.assertEquals(4, node.right.left.val);
    Assert.assertEquals(5, node.right.right.val);
    
    Assert.assertNull(node.right.left.left);
    Assert.assertNull(node.right.left.right);
    Assert.assertNull(node.right.right.left);
    Assert.assertNull(node.right.right.right);
  }
}
