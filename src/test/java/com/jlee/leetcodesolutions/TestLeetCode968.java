package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode968;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode968 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(0);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(0);
    
    LeetCode968 solution = new LeetCode968();
    Assert.assertEquals(1, solution.minCameraCover(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(0);
    root.left.left = new TreeNode(0);
    root.left.left.left = new TreeNode(0);
    root.left.left.left.right = new TreeNode(0);
    
    LeetCode968 solution = new LeetCode968();
    Assert.assertEquals(2, solution.minCameraCover(root));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(0);
    
    LeetCode968 solution = new LeetCode968();
    Assert.assertEquals(1, solution.minCameraCover(root));
  }

  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(0);
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(0);
    
    LeetCode968 solution = new LeetCode968();
    Assert.assertEquals(1, solution.minCameraCover(root));
  }

  @Test
  public void testProblemCase5() {
    TreeNode root = null;
    
    LeetCode968 solution = new LeetCode968();
    Assert.assertEquals(0, solution.minCameraCover(root));
  }  
}
