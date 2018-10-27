package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode135;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode135 {
  @Test
  public void testProblemCase1() {
    int[] ratings = {1,0,2};
    LeetCode135 solution = new LeetCode135();
    Assert.assertEquals(5, solution.candy(ratings));
  }

  @Test
  public void testProblemCase2() {
    int[] ratings = {1,2,2};
    LeetCode135 solution = new LeetCode135();
    Assert.assertEquals(4, solution.candy(ratings));
  }
}
