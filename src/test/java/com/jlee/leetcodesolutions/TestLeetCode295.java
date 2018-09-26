package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode295;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode295 {
  @Test
  public void testProblemCase1() {
    LeetCode295 solution = new LeetCode295();
    Assert.assertEquals(0.0, solution.findMedian(), 0.0);
    solution.addNum(1);
    Assert.assertEquals(1.0, solution.findMedian(), 0.0);
    solution.addNum(2);
    Assert.assertEquals(1.5, solution.findMedian(), 0.0);
    solution.addNum(3);
    Assert.assertEquals(2.0, solution.findMedian(), 0.0);
  }

  @Test
  public void testProblemCase2() {
    LeetCode295 solution = new LeetCode295();
    Assert.assertEquals(0.0, solution.findMedian(), 0.0);
    solution.addNum(5);
    Assert.assertEquals(5.0, solution.findMedian(), 0.0);
    solution.addNum(2);
    Assert.assertEquals(3.5, solution.findMedian(), 0.0);
    solution.addNum(5);
    Assert.assertEquals(5.0, solution.findMedian(), 0.0);
    solution.addNum(6);
    Assert.assertEquals(5.0, solution.findMedian(), 0.0);
  }
}
