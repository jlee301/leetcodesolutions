package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0790;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0790 {
  @Test
  public void testN0() {
    int N = 0;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(0, solution.numTilings(N));
  }
  
  @Test
  public void testN1() {
    int N = 1;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(1, solution.numTilings(N));
  }

  @Test
  public void testN2() {
    int N = 2;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(2, solution.numTilings(N));
  }

  @Test
  public void testN3() {
    int N = 3;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(5, solution.numTilings(N));
  }

  @Test
  public void testN4() {
    int N = 4;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(11, solution.numTilings(N));
  }

  @Test
  public void testN5() {
    int N = 5;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(24, solution.numTilings(N));
  }

  @Test
  public void testN6() {
    int N = 6;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(53, solution.numTilings(N));
  }

  @Test
  public void testN7() {
    int N = 7;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(117, solution.numTilings(N));
  }

  @Test
  public void testN8() {
    int N = 8;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(258, solution.numTilings(N));
  }

  @Test
  public void testN9() {
    int N = 9;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(569, solution.numTilings(N));
  }

  @Test
  public void testN10() {
    int N = 10;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(1255, solution.numTilings(N));
  }

  @Test
  public void testN1000() {
    int N = 1000;
    LeetCode0790 solution = new LeetCode0790();
    Assert.assertEquals(979232805, solution.numTilings(N));
  }
}
