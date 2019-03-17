package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0857;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0857 {
  @Test
  public void testProblemCase1() {
    int[] quality = {10,20,5}, wage = {70,50,30};
    int K = 2;
    LeetCode0857 solution = new LeetCode0857();
    Assert.assertEquals(105.0, solution.mincostToHireWorkers(quality, wage, K), 0.0);
  }

  @Test
  public void testProblemCase2() {
    int[] quality = {3,1,10,10,1}, wage = {4,8,2,2,7};
    int K = 3;
    LeetCode0857 solution = new LeetCode0857();
    Assert.assertEquals(30.666666666666664, solution.mincostToHireWorkers(quality, wage, K), 0.0);
  }
}
