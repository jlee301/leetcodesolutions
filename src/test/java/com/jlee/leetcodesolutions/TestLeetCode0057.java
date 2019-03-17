package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import com.jlee.leetcodesolutions.LeetCode0057;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0057 {
  @Test
  public void testProblemCase1() {
    List<Interval> intervals = Arrays.asList(new Interval[] { new Interval(1,3), new Interval(6,9) });
    Interval newInterval = new Interval(2,5);
    LeetCode0057 solution = new LeetCode0057();
    List<Interval> result = solution.insert(intervals, newInterval);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, result.get(0).start);
    Assert.assertEquals(5, result.get(0).end);
    Assert.assertEquals(6, result.get(1).start);
    Assert.assertEquals(9, result.get(1).end);
  }

  @Test
  public void testProblemCase2() {
    List<Interval> intervals = Arrays.asList(new Interval[] { new Interval(1,2), new Interval(3,5), new Interval(6,7), new Interval(8,10), new Interval(12,16) });
    Interval newInterval = new Interval(4,8);
    LeetCode0057 solution = new LeetCode0057();
    List<Interval> result = solution.insert(intervals, newInterval);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, result.get(0).start);
    Assert.assertEquals(2, result.get(0).end);
    Assert.assertEquals(3, result.get(1).start);
    Assert.assertEquals(10, result.get(1).end);
    Assert.assertEquals(12, result.get(2).start);
    Assert.assertEquals(16, result.get(2).end);
  }

  @Test
  public void testProblemCase3() {
    List<Interval> intervals = Arrays.asList(new Interval[] { new Interval(3,5) });
    Interval newInterval = new Interval(1,2);
    LeetCode0057 solution = new LeetCode0057();
    List<Interval> result = solution.insert(intervals, newInterval);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, result.get(0).start);
    Assert.assertEquals(2, result.get(0).end);
    Assert.assertEquals(3, result.get(1).start);
    Assert.assertEquals(5, result.get(1).end);
  }

  @Test
  public void testProblemCase4() {
    List<Interval> intervals = Arrays.asList(new Interval[] { new Interval(3,5) });
    Interval newInterval = new Interval(4,6);
    LeetCode0057 solution = new LeetCode0057();
    List<Interval> result = solution.insert(intervals, newInterval);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(3, result.get(0).start);
    Assert.assertEquals(6, result.get(0).end);
  }

  @Test
  public void testProblemCase5() {
    List<Interval> intervals = new ArrayList<>();
    Interval newInterval = new Interval(5,7);
    LeetCode0057 solution = new LeetCode0057();
    List<Interval> result = solution.insert(intervals, newInterval);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(5, result.get(0).start);
    Assert.assertEquals(7, result.get(0).end);
  }

  @Test
  public void testProblemCase6() {
    List<Interval> intervals = Arrays.asList(new Interval[] { new Interval(1,5) });
    Interval newInterval = new Interval(6,8);
    LeetCode0057 solution = new LeetCode0057();
    List<Interval> result = solution.insert(intervals, newInterval);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, result.get(0).start);
    Assert.assertEquals(5, result.get(0).end);
    Assert.assertEquals(6, result.get(1).start);
    Assert.assertEquals(8, result.get(1).end);
  }

  @Test
  public void testProblemCase7() {
    List<Interval> intervals = Arrays.asList(new Interval[] { new Interval(1,5) });
    Interval newInterval = new Interval(0,3);
    LeetCode0057 solution = new LeetCode0057();
    List<Interval> result = solution.insert(intervals, newInterval);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(0, result.get(0).start);
    Assert.assertEquals(5, result.get(0).end);
  }
}
