package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0319;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0319 {
  @Test
  public void testN0() {
    int n = 0;
    LeetCode0319 solution = new LeetCode0319();
    Assert.assertEquals(0, solution.bulbSwitch(n));
  }

  @Test
  public void testN1() {
    int n = 1;
    LeetCode0319 solution = new LeetCode0319();
    Assert.assertEquals(1, solution.bulbSwitch(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode0319 solution = new LeetCode0319();
    Assert.assertEquals(1, solution.bulbSwitch(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode0319 solution = new LeetCode0319();
    Assert.assertEquals(1, solution.bulbSwitch(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode0319 solution = new LeetCode0319();
    Assert.assertEquals(2, solution.bulbSwitch(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode0319 solution = new LeetCode0319();
    Assert.assertEquals(2, solution.bulbSwitch(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode0319 solution = new LeetCode0319();
    Assert.assertEquals(2, solution.bulbSwitch(n));
  }

  @Test
  public void testN7() {
    int n = 7;
    LeetCode0319 solution = new LeetCode0319();
    Assert.assertEquals(2, solution.bulbSwitch(n));
  }

  @Test
  public void testN8() {
    int n = 8;
    LeetCode0319 solution = new LeetCode0319();
    Assert.assertEquals(2, solution.bulbSwitch(n));
  }

  @Test
  public void testN9() {
    int n = 9;
    LeetCode0319 solution = new LeetCode0319();
    Assert.assertEquals(3, solution.bulbSwitch(n));
  }
}
