package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0971;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0971 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    int[] voyage = {2,1};
    LeetCode0971 solution = new LeetCode0971();
    List<Integer> result = solution.flipMatchVoyage(root, voyage);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(-1, (int) result.get(0));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    int[] voyage = {1,3,2};
    LeetCode0971 solution = new LeetCode0971();
    List<Integer> result = solution.flipMatchVoyage(root, voyage);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, (int) result.get(0));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    int[] voyage = {1,2,3};
    LeetCode0971 solution = new LeetCode0971();
    List<Integer> result = solution.flipMatchVoyage(root, voyage);
    Assert.assertEquals(0, result.size());
  }
}
