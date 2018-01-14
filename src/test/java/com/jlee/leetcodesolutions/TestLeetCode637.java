package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode637;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode637 {
  @Test
  public void testJustRoot() {
    TreeNode root = new TreeNode(3);
    LeetCode637 solution = new LeetCode637();
    List<Double> result = solution.averageOfLevels(root);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals((double) 3, (double) result.get(0), 0);    
  }

  @Test
  public void testTwoLevel() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    LeetCode637 solution = new LeetCode637();
    List<Double> result = solution.averageOfLevels(root);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals((double) 3, (double) result.get(0), 0);    
    Assert.assertEquals((double) 14.5, (double) result.get(1), 0);    
  }

  @Test
  public void testThreeLevelRight() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    LeetCode637 solution = new LeetCode637();
    List<Double> result = solution.averageOfLevels(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals((double) 3, (double) result.get(0), 0);    
    Assert.assertEquals((double) 14.5, (double) result.get(1), 0);    
    Assert.assertEquals((double) 11, (double) result.get(2), 0);    
  }

  @Test
  public void testThreeLevelLeft() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(15);
    root.left.right = new TreeNode(7);
    root.right = new TreeNode(20);
    LeetCode637 solution = new LeetCode637();
    List<Double> result = solution.averageOfLevels(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals((double) 3, (double) result.get(0), 0);    
    Assert.assertEquals((double) 14.5, (double) result.get(1), 0);    
    Assert.assertEquals((double) 11, (double) result.get(2), 0);    
  }

  @Test
  public void testThreeLevel() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(11);
    root.left.right = new TreeNode(40);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    LeetCode637 solution = new LeetCode637();
    List<Double> result = solution.averageOfLevels(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals((double) 3, (double) result.get(0), 0);    
    Assert.assertEquals((double) 14.5, (double) result.get(1), 0);    
    Assert.assertEquals((double) 18.25, (double) result.get(2), 0);    
  }

  @Test
  public void testMaxIntegers() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(Integer.MAX_VALUE);
    root.right = new TreeNode(Integer.MAX_VALUE);
    LeetCode637 solution = new LeetCode637();
    List<Double> result = solution.averageOfLevels(root);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals((double) 3, (double) result.get(0), 0);    
    Assert.assertEquals((double) Integer.MAX_VALUE, (double) result.get(1), 0);    
  }

  @Test
  public void testMinIntegers() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(Integer.MIN_VALUE);
    root.right = new TreeNode(Integer.MIN_VALUE);
    LeetCode637 solution = new LeetCode637();
    List<Double> result = solution.averageOfLevels(root);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals((double) 3, (double) result.get(0), 0);    
    Assert.assertEquals((double) Integer.MIN_VALUE, (double) result.get(1), 0);    
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    LeetCode637 solution = new LeetCode637();
    List<Double> result = solution.averageOfLevels(root);
    Assert.assertEquals(0, result.size());
  }
}
