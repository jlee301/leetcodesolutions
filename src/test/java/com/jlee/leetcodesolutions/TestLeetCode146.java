package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode146;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode146 {
  @Test
  public void testProblemCase1() {
    LeetCode146 solution = new LeetCode146(2);
    solution.put(1, 1);
    solution.put(2, 2);
    Assert.assertEquals(1, solution.get(1));
    solution.put(3, 3);
    Assert.assertEquals(-1, solution.get(2));
    solution.put(4, 4);
    Assert.assertEquals(-1, solution.get(1));
    Assert.assertEquals(3, solution.get(3));
    Assert.assertEquals(4, solution.get(4));
    solution.put(3, 3);
    solution.put(5, 5);
    Assert.assertEquals(-1, solution.get(4));
    Assert.assertEquals(3, solution.get(3));
    Assert.assertEquals(5, solution.get(5));
  }
}
