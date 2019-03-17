package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0707;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0707 {
  @Test
  public void testProblemCase1() {
    LeetCode0707 solution = new LeetCode0707();
    solution.addAtHead(1);
    solution.addAtTail(3);
    solution.addAtIndex(1, 2);
    solution.addAtIndex(5, 15);
    Assert.assertEquals(2, solution.get(1));
    solution.deleteAtIndex(1);
    solution.deleteAtIndex(5);
    Assert.assertEquals(3, solution.get(1));
    Assert.assertEquals(-1, solution.get(2));
  }
}
