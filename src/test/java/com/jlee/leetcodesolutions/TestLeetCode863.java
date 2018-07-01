package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode863;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode863 {
  @Test
  public void testProblemCase() {
    TreeNode target = new TreeNode(5);
    target.left = new TreeNode(6);
    target.right = new TreeNode(2);
    target.right.left = new TreeNode(7);
    target.right.right = new TreeNode(4);
    
    TreeNode root = new TreeNode(3);
    root.left = target;
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);
    int K = 2;
    
    LeetCode863 solution = new LeetCode863();
    List<Integer> result = solution.distanceK(root, target, K);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(7, (int) result.get(0));
    Assert.assertEquals(4, (int) result.get(1));
    Assert.assertEquals(1, (int) result.get(2));
  }

  @Test
  public void testProblemCase2() {
    TreeNode target = new TreeNode(1);
    target.left = new TreeNode(0);
    target.right = new TreeNode(8);
    
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);
    root.right = target;
    int K = 2;
    
    LeetCode863 solution = new LeetCode863();
    List<Integer> result = solution.distanceK(root, target, K);
    Assert.assertEquals(1, result.size());
  }

  @Test
  public void testKLargerThanAnyDistance() {
    TreeNode target = new TreeNode(5);
    target.left = new TreeNode(6);
    target.right = new TreeNode(2);
    target.right.left = new TreeNode(7);
    target.right.right = new TreeNode(4);
    
    TreeNode root = new TreeNode(3);
    root.left = target;
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);
    int K = 20;
    
    LeetCode863 solution = new LeetCode863();
    List<Integer> result = solution.distanceK(root, target, K);
    Assert.assertEquals(0, result.size());
  }
}
