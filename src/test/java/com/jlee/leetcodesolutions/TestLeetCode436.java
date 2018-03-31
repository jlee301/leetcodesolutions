package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import com.jlee.leetcodesolutions.LeetCode436;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode436 {
  @Test
  public void testProblemCase1() {
    Interval[] intervals = { new Interval(1,2) };
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {-1}, solution.findRightInterval(intervals));
  }

  @Test
  public void testProblemCase2() {
    Interval[] intervals = { new Interval(3,4), new Interval(2,3), new Interval(1,2) };
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {-1,0,1}, solution.findRightInterval(intervals));
  }

  @Test
  public void testProblemCase3() {
    Interval[] intervals = { new Interval(1,4), new Interval(2,3), new Interval(3,4) };
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {-1,2,-1}, solution.findRightInterval(intervals));
  }

  @Test
  public void testMultipleChoices() {
    Interval[] intervals = { new Interval(1,2), new Interval(5,6), new Interval(4,5), new Interval(6,7) };
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {2, 3, 1, -1}, solution.findRightInterval(intervals));
  }

  @Test
  public void testWrongAns() {
    Interval[] intervals = { new Interval(1,12), new Interval(2,9), new Interval(3,10), new Interval(13,14), new Interval(15,16), new Interval(16,17) };
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {3,3,3,4,5,-1}, solution.findRightInterval(intervals));
  }

  @Test
  public void testEmpty() {
    Interval[] intervals = {};
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {}, solution.findRightInterval(intervals));
  }

  @Test
  public void testNull() {
    Interval[] intervals = null;
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {}, solution.findRightInterval(intervals));
  }
  
  @Test
  public void testProblemCase1TL() {
    Interval[] intervals = { new Interval(1,2) };
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {-1}, solution.findRightIntervalTL(intervals));
  }

  @Test
  public void testProblemCase2TL() {
    Interval[] intervals = { new Interval(3,4), new Interval(2,3), new Interval(1,2) };
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {-1,0,1}, solution.findRightIntervalTL(intervals));
  }

  @Test
  public void testProblemCase3TL() {
    Interval[] intervals = { new Interval(1,4), new Interval(2,3), new Interval(3,4) };
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {-1,2,-1}, solution.findRightIntervalTL(intervals));
  }

  @Test
  public void testMultipleChoicesTL() {
    Interval[] intervals = { new Interval(1,2), new Interval(5,6), new Interval(4,5), new Interval(6,7) };
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {2, 3, 1, -1}, solution.findRightIntervalTL(intervals));
  }

  @Test
  public void testWrongAnsTL() {
    Interval[] intervals = { new Interval(1,12), new Interval(2,9), new Interval(3,10), new Interval(13,14), new Interval(15,16), new Interval(16,17) };
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {3,3,3,4,5,-1}, solution.findRightIntervalTL(intervals));
  }

  @Test
  public void testEmptyTL() {
    Interval[] intervals = {};
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {}, solution.findRightIntervalTL(intervals));
  }

  @Test
  public void testNullTL() {
    Interval[] intervals = null;
    LeetCode436 solution = new LeetCode436();
    Assert.assertArrayEquals(new int[] {}, solution.findRightIntervalTL(intervals));
  }
}
