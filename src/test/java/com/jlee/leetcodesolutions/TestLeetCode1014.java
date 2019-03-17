package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1014;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1014 {
  @Test
  public void testProblemCase1() {
    int[] weights = {1,2,3,4,5,6,7,8,9,10};
    int D = 5;
    LeetCode1014 solution = new LeetCode1014();
    Assert.assertEquals(15, solution.shipWithinDays(weights, D));
  }

  @Test
  public void testProblemCase2() {
    int[] weights = {3,2,2,4,1,4};
    int D = 3;
    LeetCode1014 solution = new LeetCode1014();
    Assert.assertEquals(6, solution.shipWithinDays(weights, D));
  }

  @Test
  public void testProblemCase3() {
    int[] weights = {1,2,3,1,1};
    int D = 4;
    LeetCode1014 solution = new LeetCode1014();
    Assert.assertEquals(3, solution.shipWithinDays(weights, D));
  }

  @Test
  public void testProblemCase5() {
    int[] weights = {1,1,1,1,1};
    int D = 1;
    LeetCode1014 solution = new LeetCode1014();
    Assert.assertEquals(5, solution.shipWithinDays(weights, D));
  }
}
