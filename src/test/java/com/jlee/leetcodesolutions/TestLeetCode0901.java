package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0901;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0901 {
  @Test
  public void testProblemCase1() {
    LeetCode0901 solution = new LeetCode0901();
    Assert.assertEquals(1, solution.next(100));
    Assert.assertEquals(1, solution.next(80));
    Assert.assertEquals(1, solution.next(60));
    Assert.assertEquals(2, solution.next(70));
    Assert.assertEquals(1, solution.next(60));
    Assert.assertEquals(4, solution.next(75));
    Assert.assertEquals(6, solution.next(85));
    Assert.assertEquals(8, solution.next(105));
  }
}
