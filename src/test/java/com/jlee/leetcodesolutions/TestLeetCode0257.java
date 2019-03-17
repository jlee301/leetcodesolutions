package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0257;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0257 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    
    LeetCode0257 solution = new LeetCode0257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("1->2->5"));
    Assert.assertTrue(result.contains("1->3"));
  }

  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    
    LeetCode0257 solution = new LeetCode0257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(4, result.size());
    Assert.assertTrue(result.contains("1->2->4"));
    Assert.assertTrue(result.contains("1->2->5"));
    Assert.assertTrue(result.contains("1->3->6"));
    Assert.assertTrue(result.contains("1->3->7"));
  }
  
  @Test
  public void testProblemCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    LeetCode0257 solution = new LeetCode0257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("1->2"));
    Assert.assertTrue(result.contains("1->3"));
  }
  
  @Test
  public void testProblemCase4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    
    LeetCode0257 solution = new LeetCode0257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(1, result.size());
    Assert.assertTrue(result.contains("1->2"));
  }
  
  @Test
  public void testProblemCase5() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    
    LeetCode0257 solution = new LeetCode0257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(1, result.size());
    Assert.assertTrue(result.contains("1->2"));
  }
  
  @Test
  public void testProblemCase6() {
    TreeNode root = new TreeNode(1);
    
    LeetCode0257 solution = new LeetCode0257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(1, result.size());
    Assert.assertTrue(result.contains("1"));
  }

  @Test
  public void testProblemCase7() {
    TreeNode root = null;
    
    LeetCode0257 solution = new LeetCode0257();
    List<String> result = solution.binaryTreePaths(root);
    Assert.assertEquals(0, result.size());
  }
}
