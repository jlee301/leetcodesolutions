package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode866;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode866 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);
    LeetCode866 solution = new LeetCode866();
    TreeNode result = solution.subtreeWithAllDeepest(root);
    Assert.assertEquals(2, result.val);
  }

   @Test
   public void testProblemCase2() {
     TreeNode root = new TreeNode(0);
     root.right = new TreeNode(1);
     root.right.right = new TreeNode(2);
     root.right.right.right = new TreeNode(3);
     LeetCode866 solution = new LeetCode866();
     TreeNode result = solution.subtreeWithAllDeepest(root);
     Assert.assertEquals(3, result.val);
   }

   @Test
   public void testProblemCase3() {
     TreeNode root = new TreeNode(1);
     LeetCode866 solution = new LeetCode866();
     TreeNode result = solution.subtreeWithAllDeepest(root);
     Assert.assertEquals(1, result.val);
   }

   @Test
   public void testProblemCase4() {
     TreeNode root = new TreeNode(0);
     root.left = new TreeNode(1);
     root.left.right = new TreeNode(2);
     root.right = new TreeNode(3);
     LeetCode866 solution = new LeetCode866();
     TreeNode result = solution.subtreeWithAllDeepest(root);
     Assert.assertEquals(2, result.val);
   }
}
