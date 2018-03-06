package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode236;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode236 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);
    TreeNode p = root.left;
    TreeNode q = root.right;
    LeetCode236 solution = new LeetCode236();
    TreeNode lca = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(3, lca.val);
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);
    TreeNode p = root.left;
    TreeNode q = root.left.right.right;
    LeetCode236 solution = new LeetCode236();
    TreeNode lca = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(5, lca.val);
  }

  @Test
  public void testOnRightSubTree() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);
    TreeNode p = root.right.left;
    TreeNode q = root.right.right;
    LeetCode236 solution = new LeetCode236();
    TreeNode lca = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(1, lca.val);
  }

  @Test
  public void testOnLeftSubTree() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);
    TreeNode p = root.left.right.left;
    TreeNode q = root.left.right.right;
    LeetCode236 solution = new LeetCode236();
    TreeNode lca = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(2, lca.val);
  }

  @Test
  public void testOnLeftRightSubTree() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);
    TreeNode p = root.left.right.left;
    TreeNode q = root.right.right;
    LeetCode236 solution = new LeetCode236();
    TreeNode lca = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(3, lca.val);
  }
  
  @Test
  public void testNull() {
    TreeNode root = null;
    TreeNode p = root;
    TreeNode q = root;
    LeetCode236 solution = new LeetCode236();
    TreeNode lca = solution.lowestCommonAncestor(root, p, q);
    Assert.assertNull(lca);
  }
}
