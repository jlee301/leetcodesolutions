package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode515;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode515 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(9);
    LeetCode515 solution = new LeetCode515();
    List<Integer> result = solution.largestValues(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(3, (int) result.get(1));
    Assert.assertEquals(9, (int) result.get(2));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode515 solution = new LeetCode515();
    List<Integer> result = solution.largestValues(root);
    Assert.assertEquals(0, result.size());
  }
}
