package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1013;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1013 {
  @Test
  public void testProblemCase1() {
    int[] time = {30,20,150,100,40};
    LeetCode1013 solution = new LeetCode1013();
    Assert.assertEquals(3, solution.numPairsDivisibleBy60(time));
  }

  @Test
  public void testProblemCase2() {
    int[] time = {60,60,60};
    LeetCode1013 solution = new LeetCode1013();
    Assert.assertEquals(3, solution.numPairsDivisibleBy60(time));
  }
}
