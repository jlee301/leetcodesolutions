package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import com.jlee.leetcodesolutions.LeetCode0986;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0986 {
  @Test
  public void testProblemCase1() {
    Interval[] A = { new Interval(0,2), new Interval(5,10), new Interval(13,23), new Interval(24,25) };
    Interval[] B = { new Interval(1,5), new Interval(8,12), new Interval(15,24), new Interval(25,26) };
    LeetCode0986 solution = new LeetCode0986();
    Interval[] result = solution.intervalIntersection(A, B);
    // [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
    Assert.assertEquals(6, result.length);
    Assert.assertEquals(1, result[0].start);
    Assert.assertEquals(2, result[0].end);
    Assert.assertEquals(5, result[1].start);
    Assert.assertEquals(5, result[1].end);
    Assert.assertEquals(8, result[2].start);
    Assert.assertEquals(10, result[2].end);
    Assert.assertEquals(15, result[3].start);
    Assert.assertEquals(23, result[3].end);
    Assert.assertEquals(24, result[4].start);
    Assert.assertEquals(24, result[4].end);
    Assert.assertEquals(25, result[5].start);
    Assert.assertEquals(25, result[5].end);
  }
  
  @Test
  public void testProblemCase2() {
    Interval[] A = { new Interval(0,2) };
    Interval[] B = { new Interval(3,4) };
    LeetCode0986 solution = new LeetCode0986();
    Interval[] result = solution.intervalIntersection(A, B);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testProblemCase3() {
    Interval[] A = { new Interval(3,4) };
    Interval[] B = { new Interval(0,2) };
    LeetCode0986 solution = new LeetCode0986();
    Interval[] result = solution.intervalIntersection(A, B);
    Assert.assertEquals(0, result.length);
  }
}
