package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode558;
import com.jlee.leetcodesolutions.LeetCode558.Node;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode558 {
  @Test
  public void testProblemCase1() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(false, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(false, false, null, null, null, null);
    quadTree2.topRight.topLeft = solution.new Node(false, true, null, null, null, null);
    quadTree2.topRight.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree2.topRight.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight.bottomRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
    Assert.assertTrue(result.topLeft.isLeaf);
    Assert.assertTrue(result.topLeft.val);
    Assert.assertTrue(result.topRight.isLeaf);
    Assert.assertTrue(result.topRight.val);
    Assert.assertTrue(result.bottomLeft.isLeaf);
    Assert.assertTrue(result.bottomLeft.val);
    Assert.assertTrue(result.bottomRight.isLeaf);
    Assert.assertFalse(result.bottomRight.val);
  }

  @Test
  public void testProblemCase2() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(false, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(false, false, null, null, null, null);
    quadTree1.topRight.topLeft = solution.new Node(false, true, null, null, null, null);
    quadTree1.topRight.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.topRight.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight.bottomRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
    Assert.assertTrue(result.topLeft.isLeaf);
    Assert.assertTrue(result.topLeft.val);
    Assert.assertTrue(result.topRight.isLeaf);
    Assert.assertTrue(result.topRight.val);
    Assert.assertTrue(result.bottomLeft.isLeaf);
    Assert.assertTrue(result.bottomLeft.val);
    Assert.assertTrue(result.bottomRight.isLeaf);
    Assert.assertFalse(result.bottomRight.val);
  }

  @Test
  public void testProblemCase3() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(false, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(false, false, null, null, null, null);
    quadTree1.topRight.topLeft = solution.new Node(false, true, null, null, null, null);
    quadTree1.topRight.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.topRight.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight.bottomRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
    Assert.assertTrue(result.topLeft.isLeaf);
    Assert.assertTrue(result.topLeft.val);
    Assert.assertFalse(result.topRight.isLeaf);
    Assert.assertFalse(result.topRight.val);
    Assert.assertTrue(result.bottomLeft.isLeaf);
    Assert.assertTrue(result.bottomLeft.val);
    Assert.assertTrue(result.bottomRight.isLeaf);
    Assert.assertFalse(result.bottomRight.val);
  }

  @Test
  public void testProblemCase4() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertTrue(result.isLeaf);
    Assert.assertTrue(result.val);
  }

  @Test
  public void testProblemCase5() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(false, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertTrue(result.isLeaf);
    Assert.assertTrue(result.val);
  }

  @Test
  public void testProblemCase6() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertTrue(result.isLeaf);
    Assert.assertTrue(result.val);
  }

  @Test
  public void testProblemCase7() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(false, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertTrue(result.isLeaf);
    Assert.assertTrue(result.val);
  }

  @Test
  public void testProblemCase8() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(false, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(false, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
  }

  @Test
  public void testProblemCase9() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
  }

  @Test
  public void testProblemCase10() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(false, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(false, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
  }

  @Test
  public void testProblemCase11() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
  }

  @Test
  public void testProblemCase12() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(false, false, null, null, null, null);
    quadTree1.bottomRight.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.bottomRight.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(false, false, null, null, null, null);
    quadTree2.bottomRight.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree2.bottomRight.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight.bottomRight = solution.new Node(false, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
  }

  @Test
  public void testProblemCase13() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(false, false, null, null, null, null);
    quadTree1.bottomLeft.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.bottomLeft.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft.bottomRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(false, false, null, null, null, null);
    quadTree2.bottomLeft.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree2.bottomLeft.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft.bottomRight = solution.new Node(false, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
  }

  @Test
  public void testProblemCase14() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(false, false, null, null, null, null);
    quadTree1.topRight.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.topRight.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topRight.bottomRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(false, false, null, null, null, null);
    quadTree2.topRight.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree2.topRight.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topRight.bottomRight = solution.new Node(false, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
  }

  @Test
  public void testProblemCase15() {
    LeetCode558 solution = new LeetCode558();
    Node quadTree1 = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft = solution.new Node(false, false, null, null, null, null);
    quadTree1.topLeft.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topLeft.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.topLeft.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.topLeft.bottomRight = solution.new Node(false, true, null, null, null, null);
    quadTree1.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree1.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node quadTree2 = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft = solution.new Node(false, false, null, null, null, null);
    quadTree2.topLeft.topLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topLeft.topRight = solution.new Node(false, true, null, null, null, null);
    quadTree2.topLeft.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.topLeft.bottomRight = solution.new Node(false, true, null, null, null, null);
    quadTree2.topRight = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomLeft = solution.new Node(true, true, null, null, null, null);
    quadTree2.bottomRight = solution.new Node(true, true, null, null, null, null);
    
    Node result = solution.intersect(quadTree1, quadTree2);
    Assert.assertFalse(result.isLeaf);
  }
}
