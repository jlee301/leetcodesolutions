package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0982;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0982 {
  @Test
  public void testProblemCase1() {
    int[] A = {2,1,3};
    LeetCode0982 solution = new LeetCode0982();
    Assert.assertEquals(12, solution.countTriplets(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,100,101,102,103,104,105,106,107,108,109,110};
    LeetCode0982 solution = new LeetCode0982();
    Assert.assertEquals(39571, solution.countTriplets(A));
  }
}
