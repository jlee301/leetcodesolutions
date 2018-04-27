package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode672;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode672 {
  @Test
  public void testProblemCase1() {
    int n = 1, m = 1;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(2, solution.flipLights(n, m));
  }

  @Test
  public void testProblemCase2() {
    int n = 2, m = 1;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(3, solution.flipLights(n, m));
  }

  @Test
  public void testProblemCase3() {
    int n = 3, m = 1;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(4, solution.flipLights(n, m));
  }

  @Test
  public void testN1M1() {
    int n = 1, m = 1;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(2, solution.flipLights(n, m));
  }

  @Test
  public void testN1M2() {
    int n = 1, m = 2;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(2, solution.flipLights(n, m));
  }

  @Test
  public void testN1M3() {
    int n = 1, m = 3;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(2, solution.flipLights(n, m));
  }

  @Test
  public void testN1M4() {
    int n = 1, m = 4;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(2, solution.flipLights(n, m));
  }

  @Test
  public void testN2M1() {
    int n = 2, m = 1;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(3, solution.flipLights(n, m));
  }

  @Test
  public void testN2M2() {
    int n = 2, m = 2;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(4, solution.flipLights(n, m));
  }

  @Test
  public void testN2M3() {
    int n = 2, m = 3;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(4, solution.flipLights(n, m));
  }

  @Test
  public void testN2M4() {
    int n = 2, m = 4;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(4, solution.flipLights(n, m));
  }

  @Test
  public void testN3M1() {
    int n = 3, m = 1;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(4, solution.flipLights(n, m));
  }

  @Test
  public void testN3M2() {
    int n = 3, m = 2;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(7, solution.flipLights(n, m));
  }

  @Test
  public void testN3M3() {
    int n = 3, m = 3;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(8, solution.flipLights(n, m));
  }

  @Test
  public void testN3M4() {
    int n = 3, m = 4;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(8, solution.flipLights(n, m));
  }

  @Test
  public void testN4M1() {
    int n = 4, m = 1;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(4, solution.flipLights(n, m));
  }

  @Test
  public void testN4M2() {
    int n = 4, m = 2;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(7, solution.flipLights(n, m));
  }

  @Test
  public void testN4M3() {
    int n = 4, m = 3;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(8, solution.flipLights(n, m));
  }

  @Test
  public void testN4M4() {
    int n = 4, m = 4;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(8, solution.flipLights(n, m));
  }

  @Test
  public void testN0M1() {
    int n = 0, m = 1;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(1, solution.flipLights(n, m));
  }

  @Test
  public void testN1M0() {
    int n = 1, m = 0;
    LeetCode672 solution = new LeetCode672();
    Assert.assertEquals(1, solution.flipLights(n, m));
  }
}
