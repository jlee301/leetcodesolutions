package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode070;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode070 {
  @Test
  public void testStep0() {
    LeetCode070 solution = new LeetCode070();
    int result = solution.climbStairs(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testStep1() {
    LeetCode070 solution = new LeetCode070();
    int result = solution.climbStairs(1);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testStep2() {
    LeetCode070 solution = new LeetCode070();
    int result = solution.climbStairs(2);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testStep3() {
    LeetCode070 solution = new LeetCode070();
    int result = solution.climbStairs(3);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testStep4() {
    LeetCode070 solution = new LeetCode070();
    int result = solution.climbStairs(4);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testStep5() {
    LeetCode070 solution = new LeetCode070();
    int result = solution.climbStairs(5);
    Assert.assertEquals(8, result);
  }

  @Test
  public void testStep6() {
    LeetCode070 solution = new LeetCode070();
    int result = solution.climbStairs(6);
    Assert.assertEquals(13, result);
  }

  @Test
  public void testStepNeg() {
    LeetCode070 solution = new LeetCode070();
    int result = solution.climbStairs(-1);
    Assert.assertEquals(0, result);
  }
}
