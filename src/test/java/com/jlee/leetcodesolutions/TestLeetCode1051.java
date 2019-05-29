package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1051;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1051 {
  @Test
  public void testProblemCase1() {
    int[] heights = {1,1,4,2,1,3};
    LeetCode1051 solution = new LeetCode1051();
    Assert.assertEquals(3, solution.heightChecker(heights));
  }

  @Test
  public void testProblemCase2() {
    int[] heights = {1,1,1,2,3,4};
    LeetCode1051 solution = new LeetCode1051();
    Assert.assertEquals(0, solution.heightChecker(heights));
  }
}
