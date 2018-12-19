package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode617;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode617 {
  @Test
  public void testProblemCase1() {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertEquals(3, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testProblemCase2() {
    TreeNode t1 = new TreeNode(1);
    t1.left = new TreeNode(3);
    TreeNode t2 = new TreeNode(2);
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(3, result.left.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right);
  }

  @Test
  public void testProblemCase3() {
    TreeNode t1 = new TreeNode(1);
    t1.right = new TreeNode(3);
    TreeNode t2 = new TreeNode(2);
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(3, result.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
    Assert.assertNull(result.left);
  }

  @Test
  public void testProblemCase4() {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    t2.left = new TreeNode(4);
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(4, result.left.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right);
  }

  @Test
  public void testProblemCase5() {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    t2.right = new TreeNode(4);
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(4, result.right.val);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
    Assert.assertNull(result.left);
  }

  @Test
  public void testProblemCase6() {
    TreeNode t1 = new TreeNode(1);
    t1.left = new TreeNode(3);
    t1.right = new TreeNode(5);
    TreeNode t2 = new TreeNode(2);
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(3, result.left.val);
    Assert.assertEquals(5, result.right.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }

  @Test
  public void testProblemCase7() {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    t2.left = new TreeNode(4);
    t2.right = new TreeNode(6);
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(4, result.left.val);
    Assert.assertEquals(6, result.right.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }

  @Test
  public void testProblemCase8() {
    TreeNode t1 = new TreeNode(1);
    t1.left = new TreeNode(3);
    t1.right = new TreeNode(5);
    TreeNode t2 = new TreeNode(2);
    t2.left = new TreeNode(4);
    t2.right = new TreeNode(6);
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertEquals(3, result.val);
    Assert.assertEquals(7, result.left.val);
    Assert.assertEquals(11, result.right.val);
    Assert.assertNull(result.left.left);
    Assert.assertNull(result.left.right);
    Assert.assertNull(result.right.left);
    Assert.assertNull(result.right.right);
  }

  @Test
  public void testProblemCase9() {
    TreeNode t1 = null;
    TreeNode t2 = new TreeNode(2);
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertEquals(2, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testProblemCase10() {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = null;
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertEquals(1, result.val);
    Assert.assertNull(result.left);
    Assert.assertNull(result.right);
  }

  @Test
  public void testProblemCase11() {
    TreeNode t1 = null;
    TreeNode t2 = null;
    LeetCode617 solution = new LeetCode617();
    TreeNode result = solution.mergeTrees(t1, t2);
    Assert.assertNull(result);
  }
}
