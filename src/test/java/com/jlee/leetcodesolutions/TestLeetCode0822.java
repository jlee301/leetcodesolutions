package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0822;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0822 {
  @Test
  public void testProblemCase() {
    int[] fronts = {1,2,4,4,7}, backs = {1,3,4,1,3};
    LeetCode0822 solution = new LeetCode0822();
    Assert.assertEquals(2, solution.flipgame(fronts, backs));
  }

  @Test
  public void testOneCardSameNumbers() {
    int[] fronts = {1}, backs = {1};
    LeetCode0822 solution = new LeetCode0822();
    Assert.assertEquals(0, solution.flipgame(fronts, backs));
  }

  @Test
  public void testWrongAns() {
    int[] fronts = {1,1}, backs = {1,2};
    LeetCode0822 solution = new LeetCode0822();
    Assert.assertEquals(2, solution.flipgame(fronts, backs));
  }
}
