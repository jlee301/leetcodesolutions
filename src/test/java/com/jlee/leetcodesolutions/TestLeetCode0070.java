package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0070;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0070 {
  @Test
  public void testProblemCase0() {
    LeetCode0070 solution = new LeetCode0070();
    int result = solution.climbStairs(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase1() {
    LeetCode0070 solution = new LeetCode0070();
    int result = solution.climbStairs(1);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0070 solution = new LeetCode0070();
    int result = solution.climbStairs(2);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0070 solution = new LeetCode0070();
    int result = solution.climbStairs(3);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0070 solution = new LeetCode0070();
    int result = solution.climbStairs(4);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0070 solution = new LeetCode0070();
    int result = solution.climbStairs(5);
    Assert.assertEquals(8, result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0070 solution = new LeetCode0070();
    int result = solution.climbStairs(6);
    Assert.assertEquals(13, result);
  }
}
