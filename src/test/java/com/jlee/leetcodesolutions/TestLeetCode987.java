package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode987;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode987 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(3);
    
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    
    LeetCode987 solution = new LeetCode987();
    List<List<Integer>> result = solution.verticalTraversal(root);
    Assert.assertEquals(4, result.size());
    Assert.assertArrayEquals(new Integer[] {9}, result.get(0).toArray());
    Assert.assertArrayEquals(new Integer[] {3,15}, result.get(1).toArray());
    Assert.assertArrayEquals(new Integer[] {20}, result.get(2).toArray());
    Assert.assertArrayEquals(new Integer[] {7}, result.get(3).toArray());
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    
    LeetCode987 solution = new LeetCode987();
    List<List<Integer>> result = solution.verticalTraversal(root);
    Assert.assertEquals(5, result.size());
    Assert.assertArrayEquals(new Integer[] {4}, result.get(0).toArray());
    Assert.assertArrayEquals(new Integer[] {2}, result.get(1).toArray());
    Assert.assertArrayEquals(new Integer[] {1,5,6}, result.get(2).toArray());
    Assert.assertArrayEquals(new Integer[] {3}, result.get(3).toArray());
    Assert.assertArrayEquals(new Integer[] {7}, result.get(4).toArray());
  }
}
