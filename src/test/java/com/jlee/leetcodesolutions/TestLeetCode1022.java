package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1022;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1022 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(0);
    root.right = new TreeNode(1);

    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(1);
    
    LeetCode1022 solution = new LeetCode1022();
    Assert.assertEquals(22, solution.sumRootToLeaf(root));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(1);
    root.right = new TreeNode(1);

    root.left.left = new TreeNode(1);
    root.right.right = new TreeNode(1);
    
    LeetCode1022 solution = new LeetCode1022();
    Assert.assertEquals(14, solution.sumRootToLeaf(root));
  }
}
