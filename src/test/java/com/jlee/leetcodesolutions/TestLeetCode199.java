package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode199;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode199 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(4);
    LeetCode199 solution = new LeetCode199();
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(3, (int) result.get(1));
    Assert.assertEquals(4, (int) result.get(2));
  }

  @Test
  public void testOneLevel() {
    TreeNode root = new TreeNode(1);
    LeetCode199 solution = new LeetCode199();
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, (int) result.get(0));
  }

  @Test
  public void testTwoLevelsRight() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode199 solution = new LeetCode199();
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(3, (int) result.get(1));
  }

  @Test
  public void testTwoLevelsLeft() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    LeetCode199 solution = new LeetCode199();
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
  }

  @Test
  public void testThreeLevelsLeft() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    LeetCode199 solution = new LeetCode199();
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(3, (int) result.get(1));
    Assert.assertEquals(4, (int) result.get(2));
  }

  @Test
  public void testThreeLevelsRight() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(5);
    LeetCode199 solution = new LeetCode199();
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(3, (int) result.get(1));
    Assert.assertEquals(5, (int) result.get(2));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode199 solution = new LeetCode199();
    List<Integer> result = solution.rightSideView(root);
    Assert.assertEquals(0, result.size());
  }
}
