package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode669;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode669 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    int L = 1, R = 2;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    int L = 2, R = 2;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertNull(result);
  }
  
  @Test
  public void testProblemCase3() {
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
  public void testProblemCase4() {
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
  public void testProblemCase5() {
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
  public void testProblemCase6() {
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
  public void testProblemCase7() {
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
  public void testProblemCase8() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    int L = 2, R = 2;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertNull(result);
  }

  @Test
  public void testProblemCase9() {
    TreeNode root = null;
    int L = 1, R = 3;
    LeetCode669 solution = new LeetCode669();
    TreeNode result = solution.trimBST(root, L, R);
    Assert.assertNull(result);
  }
}
