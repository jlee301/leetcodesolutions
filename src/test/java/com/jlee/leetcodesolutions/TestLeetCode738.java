package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode738;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode738 {
  @Test
  public void testProblemCase1() {
    int N = 10;
    LeetCode738 solution = new LeetCode738();
    Assert.assertEquals(9, solution.monotoneIncreasingDigits(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 1234;
    LeetCode738 solution = new LeetCode738();
    Assert.assertEquals(1234, solution.monotoneIncreasingDigits(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 332;
    LeetCode738 solution = new LeetCode738();
    Assert.assertEquals(299, solution.monotoneIncreasingDigits(N));
  }

  @Test
  public void test342() {
    int N = 342;
    LeetCode738 solution = new LeetCode738();
    Assert.assertEquals(339, solution.monotoneIncreasingDigits(N));
  }

  @Test
  public void test432() {
    int N = 432;
    LeetCode738 solution = new LeetCode738();
    Assert.assertEquals(399, solution.monotoneIncreasingDigits(N));
  }
  
  @Test
  public void test668841() {
    int N = 668841;
    LeetCode738 solution = new LeetCode738();
    Assert.assertEquals(667999, solution.monotoneIncreasingDigits(N));
  }  
}
