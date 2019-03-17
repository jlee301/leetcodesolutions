package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0670;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0670 {
  @Test
  public void testProblemCase1() {
    int num = 2736;
    LeetCode0670 solution = new LeetCode0670();
    Assert.assertEquals(7236, solution.maximumSwap(num));
  }

  @Test
  public void testProblemCase2() {
    int num = 9973;
    LeetCode0670 solution = new LeetCode0670();
    Assert.assertEquals(9973, solution.maximumSwap(num));
  }

  @Test
  public void test0() {
    int num = 0;
    LeetCode0670 solution = new LeetCode0670();
    Assert.assertEquals(0, solution.maximumSwap(num));
  }

  @Test
  public void test1000202() {
    int num = 1000202;
    LeetCode0670 solution = new LeetCode0670();
    Assert.assertEquals(2000201, solution.maximumSwap(num));
  }

  @Test
  public void test100000000() {
    int num = 100000000;
    LeetCode0670 solution = new LeetCode0670();
    Assert.assertEquals(100000000, solution.maximumSwap(num));
  }
  
  @Test
  public void testWrongAns() {
    int num = 98368;
    LeetCode0670 solution = new LeetCode0670();
    Assert.assertEquals(98863, solution.maximumSwap(num));    
  }
}
