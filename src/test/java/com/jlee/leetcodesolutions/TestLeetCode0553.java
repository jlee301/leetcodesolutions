package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0553;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0553 {
  @Test
  public void testProblemCase() {
    int[] nums = {1000,100,10,2};
    LeetCode0553 solution = new LeetCode0553();
    Assert.assertEquals("1000/(100/10/2)", solution.optimalDivision(nums));
  }

  @Test
  public void testOneElement() {
    int[] nums = {100};
    LeetCode0553 solution = new LeetCode0553();
    Assert.assertEquals("100", solution.optimalDivision(nums));
  }

  @Test
  public void testTwoElements() {
    int[] nums = {100,10};
    LeetCode0553 solution = new LeetCode0553();
    Assert.assertEquals("100/10", solution.optimalDivision(nums));
  }

  @Test
  public void testThreeElements() {
    int[] nums = {100,10,1};
    LeetCode0553 solution = new LeetCode0553();
    Assert.assertEquals("100/(10/1)", solution.optimalDivision(nums));
  }

  @Test
  public void testFourElements() {
    int[] nums = {1000,100,10,1};
    LeetCode0553 solution = new LeetCode0553();
    Assert.assertEquals("1000/(100/10/1)", solution.optimalDivision(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0553 solution = new LeetCode0553();
    Assert.assertEquals("", solution.optimalDivision(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0553 solution = new LeetCode0553();
    Assert.assertEquals("", solution.optimalDivision(nums));
  }
}
