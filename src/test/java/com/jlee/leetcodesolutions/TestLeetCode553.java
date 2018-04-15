package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode553;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode553 {
  @Test
  public void testProblemCase() {
    int[] nums = {1000,100,10,2};
    LeetCode553 solution = new LeetCode553();
    Assert.assertEquals("1000/(100/10/2)", solution.optimalDivision(nums));
  }

  @Test
  public void testOneElement() {
    int[] nums = {100};
    LeetCode553 solution = new LeetCode553();
    Assert.assertEquals("100", solution.optimalDivision(nums));
  }

  @Test
  public void testTwoElements() {
    int[] nums = {100,10};
    LeetCode553 solution = new LeetCode553();
    Assert.assertEquals("100/10", solution.optimalDivision(nums));
  }

  @Test
  public void testThreeElements() {
    int[] nums = {100,10,1};
    LeetCode553 solution = new LeetCode553();
    Assert.assertEquals("100/(10/1)", solution.optimalDivision(nums));
  }

  @Test
  public void testFourElements() {
    int[] nums = {1000,100,10,1};
    LeetCode553 solution = new LeetCode553();
    Assert.assertEquals("1000/(100/10/1)", solution.optimalDivision(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode553 solution = new LeetCode553();
    Assert.assertEquals("", solution.optimalDivision(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode553 solution = new LeetCode553();
    Assert.assertEquals("", solution.optimalDivision(nums));
  }
}
