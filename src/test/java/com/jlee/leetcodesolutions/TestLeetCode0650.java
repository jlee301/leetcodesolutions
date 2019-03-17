package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0650;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0650 {
  @Test
  public void testN1() {
    int n = 1;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(0, solution.minSteps(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(2, solution.minSteps(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(3, solution.minSteps(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(4, solution.minSteps(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(5, solution.minSteps(n));
  }

  @Test
  public void testN6() {
    int n = 5;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(5, solution.minSteps(n));
  }

  @Test
  public void testN7() {
    int n = 7;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(7, solution.minSteps(n));
  }

  @Test
  public void testN8() {
    int n = 8;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(6, solution.minSteps(n));
  }

  @Test
  public void testN9() {
    int n = 9;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(6, solution.minSteps(n));
  }

  @Test
  public void testN10() {
    int n = 10;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(7, solution.minSteps(n));
  }

  @Test
  public void testN1000() {
    int n = 1000;
    LeetCode0650 solution = new LeetCode0650();
    Assert.assertEquals(21, solution.minSteps(n));
  }
}
