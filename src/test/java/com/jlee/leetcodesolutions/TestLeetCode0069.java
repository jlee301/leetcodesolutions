package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0069;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0069 {
  @Test
  public void testProblemCase0() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase1() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(1);
    Assert.assertEquals(1, result);
  }
  
  @Test
  public void testProblemCase2() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(2);
    Assert.assertEquals(1, result);
  }
  
  @Test
  public void testProblemCase3() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(3);
    Assert.assertEquals(1, result);
  }
  
  @Test
  public void testProblemCase4() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(4);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(5);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(6);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase7() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(7);
    Assert.assertEquals(2, result);
  }
  
  @Test
  public void testProblemCase8() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(8);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase9() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(9);
    Assert.assertEquals(3, result);
  }
  
  @Test
  public void testProblemCase10() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(10);
    Assert.assertEquals(3, result);
  }
  
  @Test
  public void testProblemCase11() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(25);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testProblemCase12() {
    LeetCode0069 solution = new LeetCode0069();
    int result = solution.mySqrt(2147395599);
    Assert.assertEquals(46339, result);
  }
}
