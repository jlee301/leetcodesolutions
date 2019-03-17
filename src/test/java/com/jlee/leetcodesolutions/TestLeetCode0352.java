package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0352;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0352 {
  @Test
  public void testProblemCase1() {
    LeetCode0352 solution = new LeetCode0352();
    solution.addNum(1);
    solution.addNum(3);
    solution.addNum(7);
    solution.addNum(2);
    solution.addNum(6);
    List<Interval> result = solution.getIntervals();
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, result.get(0).start);
    Assert.assertEquals(3, result.get(0).end);
    Assert.assertEquals(6, result.get(1).start);
    Assert.assertEquals(7, result.get(1).end);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0352 solution = new LeetCode0352();
    solution.addNum(5);
    solution.addNum(6);
    solution.addNum(8);
    List<Interval> result = solution.getIntervals();
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(5, result.get(0).start);
    Assert.assertEquals(6, result.get(0).end);
    Assert.assertEquals(8, result.get(1).start);
    Assert.assertEquals(8, result.get(1).end);
    solution.addNum(4);
    solution.addNum(1);
    result = solution.getIntervals();
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, result.get(0).start);
    Assert.assertEquals(1, result.get(0).end);
    Assert.assertEquals(4, result.get(1).start);
    Assert.assertEquals(6, result.get(1).end);
    Assert.assertEquals(8, result.get(2).start);
    Assert.assertEquals(8, result.get(2).end);    
    solution.addNum(2);
    solution.addNum(12);
    solution.addNum(10);
    solution.addNum(10);
    result = solution.getIntervals();
    Assert.assertEquals(5, result.size());
    Assert.assertEquals(1, result.get(0).start);
    Assert.assertEquals(2, result.get(0).end);
    Assert.assertEquals(4, result.get(1).start);
    Assert.assertEquals(6, result.get(1).end);
    Assert.assertEquals(8, result.get(2).start);
    Assert.assertEquals(8, result.get(2).end);    
    Assert.assertEquals(10, result.get(3).start);
    Assert.assertEquals(10, result.get(3).end);    
    Assert.assertEquals(12, result.get(4).start);
    Assert.assertEquals(12, result.get(4).end);
  }
}
