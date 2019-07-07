package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1109;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1109 {
  @Test
  public void testProblemCase1() {
    int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
    int n = 5;
    LeetCode1109 solution = new LeetCode1109();
    Assert.assertArrayEquals(new int[] {10,55,45,25,25}, solution.corpFlightBookings(bookings, n));
  }
}
