package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0552;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0552 {
  @Test
  public void testProblemCase1() {
    int n = 2;
    LeetCode0552 solution = new LeetCode0552();
    Assert.assertEquals(8, solution.checkRecord(n));
  }
  
  @Test
  public void testProblemCase2() {
    int n = 1;
    LeetCode0552 solution = new LeetCode0552();
    Assert.assertEquals(3, solution.checkRecord(n));
  }

  @Test
  public void testProblemCase3() {
    int n = 4;
    LeetCode0552 solution = new LeetCode0552();
    Assert.assertEquals(43, solution.checkRecord(n));
  }

  @Test
  public void testProblemCase4() {
    int n = 100;
    LeetCode0552 solution = new LeetCode0552();
    Assert.assertEquals(985598218, solution.checkRecord(n));
  }
}
