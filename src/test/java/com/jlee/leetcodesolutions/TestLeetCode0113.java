package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0113;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0113 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(4);
    root.left.left = new TreeNode(11);
    root.left.left.left = new TreeNode(7);
    root.left.left.right = new TreeNode(2);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(13);
    root.right.right = new TreeNode(4);
    root.right.right.left = new TreeNode(5);
    root.right.right.right = new TreeNode(1);
    int sum = 22;
    LeetCode0113 solution = new LeetCode0113();
    List<List<Integer>> result = solution.pathSum(root, sum);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(4, result.get(0).size());
    Assert.assertEquals(5, (int) result.get(0).get(0));
    Assert.assertEquals(4, (int) result.get(0).get(1));
    Assert.assertEquals(11, (int) result.get(0).get(2));
    Assert.assertEquals(2, (int) result.get(0).get(3));
    Assert.assertEquals(4, result.get(1).size());
    Assert.assertEquals(5, (int) result.get(1).get(0));
    Assert.assertEquals(8, (int) result.get(1).get(1));
    Assert.assertEquals(4, (int) result.get(1).get(2));
    Assert.assertEquals(5, (int) result.get(1).get(3));
  }

  @Test
  public void testNoRightTree() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    int sum = 3;
    LeetCode0113 solution = new LeetCode0113();
    List<List<Integer>> result = solution.pathSum(root, sum);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(2, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
  }

  @Test
  public void testNoLeftTree() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    int sum = 3;
    LeetCode0113 solution = new LeetCode0113();
    List<List<Integer>> result = solution.pathSum(root, sum);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(2, result.get(0).size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    int sum = 22;
    LeetCode0113 solution = new LeetCode0113();
    List<List<Integer>> result = solution.pathSum(root, sum);
    Assert.assertEquals(0, result.size());
  }
}
