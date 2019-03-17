package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0095;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0095 {
  @Test
  public void testProblemCase() {
    int n = 3;
    LeetCode0095 solution = new LeetCode0095();
    List<TreeNode> result = solution.generateTrees(n);
    Assert.assertEquals(5, result.size());

    TreeNode node = result.get(0);
    Assert.assertEquals(1, node.val);
    Assert.assertNull(node.left);
    Assert.assertEquals(2, node.right.val);
    Assert.assertNull(node.right.left);
    Assert.assertEquals(3, node.right.right.val);
    Assert.assertNull(node.right.right.left);
    Assert.assertNull(node.right.right.right);

    node = result.get(1);
    Assert.assertEquals(1, node.val);
    Assert.assertNull(node.left);
    Assert.assertEquals(3, node.right.val);
    Assert.assertEquals(2, node.right.left.val);
    Assert.assertNull(node.right.right);
    Assert.assertNull(node.right.left.left);
    Assert.assertNull(node.right.left.right);
    
    node = result.get(2);
    Assert.assertEquals(2, node.val);
    Assert.assertEquals(1, node.left.val);
    Assert.assertNull(node.left.left);
    Assert.assertNull(node.left.right);
    Assert.assertEquals(3, node.right.val);
    Assert.assertNull(node.right.left);
    Assert.assertNull(node.right.right);

    node = result.get(3);
    Assert.assertEquals(3, node.val);
    Assert.assertEquals(1, node.left.val);
    Assert.assertNull(node.left.left);
    Assert.assertEquals(2, node.left.right.val);
    Assert.assertNull(node.left.right.left);
    Assert.assertNull(node.left.right.right);
    Assert.assertNull(node.right);

    node = result.get(4);
    Assert.assertEquals(3, node.val);
    Assert.assertEquals(2, node.left.val);
    Assert.assertNull(node.left.right);
    Assert.assertEquals(1, node.left.left.val);
    Assert.assertNull(node.left.left.left);
    Assert.assertNull(node.left.left.right);
    Assert.assertNull(node.right);
  }

  @Test
  public void testN0() {
    int n = 0;
    LeetCode0095 solution = new LeetCode0095();
    List<TreeNode> result = solution.generateTrees(n);
    Assert.assertEquals(0, result.size());
  }
}
