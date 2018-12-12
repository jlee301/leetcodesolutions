package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode641;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode641 {
  @Test
  public void testProblemCase1() {
    LeetCode641 solution = new LeetCode641(3);
    Assert.assertTrue(solution.isEmpty());
    Assert.assertFalse(solution.isFull());
    Assert.assertFalse(solution.deleteFront());
    Assert.assertFalse(solution.deleteLast());
    Assert.assertEquals(-1, solution.getFront());
    Assert.assertEquals(-1, solution.getRear());
    
    Assert.assertTrue(solution.insertLast(1));
    Assert.assertFalse(solution.isEmpty());
    Assert.assertFalse(solution.isFull());
    Assert.assertEquals(1, solution.getFront());
    Assert.assertEquals(1, solution.getRear());

    Assert.assertTrue(solution.insertLast(2));
    Assert.assertFalse(solution.isEmpty());
    Assert.assertFalse(solution.isFull());
    Assert.assertEquals(1, solution.getFront());
    Assert.assertEquals(2, solution.getRear());

    Assert.assertTrue(solution.insertFront(3));
    Assert.assertFalse(solution.isEmpty());
    Assert.assertTrue(solution.isFull());
    Assert.assertEquals(3, solution.getFront());
    Assert.assertEquals(2, solution.getRear());

    Assert.assertFalse(solution.insertFront(4));
    Assert.assertFalse(solution.isEmpty());
    Assert.assertTrue(solution.isFull());
    Assert.assertEquals(3, solution.getFront());
    Assert.assertEquals(2, solution.getRear());
    
    Assert.assertTrue(solution.deleteLast());
    Assert.assertFalse(solution.isEmpty());
    Assert.assertFalse(solution.isFull());
    Assert.assertEquals(3, solution.getFront());
    Assert.assertEquals(1, solution.getRear());

    Assert.assertTrue(solution.insertFront(4));
    Assert.assertFalse(solution.isEmpty());
    Assert.assertTrue(solution.isFull());
    Assert.assertEquals(4, solution.getFront());
    Assert.assertEquals(1, solution.getRear());
    
    Assert.assertFalse(solution.insertLast(5));
    Assert.assertTrue(solution.deleteFront());
    Assert.assertTrue(solution.deleteFront());
    Assert.assertTrue(solution.deleteFront());
    Assert.assertFalse(solution.deleteFront());
    Assert.assertEquals(-1, solution.getFront());
    Assert.assertEquals(-1, solution.getRear());
    Assert.assertTrue(solution.insertFront(5));
    Assert.assertEquals(5, solution.getFront());
    Assert.assertEquals(5, solution.getRear());
  }
}
