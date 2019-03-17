package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0606;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0606 {
  @Test
  public void testProblemCase1() {
    TreeNode t = new TreeNode(1);
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("1", solution.tree2str(t));
  }

  @Test
  public void testProblemCase2() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("1(2)", solution.tree2str(t));
  }

  @Test
  public void testProblemCase3() {
    TreeNode t = new TreeNode(1);
    t.right = new TreeNode(2);
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("1()(2)", solution.tree2str(t));
  }

  @Test
  public void testProblemCase4() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.right = new TreeNode(3);
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("1(2)(3)", solution.tree2str(t));
  }

  @Test
  public void testProblemCase5() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.left = new TreeNode(4);
    t.right = new TreeNode(3);
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("1(2(4))(3)", solution.tree2str(t));
  }

  @Test
  public void testProblemCase6() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.right = new TreeNode(4);
    t.right = new TreeNode(3);
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("1(2()(4))(3)", solution.tree2str(t));
  }

  @Test
  public void testProblemCase7() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.left = new TreeNode(4);
    t.left.right = new TreeNode(5);
    t.right = new TreeNode(3);
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("1(2(4)(5))(3)", solution.tree2str(t));
  }

  @Test
  public void testProblemCase8() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.left = new TreeNode(4);
    t.left.right = new TreeNode(5);
    t.right = new TreeNode(3);
    t.right.left = new TreeNode(6);
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("1(2(4)(5))(3(6))", solution.tree2str(t));
  }

  @Test
  public void testProblemCase9() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.left = new TreeNode(4);
    t.left.right = new TreeNode(5);
    t.right = new TreeNode(3);
    t.right.right = new TreeNode(7);
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("1(2(4)(5))(3()(7))", solution.tree2str(t));
  }

  @Test
  public void testProblemCase10() {
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    t.left.left = new TreeNode(4);
    t.left.right = new TreeNode(5);
    t.right = new TreeNode(3);
    t.right.left = new TreeNode(6);
    t.right.right = new TreeNode(7);
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("1(2(4)(5))(3(6)(7))", solution.tree2str(t));
  }

  @Test
  public void testProblemCase11() {
    TreeNode t = null;
    LeetCode0606 solution = new LeetCode0606();
    Assert.assertEquals("", solution.tree2str(t));
  }
}
