package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode094;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode094 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    LeetCode094 solution = new LeetCode094();
    List<Integer> result = solution.inorderTraversal(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(3, (int) result.get(1));
    Assert.assertEquals(2, (int) result.get(2));
  }

  @Test
  public void testFullTwoLevel() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode094 solution = new LeetCode094();
    List<Integer> result = solution.inorderTraversal(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(2, (int) result.get(0));
    Assert.assertEquals(1, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode094 solution = new LeetCode094();
    List<Integer> result = solution.inorderTraversal(root);
    Assert.assertEquals(0, result.size());
  }
}
