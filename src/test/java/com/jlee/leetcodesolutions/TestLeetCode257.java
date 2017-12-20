package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode257;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode257 {
  @Test
  public void testProblemCase() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    
    LeetCode257 solution = new LeetCode257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals("1->2->5", result.get(0));
    Assert.assertEquals("1->3", result.get(1));
  }

  @Test
  public void testFullThreeNode() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    
    LeetCode257 solution = new LeetCode257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals("1->2->4", result.get(0));
    Assert.assertEquals("1->2->5", result.get(1));
    Assert.assertEquals("1->3->6", result.get(2));
    Assert.assertEquals("1->3->7", result.get(3));
  }
  
  @Test
  public void testFullTwoNode() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    LeetCode257 solution = new LeetCode257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals("1->2", result.get(0));
    Assert.assertEquals("1->3", result.get(1));
  }
  
  @Test
  public void testLeftTwoNode() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    
    LeetCode257 solution = new LeetCode257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("1->2", result.get(0));
  }
  
  @Test
  public void testRightTwoNode() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    
    LeetCode257 solution = new LeetCode257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("1->2", result.get(0));
  }
  
  @Test
  public void testOneNode() {
    TreeNode root = new TreeNode(1);
    
    LeetCode257 solution = new LeetCode257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("1", result.get(0));
  }

  @Test
  public void testNull() {
    TreeNode root = null;
    
    LeetCode257 solution = new LeetCode257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(0, result.size());
  }
}
