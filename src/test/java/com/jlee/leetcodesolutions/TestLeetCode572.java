package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode572;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode572 {
  @Test
  public void testProblemCase1() {
    TreeNode s = new TreeNode(3);
    s.left = new TreeNode(4);
    s.left.left = new TreeNode(1);
    s.left.right = new TreeNode(2);
    s.right = new TreeNode(5);
    
    TreeNode t = new TreeNode(4);
    t.left = new TreeNode(1);
    t.right = new TreeNode(2);
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertTrue(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase2() {
    TreeNode s = new TreeNode(3);
    s.left = new TreeNode(4);
    s.left.left = new TreeNode(1);
    s.left.right = new TreeNode(2);
    s.left.right.left = new TreeNode(0);
    s.right = new TreeNode(5);
    
    TreeNode t = new TreeNode(4);
    t.left = new TreeNode(1);
    t.right = new TreeNode(2);
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertFalse(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase3() {
    TreeNode s = new TreeNode(3);
    s.left = new TreeNode(4);
    s.left.left = new TreeNode(1);
    s.left.right = new TreeNode(2);
    s.right = new TreeNode(5);
    
    TreeNode t = new TreeNode(3);
    t.left = new TreeNode(4);
    t.left.left = new TreeNode(1);
    t.left.right = new TreeNode(2);
    t.right = new TreeNode(5);
        
    LeetCode572 solution = new LeetCode572();
    Assert.assertTrue(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase4() {
    TreeNode s = new TreeNode(4);
    s.left = new TreeNode(4);
    s.left.left = new TreeNode(1);
    s.left.right = new TreeNode(2);
    
    TreeNode t = new TreeNode(4);
    t.left = new TreeNode(1);
    t.right = new TreeNode(2);
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertTrue(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase5() {
    TreeNode s = new TreeNode(4);
    s.left = new TreeNode(4);
    s.left.left = new TreeNode(5);
    s.left.right = new TreeNode(6);
    s.right = new TreeNode(4);
    s.right.left = new TreeNode(1);
    s.right.right = new TreeNode(2);
    
    TreeNode t = new TreeNode(4);
    t.left = new TreeNode(1);
    t.right = new TreeNode(2);
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertTrue(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase6() {
    TreeNode s = new TreeNode(3);
    s.left = new TreeNode(4);
    s.left.left = new TreeNode(1);
    s.left.right = new TreeNode(2);
    s.right = new TreeNode(5);
    
    TreeNode t = new TreeNode(2);
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertTrue(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase7() {
    TreeNode s = new TreeNode(3);
    s.left = new TreeNode(4);
    s.left.left = new TreeNode(1);
    s.left.right = new TreeNode(2);
    s.right = new TreeNode(5);
    
    TreeNode t = new TreeNode(5);
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertTrue(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase8() {
    TreeNode s = null;
    TreeNode t = new TreeNode(4);
    t.left = new TreeNode(1);
    t.right = new TreeNode(2);
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertFalse(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase9() {
    TreeNode s = new TreeNode(4);    
    TreeNode t = null;
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertFalse(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase10() {
    TreeNode s = null;    
    TreeNode t = null;
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertTrue(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase11() {
    TreeNode s = new TreeNode(1);
    s.left = new TreeNode(2);
    TreeNode t = new TreeNode(1);
    t.right = new TreeNode(2);
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertFalse(solution.isSubtree(s, t));
  }

  @Test
  public void testProblemCase12() {
    TreeNode s = new TreeNode(1);
    s.right = new TreeNode(2);
    TreeNode t = new TreeNode(1);
    t.left = new TreeNode(2);
    
    LeetCode572 solution = new LeetCode572();
    Assert.assertFalse(solution.isSubtree(s, t));
  }
}
