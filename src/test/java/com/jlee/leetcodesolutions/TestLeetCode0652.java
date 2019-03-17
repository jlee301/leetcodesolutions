package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0652;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0652 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(2);
    root.right.left.left = new TreeNode(4);
    root.right.right = new TreeNode(4);
    LeetCode0652 solution = new LeetCode0652();
    List<TreeNode> result = solution.findDuplicateSubtrees(root);
    Assert.assertEquals(2, result.size());
    TreeNode node = result.get(0);
    Assert.assertEquals(4, node.val);
    Assert.assertNull(node.left);
    Assert.assertNull(node.right);;
    node = result.get(1);
    Assert.assertEquals(2, node.val);
    Assert.assertEquals(4, node.left.val);
    Assert.assertNull(node.left.left);
    Assert.assertNull(node.left.right);
    Assert.assertNull(node.right);
  }
}
