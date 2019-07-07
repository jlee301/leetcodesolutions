package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1110;
import com.jlee.leetcodesolutions.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1110 {
  @Test
  public void testProblemCase1() {
    TreeNode root = new TreeNode(1);
    
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    
    LeetCode1110 solution = new LeetCode1110();
    int[] to_delete = {3,5};
    List<TreeNode> result = solution.delNodes(root, to_delete);
    Assert.assertEquals(3, result.size());

    Assert.assertEquals(1, result.get(0).val);

    Assert.assertEquals(2, result.get(0).left.val);
    Assert.assertNull(result.get(0).right);
    
    Assert.assertEquals(4, result.get(0).left.left.val);
    Assert.assertNull(result.get(0).left.right);

    Assert.assertNull(result.get(0).left.left.left);
    Assert.assertNull(result.get(0).left.left.right);
    
    Assert.assertEquals(6, result.get(1).val);
    Assert.assertNull(result.get(1).left);
    Assert.assertNull(result.get(1).right);

    Assert.assertEquals(7, result.get(2).val);
    Assert.assertNull(result.get(2).left);
    Assert.assertNull(result.get(2).right);
  }
  
  @Test
  public void testProblemCase2() {
    TreeNode root = new TreeNode(1);
    
    root.left = new TreeNode(2);
    
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(3);
    
    LeetCode1110 solution = new LeetCode1110();
    int[] to_delete = {2,3};
    List<TreeNode> result = solution.delNodes(root, to_delete);

    Assert.assertEquals(2, result.size());
    
    Assert.assertEquals(1, result.get(0).val);
    Assert.assertNull(result.get(0).left);
    Assert.assertNull(result.get(0).right);

    Assert.assertEquals(4, result.get(1).val);
    Assert.assertNull(result.get(1).left);
    Assert.assertNull(result.get(1).right);
}
}
