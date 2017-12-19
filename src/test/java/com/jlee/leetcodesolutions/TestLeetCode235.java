package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode235 {
  @Test
  public void test2and8() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(2);
    TreeNode q = new TreeNode(8);
    
    LeetCode235 solution = new LeetCode235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(6, result.val);
  }

  @Test
  public void test2and4() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(2);
    TreeNode q = new TreeNode(4);
    
    LeetCode235 solution = new LeetCode235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(2, result.val);
  }

  @Test
  public void test0and5() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(0);
    TreeNode q = new TreeNode(5);
    
    LeetCode235 solution = new LeetCode235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(2, result.val);
  }

  @Test
  public void test3and5() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(3);
    TreeNode q = new TreeNode(5);
    
    LeetCode235 solution = new LeetCode235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(4, result.val);
  }

  @Test
  public void test4and3() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(4);
    TreeNode q = new TreeNode(3);
    
    LeetCode235 solution = new LeetCode235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(4, result.val);
  }

  @Test
  public void test7and9() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(7);
    TreeNode q = new TreeNode(9);
    
    LeetCode235 solution = new LeetCode235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(8, result.val);
  }

  @Test
  public void test8and9() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(8);
    TreeNode q = new TreeNode(9);
    
    LeetCode235 solution = new LeetCode235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(8, result.val);
  }

  @Test
  public void test8and7() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(8);
    TreeNode q = new TreeNode(7);
    
    LeetCode235 solution = new LeetCode235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(8, result.val);
  }

  @Test
  public void test6and7() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(6);
    TreeNode q = new TreeNode(7);
    
    LeetCode235 solution = new LeetCode235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(6, result.val);
  }

  @Test
  public void test5and7() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);
    
    TreeNode p = new TreeNode(6);
    TreeNode q = new TreeNode(7);
    
    LeetCode235 solution = new LeetCode235();
    TreeNode result = solution.lowestCommonAncestor(root, p, q);
    Assert.assertEquals(6, result.val);
  }
}
