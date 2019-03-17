package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import com.jlee.leetcodesolutions.LeetCode0435;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0435 {
  @Test
  public void testProblemCase1() {
    Interval[] intervals = {new Interval(1,2), new Interval(2,3), new Interval(3,4), new Interval(1,3)};
    LeetCode0435 solution = new LeetCode0435();
    Assert.assertEquals(1, solution.eraseOverlapIntervals(intervals));
  }

  @Test
  public void testProblemCase2() {
    Interval[] intervals = {new Interval(1,2), new Interval(1,2), new Interval(1,2)};
    LeetCode0435 solution = new LeetCode0435();
    Assert.assertEquals(2, solution.eraseOverlapIntervals(intervals));
  }

  @Test
  public void testProblemCase3() {
    Interval[] intervals = {new Interval(1,2), new Interval(2,3)};
    LeetCode0435 solution = new LeetCode0435();
    Assert.assertEquals(0, solution.eraseOverlapIntervals(intervals));
  }

  @Test
  public void testOneEntry() {
    Interval[] intervals = {new Interval(1,2)};
    LeetCode0435 solution = new LeetCode0435();
    Assert.assertEquals(0, solution.eraseOverlapIntervals(intervals));
  }

  @Test
  public void testEmpty() {
    Interval[] intervals = {};
    LeetCode0435 solution = new LeetCode0435();
    Assert.assertEquals(0, solution.eraseOverlapIntervals(intervals));
  }

  @Test
  public void testNull() {
    Interval[] intervals = null;
    LeetCode0435 solution = new LeetCode0435();
    Assert.assertEquals(0, solution.eraseOverlapIntervals(intervals));
  }
}
