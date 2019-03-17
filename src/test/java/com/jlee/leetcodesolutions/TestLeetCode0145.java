package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0145;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0145 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    LeetCode0145 solution = new LeetCode0145();
    List<Integer> result = solution.postorderTraversal(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(3, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
    Assert.assertEquals(1, (int) result.get(2));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = null;
    LeetCode0145 solution = new LeetCode0145();
    List<Integer> result = solution.postorderTraversal(root);
    Assert.assertEquals(0, result.size());
  }
}
