package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode556;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode556 {
  @Test
  public void testProblemCase1() {
    int n = 12;
    LeetCode556 solution = new LeetCode556();
    Assert.assertEquals(21, solution.nextGreaterElement(n));
  }

  @Test
  public void testProblemCase2() {
    int n = 21;
    LeetCode556 solution = new LeetCode556();
    Assert.assertEquals(-1, solution.nextGreaterElement(n));
  }

  @Test
  public void testAllAscending() {
    int n = 1234;
    LeetCode556 solution = new LeetCode556();
    Assert.assertEquals(1243, solution.nextGreaterElement(n));
  }

  @Test
  public void testAllDescending() {
    int n = 4321;
    LeetCode556 solution = new LeetCode556();
    Assert.assertEquals(-1, solution.nextGreaterElement(n));
  }

  @Test
  public void testLastInstance2ndPos() {
    int n = 1243;
    LeetCode556 solution = new LeetCode556();
    Assert.assertEquals(1324, solution.nextGreaterElement(n));
  }

  @Test
  public void testLastInstance1stPos() {
    int n = 143;
    LeetCode556 solution = new LeetCode556();
    Assert.assertEquals(314, solution.nextGreaterElement(n));
  }

  @Test
  public void testSingleDigit() {
    int n = 1;
    LeetCode556 solution = new LeetCode556();
    Assert.assertEquals(-1, solution.nextGreaterElement(n));
  }

  @Test
  public void testMaxInteger() {
    int n = Integer.MAX_VALUE;
    LeetCode556 solution = new LeetCode556();
    Assert.assertEquals(-1, solution.nextGreaterElement(n));
  }

  @Test
  public void testFindingLeastGreatest() {
    int n = 125432;
    LeetCode556 solution = new LeetCode556();
    Assert.assertEquals(132245, solution.nextGreaterElement(n));
  }
}
