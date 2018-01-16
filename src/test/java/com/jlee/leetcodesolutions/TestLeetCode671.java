package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode671;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode671 {
  @Test
  public void testRoot() {
    TreeNode root = new TreeNode(2);
    LeetCode671 solution = new LeetCode671();
    Assert.assertEquals(-1, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testTwoLevelSame() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    LeetCode671 solution = new LeetCode671();
    Assert.assertEquals(-1, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testTwoLevel() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    LeetCode671 solution = new LeetCode671();
    Assert.assertEquals(5, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testThreeLevelRight() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);
    LeetCode671 solution = new LeetCode671();
    Assert.assertEquals(5, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testThreeLevelLeft() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(5);
    LeetCode671 solution = new LeetCode671();
    Assert.assertEquals(3, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testThreeLevel() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(5);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);
    LeetCode671 solution = new LeetCode671();
    Assert.assertEquals(3, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode671 solution = new LeetCode671();
    Assert.assertEquals(-1, solution.findSecondMinimumValue(root));
  }
}
