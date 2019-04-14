package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1028;
import com.jlee.leetcodesolutions.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1028 {
  @Test
  public void testProblemCase1() {
    String S = "1-2--3--4-5--6--7";
    LeetCode1028 solution = new LeetCode1028();
    TreeNode result = solution.recoverFromPreorder(S);
    Assert.assertEquals(1, result.val);

    Assert.assertEquals(2, result.left.val);
    Assert.assertEquals(5, result.right.val);
    
    Assert.assertEquals(3, result.left.left.val);
    Assert.assertEquals(4, result.left.right.val);
    Assert.assertEquals(6, result.right.left.val);
    Assert.assertEquals(7, result.right.right.val);
    
    Assert.assertNull(result.left.left.left);
    Assert.assertNull(result.left.left.right);
    Assert.assertNull(result.left.right.left);
    Assert.assertNull(result.left.right.right);
    Assert.assertNull(result.right.left.left);
    Assert.assertNull(result.right.left.right);
    Assert.assertNull(result.right.right.left);
    Assert.assertNull(result.right.right.right);
  }
  
  @Test
  public void testProblemCase2() {
    String S = "1-2--3---4-5--6---7";
    LeetCode1028 solution = new LeetCode1028();
    TreeNode result = solution.recoverFromPreorder(S);    
    Assert.assertEquals(1, result.val);
    
    Assert.assertEquals(2, result.left.val);
    Assert.assertEquals(5, result.right.val);
    
    Assert.assertEquals(3, result.left.left.val);
    Assert.assertEquals(6, result.right.left.val);
    
    Assert.assertEquals(4, result.left.left.left.val);
    Assert.assertEquals(7, result.right.left.left.val);
  }

  @Test
  public void testProblemCase3() {
    String S = "1-401--349---90--88";
    LeetCode1028 solution = new LeetCode1028();
    TreeNode result = solution.recoverFromPreorder(S);    
    Assert.assertEquals(1, result.val);
    
    Assert.assertEquals(401, result.left.val);
    
    Assert.assertEquals(349, result.left.left.val);
    Assert.assertEquals(88, result.left.right.val);
    
    Assert.assertEquals(90, result.left.left.left.val);
  }

  @Test
  public void testProblemCase4() {
    String S = "3";
    LeetCode1028 solution = new LeetCode1028();
    TreeNode result = solution.recoverFromPreorder(S);    
    Assert.assertEquals(3, result.val);
  }
}
