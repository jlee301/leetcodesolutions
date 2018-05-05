package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode754;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode754 {
  @Test
  public void testProblemCase1() {
    int target = 3;
    LeetCode754 solution = new LeetCode754();
    Assert.assertEquals(2, solution.reachNumber(target));
  }

  @Test
  public void testProblemCase2() {
    int target = 2;
    LeetCode754 solution = new LeetCode754();
    Assert.assertEquals(3, solution.reachNumber(target));
  }
}
