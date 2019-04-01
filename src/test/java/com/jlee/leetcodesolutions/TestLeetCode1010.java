package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1010;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1010 {
  @Test
  public void testProblemCase1() {
    int[] time = {30,20,150,100,40};
    LeetCode1010 solution = new LeetCode1010();
    Assert.assertEquals(3, solution.numPairsDivisibleBy60(time));
  }

  @Test
  public void testProblemCase2() {
    int[] time = {60,60,60};
    LeetCode1010 solution = new LeetCode1010();
    Assert.assertEquals(3, solution.numPairsDivisibleBy60(time));
  }
}
