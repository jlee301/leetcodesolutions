package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0135;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0135 {
  @Test
  public void testProblemCase1() {
    int[] ratings = {1,0,2};
    LeetCode0135 solution = new LeetCode0135();
    Assert.assertEquals(5, solution.candy(ratings));
  }

  @Test
  public void testProblemCase2() {
    int[] ratings = {1,2,2};
    LeetCode0135 solution = new LeetCode0135();
    Assert.assertEquals(4, solution.candy(ratings));
  }
}
