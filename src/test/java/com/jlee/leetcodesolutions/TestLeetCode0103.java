package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0103;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0103 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    LeetCode0103 solution = new LeetCode0103();
    List<List<Integer>> result = solution.zigzagLevelOrder(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals(3, (int) result.get(0).get(0));
    Assert.assertEquals(2, result.get(1).size());
    Assert.assertEquals(20, (int) result.get(1).get(0));
    Assert.assertEquals(9, (int) result.get(1).get(1));
    Assert.assertEquals(2, result.get(2).size());
    Assert.assertEquals(15, (int) result.get(2).get(0));
    Assert.assertEquals(7, (int) result.get(2).get(1));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode0103 solution = new LeetCode0103();
    List<List<Integer>> result = solution.zigzagLevelOrder(root);
    Assert.assertEquals(0, result.size());
  }
}
