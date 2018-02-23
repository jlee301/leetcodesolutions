package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode144;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode144 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    LeetCode144 solution = new LeetCode144();
    List<Integer> result = solution.preorderTraversal(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int) result.get(0)); 
    Assert.assertEquals(2, (int) result.get(1)); 
    Assert.assertEquals(3, (int) result.get(2)); 
  }

  @Test
  public void testOneLevelFull() {
    TreeNode root = new TreeNode(1);
    LeetCode144 solution = new LeetCode144();
    List<Integer> result = solution.preorderTraversal(root);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, (int) result.get(0)); 
  }

  @Test
  public void testTwoLevelFull() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    LeetCode144 solution = new LeetCode144();
    List<Integer> result = solution.preorderTraversal(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, (int) result.get(0)); 
    Assert.assertEquals(2, (int) result.get(1)); 
    Assert.assertEquals(3, (int) result.get(2)); 
  }

  @Test
  public void testThreeLevelFull() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    LeetCode144 solution = new LeetCode144();
    List<Integer> result = solution.preorderTraversal(root);
    Assert.assertEquals(7, result.size());
    Assert.assertEquals(1, (int) result.get(0)); 
    Assert.assertEquals(2, (int) result.get(1)); 
    Assert.assertEquals(4, (int) result.get(2)); 
    Assert.assertEquals(5, (int) result.get(3)); 
    Assert.assertEquals(3, (int) result.get(4)); 
    Assert.assertEquals(6, (int) result.get(5)); 
    Assert.assertEquals(7, (int) result.get(6)); 
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode144 solution = new LeetCode144();
    List<Integer> result = solution.preorderTraversal(root);
    Assert.assertEquals(0, result.size());
  }
}
