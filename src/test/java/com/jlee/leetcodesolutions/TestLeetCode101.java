package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode101;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode101 {
  @Test
  public void testOneNodeMirror(){
    TreeNode root = new TreeNode(1);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testTwoNodeMirror(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testTwoNodeDiff(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testTwoNodeLeftNull(){
    TreeNode root = new TreeNode(1);
    root.left = null;
    root.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testTwoNodeRightNull(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.right = null;

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testThreeNodeMirror(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertTrue(result);
  }

  @Test
  public void testThreeNodeDiff(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(4);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testThreeNodeLeftLeftNull(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = null;
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testThreeNodeLeftRightNull(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = null;
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }
  
  @Test
  public void testThreeNodeRightLeftNull(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = null;
    root.right.right = new TreeNode(3);

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testThreeNodeRighRightNull(){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(4);
    root.right.right = null;

    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(root);
    Assert.assertFalse(result);
  }

  @Test
  public void testNull(){
    LeetCode101 solution = new LeetCode101();
    boolean result = solution.isSymmetric(null);
    Assert.assertTrue(result);
  }
}
