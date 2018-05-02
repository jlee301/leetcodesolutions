package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode729;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode729 {
  @Test
  public void testProblemCase() {
    LeetCode729 solution = new LeetCode729();
    Assert.assertTrue(solution.book(10, 20));
    Assert.assertFalse(solution.book(10, 20));

    Assert.assertFalse(solution.book(1, 11));
    Assert.assertTrue(solution.book(1, 10));

    Assert.assertFalse(solution.book(15, 25));

    Assert.assertTrue(solution.book(20, 30));

    Assert.assertTrue(solution.book(40, 50));

    Assert.assertFalse(solution.book(29, 35));
    Assert.assertFalse(solution.book(35, 41));
    Assert.assertTrue(solution.book(35, 39));
  }
}
