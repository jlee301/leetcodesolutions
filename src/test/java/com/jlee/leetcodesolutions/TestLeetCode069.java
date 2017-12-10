package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode069;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode069 {
  @Test
  public void testSqRt25() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(25);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testSqRt10() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(10);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testSqRt9() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(9);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testSqRt8() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(8);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testSqRt7() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(7);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testSqRt6() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(6);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testSqRt5() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(5);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testSqRt4() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(4);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testSqRt3() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(3);
    Assert.assertEquals(1, result);
  }
  
  @Test
  public void testSqRt2() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(2);
    Assert.assertEquals(1, result);
  }
  
  @Test
  public void testSqRt1() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(1);
    Assert.assertEquals(1, result);
  }
  
  @Test
  public void testSqRt0() {
    LeetCode069 solution = new LeetCode069();
    int result = solution.mySqrt(0);
    Assert.assertEquals(0, result);
  }
}
