package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0900;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0900 {
  @Test
  public void testProblemCase1() {
    int[] A = {3,8,0,9,2,5};
    // [8,8,8,5,5]
    LeetCode0900 solution = new LeetCode0900(A);
    Assert.assertEquals(8, solution.next(2));
    Assert.assertEquals(8, solution.next(1));
    Assert.assertEquals(5, solution.next(1));
    Assert.assertEquals(-1, solution.next(2));
  }
}
