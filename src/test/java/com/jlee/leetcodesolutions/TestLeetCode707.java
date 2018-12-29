package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode707;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode707 {
  @Test
  public void testProblemCase1() {
    LeetCode707 solution = new LeetCode707();
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
