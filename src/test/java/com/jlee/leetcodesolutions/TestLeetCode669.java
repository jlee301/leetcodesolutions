package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode669;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode669 {
  @Test
  public void testJustRootInRange() {
    TreeNode root = new TreeNode(1);
    int L = 1, R = 2;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testJustRootNotInRange() {
    TreeNode root = new TreeNode(1);
    int L = 2, R = 2;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertNull(result);
  }
  
  @Test
  public void testTwoLevelInRange() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(2);
    int L = 0, R = 2;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(0, result.left.val);
    Assert.assertEquals(2, result.right.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }  

  @Test
  public void testTwoLevelNotInRange() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(2);
    int L = 1, R = 2;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(2, result.right.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }  

  @Test
  public void testFourLevelInRange() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(0);
    root.left.right = new TreeNode(2);
    root.left.right.left = new TreeNode(1);
    root.right = new TreeNode(4);
    int L = 1, R = 3;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(2, result.left.val);
    Assert.assertEquals(1, result.left.left.val);
    Assert.assertNull(result.right);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.left.left.left);
    Assert.assertNull(result.left.left.right);
  }
  
  @Test
  public void testRootPromotionLeftSide() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(2);
    int L = 0, R = 0;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertEquals(0, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testRootPromotionRightSide() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(2);
    int L = 2, R = 2;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertEquals(2, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testEntireTreeNotInRange() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    int L = 2, R = 2;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertNull(result);
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    int L = 1, R = 3;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertNull(result);
  }
}
