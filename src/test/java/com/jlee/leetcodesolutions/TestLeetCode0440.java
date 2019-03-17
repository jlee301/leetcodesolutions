package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0440;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0440 {
  @Test
  public void testProblemCase1() {
    int n = 13, k = 2;
    LeetCode0440 solution = new LeetCode0440();
    Assert.assertEquals(10, solution.findKthNumber(n, k));
  }

  @Test
  public void testProblemCase2() {
    int n = 103, k = 1;
    LeetCode0440 solution = new LeetCode0440();
    Assert.assertEquals(1, solution.findKthNumber(n, k));
  }

  @Test
  public void testProblemCase3() {
    int n = 103, k = 2;
    LeetCode0440 solution = new LeetCode0440();
    Assert.assertEquals(10, solution.findKthNumber(n, k));
  }

  @Test
  public void testProblemCase4() {
    int n = 103, k = 3;
    LeetCode0440 solution = new LeetCode0440();
    Assert.assertEquals(100, solution.findKthNumber(n, k));
  }

  @Test
  public void testProblemCase5() {
    int n = 103, k = 4;
    LeetCode0440 solution = new LeetCode0440();
    Assert.assertEquals(101, solution.findKthNumber(n, k));
  }

  @Test
  public void testProblemCase6() {
    int n = 103, k = 5;
    LeetCode0440 solution = new LeetCode0440();
    Assert.assertEquals(102, solution.findKthNumber(n, k));
  }

  @Test
  public void testProblemCase7() {
    int n = 103, k = 6;
    LeetCode0440 solution = new LeetCode0440();
    Assert.assertEquals(103, solution.findKthNumber(n, k));
  }

  @Test
  public void testProblemCase8() {
    int n = 103, k = 7;
    LeetCode0440 solution = new LeetCode0440();
    Assert.assertEquals(11, solution.findKthNumber(n, k));
  }

  @Test
  public void testProblemCase9() {
    int n = 681692778, k = 351251360;
    LeetCode0440 solution = new LeetCode0440();
    Assert.assertEquals(416126219, solution.findKthNumber(n, k));
  }
}
