package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode622;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode622 {
  @Test
  public void testProblemCase1() {
    LeetCode622 solution = new LeetCode622(3);
    Assert.assertFalse(solution.deQueue());
    Assert.assertFalse(solution.isFull());
    Assert.assertTrue(solution.isEmpty());
    Assert.assertEquals(-1, solution.Front());
    Assert.assertEquals(-1, solution.Rear());

    Assert.assertTrue(solution.enQueue(1));
    Assert.assertFalse(solution.isFull());
    Assert.assertFalse(solution.isEmpty());
    Assert.assertEquals(1, solution.Front());
    Assert.assertEquals(1, solution.Rear());

    Assert.assertTrue(solution.enQueue(2));
    Assert.assertFalse(solution.isFull());
    Assert.assertFalse(solution.isEmpty());
    Assert.assertEquals(1, solution.Front());
    Assert.assertEquals(2, solution.Rear());

    Assert.assertTrue(solution.enQueue(3));
    Assert.assertTrue(solution.isFull());
    Assert.assertFalse(solution.isEmpty());
    Assert.assertEquals(1, solution.Front());
    Assert.assertEquals(3, solution.Rear());

    Assert.assertFalse(solution.enQueue(4));
    Assert.assertTrue(solution.isFull());
    Assert.assertFalse(solution.isEmpty());
    Assert.assertEquals(1, solution.Front());
    Assert.assertEquals(3, solution.Rear());

    Assert.assertTrue(solution.deQueue());
    Assert.assertFalse(solution.isFull());
    Assert.assertFalse(solution.isEmpty());
    Assert.assertEquals(2, solution.Front());
    Assert.assertEquals(3, solution.Rear());

    Assert.assertTrue(solution.enQueue(4));
    Assert.assertTrue(solution.isFull());
    Assert.assertFalse(solution.isEmpty());
    Assert.assertEquals(2, solution.Front());
    Assert.assertEquals(4, solution.Rear());
  }
}
