package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode988;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode988 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(0);
    
    root.left = new TreeNode(1);
    root.right = new TreeNode(2);
    
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(4);
    
    LeetCode988 solution = new LeetCode988();
    Assert.assertEquals("dba", solution.smallestFromLeaf(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(25);
    
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(2);
    
    LeetCode988 solution = new LeetCode988();
    Assert.assertEquals("adz", solution.smallestFromLeaf(root));
  }

  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(2);
    
    root.left = new TreeNode(2);
    root.right = new TreeNode(1);
    
    root.left.right = new TreeNode(2);
    root.right.left = new TreeNode(0);
    
    root.left.right.left = new TreeNode(0);
    
    LeetCode988 solution = new LeetCode988();
    Assert.assertEquals("abc", solution.smallestFromLeaf(root));
  }
}
