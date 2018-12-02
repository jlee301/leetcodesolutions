package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode951;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode951 {
  @Test
  public void testProblemCase1() {
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);
    
    root1.left.left = new TreeNode(4);
    root1.left.right = new TreeNode(5);
    root1.right.left = new TreeNode(6);
    
    root1.left.right.left = new TreeNode(7);
    root1.left.right.right = new TreeNode(8);
    
    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(3);
    root2.right = new TreeNode(2);
    
    root2.left.right = new TreeNode(6);
    root2.right.left = new TreeNode(4);
    root2.right.right = new TreeNode(5);
    
    root2.right.right.left = new TreeNode(8);
    root2.right.right.right = new TreeNode(7);
    
    LeetCode951 solution = new LeetCode951();
    Assert.assertTrue(solution.flipEquiv(root1, root2));    
  }

  @Test
  public void testProblemCase2() {
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    TreeNode root2 = new TreeNode(1);
    
    LeetCode951 solution = new LeetCode951();
    Assert.assertFalse(solution.flipEquiv(root1, root2));    
  }

  @Test
  public void testProblemCase3() {
    TreeNode root1 = new TreeNode(1);
    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(2);
    
    LeetCode951 solution = new LeetCode951();
    Assert.assertFalse(solution.flipEquiv(root1, root2));    
  }

  @Test
  public void testProblemCase4() {
    TreeNode root1 = new TreeNode(1);    
    TreeNode root2 = new TreeNode(1);
    
    LeetCode951 solution = new LeetCode951();
    Assert.assertTrue(solution.flipEquiv(root1, root2));    
  }

  @Test
  public void testProblemCase5() {
    TreeNode root1 = new TreeNode(1);    
    root1.right = new TreeNode(2);
    TreeNode root2 = new TreeNode(1);
    
    LeetCode951 solution = new LeetCode951();
    Assert.assertFalse(solution.flipEquiv(root1, root2));    
  }

  @Test
  public void testProblemCase6() {
    TreeNode root1 = new TreeNode(1);    
    TreeNode root2 = new TreeNode(1);
    root2.right = new TreeNode(2);
    
    LeetCode951 solution = new LeetCode951();
    Assert.assertFalse(solution.flipEquiv(root1, root2));    
  }
}
