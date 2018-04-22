package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode822;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode822 {
  @Test
  public void testProblemCase() {
    int[] fronts = {1,2,4,4,7}, backs = {1,3,4,1,3};
    LeetCode822 solution = new LeetCode822();
    Assert.assertEquals(2, solution.flipgame(fronts, backs));
  }

  @Test
  public void testOneCardSameNumbers() {
    int[] fronts = {1}, backs = {1};
    LeetCode822 solution = new LeetCode822();
    Assert.assertEquals(0, solution.flipgame(fronts, backs));
  }

  @Test
  public void testWrongAns() {
    int[] fronts = {1,1}, backs = {1,2};
    LeetCode822 solution = new LeetCode822();
    Assert.assertEquals(2, solution.flipgame(fronts, backs));
  }
}
