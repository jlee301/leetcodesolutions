package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode606;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode606 {
  @Test
  public void testJustRoot() {
    TreeNode t = new TreeNode(1);
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("1", solution.tree2str(t));
  }

  @Test
  public void testTwoTierLeft() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("1(2)", solution.tree2str(t));
  }

  @Test
  public void testTwoTierRight() {
    TreeNode t = new TreeNode(1);
    t.right = new TreeNode(2);
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("1()(2)", solution.tree2str(t));
  }

  @Test
  public void testTwoTierFull() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.right = new TreeNode(3);
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("1(2)(3)", solution.tree2str(t));
  }

  @Test
  public void testThreeTierLeftLeft() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.left = new TreeNode(4);
    t.right = new TreeNode(3);
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("1(2(4))(3)", solution.tree2str(t));
  }

  @Test
  public void testThreeTierLeftRight() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.right = new TreeNode(4);
    t.right = new TreeNode(3);
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("1(2()(4))(3)", solution.tree2str(t));
  }

  @Test
  public void testThreeTierLeft() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.left = new TreeNode(4);
    t.left.right = new TreeNode(5);
    t.right = new TreeNode(3);
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("1(2(4)(5))(3)", solution.tree2str(t));
  }

  @Test
  public void testThreeTierLeftRightLeft() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.left = new TreeNode(4);
    t.left.right = new TreeNode(5);
    t.right = new TreeNode(3);
    t.right.left = new TreeNode(6);
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("1(2(4)(5))(3(6))", solution.tree2str(t));
  }

  @Test
  public void testThreeTierLeftRightRight() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.left = new TreeNode(4);
    t.left.right = new TreeNode(5);
    t.right = new TreeNode(3);
    t.right.right = new TreeNode(7);
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("1(2(4)(5))(3()(7))", solution.tree2str(t));
  }

  @Test
  public void testThreeTierLeftRightFull() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.left = new TreeNode(4);
    t.left.right = new TreeNode(5);
    t.right = new TreeNode(3);
    t.right.left = new TreeNode(6);
    t.right.right = new TreeNode(7);
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("1(2(4)(5))(3(6)(7))", solution.tree2str(t));
  }

  @Test
  public void testNull() {
    TreeNode t = null;
    LeetCode606 solution = new LeetCode606();
    Assert.assertEquals("", solution.tree2str(t));
  }
}
