package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode107;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode107 {
  @Test
  public void testProblemCase1(){
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    LeetCode107 solution = new LeetCode107();
    List<List<Integer>> result = solution.levelOrderBottom(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(2, result.get(0).size());
    Assert.assertEquals(15, (int) result.get(0).get(0));
    Assert.assertEquals(7, (int) result.get(0).get(1));
    Assert.assertEquals(2, result.get(1).size());
    Assert.assertEquals(9, (int) result.get(1).get(0));
    Assert.assertEquals(20, (int) result.get(1).get(1));
    Assert.assertEquals(1, result.get(2).size());
    Assert.assertEquals(3, (int) result.get(2).get(0));
  }

  @Test
  public void testProblemCase2(){
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    LeetCode107 solution = new LeetCode107();
    List<List<Integer>> result = solution.levelOrderBottom(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(4, result.get(0).size());
    Assert.assertEquals(4, (int) result.get(0).get(0));
    Assert.assertEquals(5, (int) result.get(0).get(1));
    Assert.assertEquals(15, (int) result.get(0).get(2));
    Assert.assertEquals(7, (int) result.get(0).get(3));
    Assert.assertEquals(2, result.get(1).size());
    Assert.assertEquals(9, (int) result.get(1).get(0));
    Assert.assertEquals(20, (int) result.get(1).get(1));
    Assert.assertEquals(1, result.get(2).size());
    Assert.assertEquals(3, (int) result.get(2).get(0));
  }
  
  @Test
  public void testProblemCase3(){
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(4);

    LeetCode107 solution = new LeetCode107();
    List<List<Integer>> result = solution.levelOrderBottom(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals(4, (int) result.get(0).get(0));
    Assert.assertEquals(1, result.get(1).size());
    Assert.assertEquals(9, (int) result.get(1).get(0));
    Assert.assertEquals(1, result.get(2).size());
    Assert.assertEquals(3, (int) result.get(2).get(0));
  }

  @Test
  public void testProblemCase4(){
    TreeNode root = new TreeNode(3);
    root.right = new TreeNode(9);
    root.right.right = new TreeNode(4);

    LeetCode107 solution = new LeetCode107();
    List<List<Integer>> result = solution.levelOrderBottom(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals(4, (int) result.get(0).get(0));
    Assert.assertEquals(1, result.get(1).size());
    Assert.assertEquals(9, (int) result.get(1).get(0));
    Assert.assertEquals(1, result.get(2).size());
    Assert.assertEquals(3, (int) result.get(2).get(0));
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(3);

    LeetCode107 solution = new LeetCode107();
    List<List<Integer>> result = solution.levelOrderBottom(root);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertEquals(3, (int) result.get(0).get(0));
  }

  @Test
  public void testProblemCase6() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(4);

    LeetCode107 solution = new LeetCode107();
    List<List<Integer>> result = solution.levelOrderBottom(root);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(2, result.get(0).size());
    Assert.assertEquals(9, (int) result.get(0).get(0));
    Assert.assertEquals(4, (int) result.get(0).get(1));
    Assert.assertEquals(1, result.get(1).size());
    Assert.assertEquals(3, (int) result.get(1).get(0));
  }

  @Test
  public void testProblemCase7() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(10);
    root.right = new TreeNode(4);
    root.right.right = new TreeNode(11);

    LeetCode107 solution = new LeetCode107();
    List<List<Integer>> result = solution.levelOrderBottom(root);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(2, result.get(0).size());
    Assert.assertEquals(10, (int) result.get(0).get(0));
    Assert.assertEquals(11, (int) result.get(0).get(1));
    Assert.assertEquals(2, result.get(1).size());
    Assert.assertEquals(9, (int) result.get(1).get(0));
    Assert.assertEquals(4, (int) result.get(1).get(1));
    Assert.assertEquals(1, result.get(2).size());
    Assert.assertEquals(3, (int) result.get(2).get(0));
  }

  @Test
  public void testProblemCase8(){
    LeetCode107 solution = new LeetCode107();
    List<List<Integer>> result = solution.levelOrderBottom(null);
    Assert.assertEquals(0, result.size());
  }
}
