package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import com.jlee.leetcodesolutions.LeetCode0056;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0056 {
  @Test
  public void testProblemCase() {
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(1,3));
    intervals.add(new Interval(2,6));
    intervals.add(new Interval(8,10));
    intervals.add(new Interval(15,18));
    LeetCode0056 solution = new LeetCode0056();
    List<Interval> result = solution.merge(intervals);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, result.get(0).start);
    Assert.assertEquals(6, result.get(0).end);
    Assert.assertEquals(8, result.get(1).start);
    Assert.assertEquals(10, result.get(1).end);
    Assert.assertEquals(15, result.get(2).start);
    Assert.assertEquals(18, result.get(2).end);
  }

  @Test
  public void testProblemCase2() {
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(1,3));
    intervals.add(new Interval(2,6));
    intervals.add(new Interval(15,18));
    intervals.add(new Interval(6,10));
    LeetCode0056 solution = new LeetCode0056();
    List<Interval> result = solution.merge(intervals);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, result.get(0).start);
    Assert.assertEquals(10, result.get(0).end);
    Assert.assertEquals(15, result.get(1).start);
    Assert.assertEquals(18, result.get(1).end);
  }
  
  @Test
  public void testAscendingExceptForLastEntry() {
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(2,3));
    intervals.add(new Interval(4,5));
    intervals.add(new Interval(6,7));
    intervals.add(new Interval(8,9));
    intervals.add(new Interval(1,10));
    LeetCode0056 solution = new LeetCode0056();
    List<Interval> result = solution.merge(intervals);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, result.get(0).start);
    Assert.assertEquals(10, result.get(0).end);
  }
  
  @Test
  public void testComparatorALessThanB() {
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(2,3));
    intervals.add(new Interval(4,5));
    LeetCode0056 solution = new LeetCode0056();
    List<Interval> result = solution.merge(intervals);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(2, result.get(0).start);
    Assert.assertEquals(3, result.get(0).end);
    Assert.assertEquals(4, result.get(1).start);
    Assert.assertEquals(5, result.get(1).end);
  }
  
  @Test
  public void testComparatorAEqualB() {
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(2,3));
    intervals.add(new Interval(2,5));
    LeetCode0056 solution = new LeetCode0056();
    List<Interval> result = solution.merge(intervals);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(2, result.get(0).start);
    Assert.assertEquals(5, result.get(0).end);
  }
  
  @Test
  public void testComparatorAGreaterThanB() {
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(4,5));
    intervals.add(new Interval(2,3));
    LeetCode0056 solution = new LeetCode0056();
    List<Interval> result = solution.merge(intervals);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(2, result.get(0).start);
    Assert.assertEquals(3, result.get(0).end);
    Assert.assertEquals(4, result.get(1).start);
    Assert.assertEquals(5, result.get(1).end);
  }
  
  @Test
  public void testOneEntry() {
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval());
    LeetCode0056 solution = new LeetCode0056();
    List<Interval> result = solution.merge(intervals);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(0, result.get(0).start);
    Assert.assertEquals(0, result.get(0).end);
  }

  @Test
  public void testEmpty() {
    List<Interval> intervals = new ArrayList<>();
    LeetCode0056 solution = new LeetCode0056();
    List<Interval> result = solution.merge(intervals);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    List<Interval> intervals = null;
    LeetCode0056 solution = new LeetCode0056();
    List<Interval> result = solution.merge(intervals);
    Assert.assertNull(result);
  }
}
