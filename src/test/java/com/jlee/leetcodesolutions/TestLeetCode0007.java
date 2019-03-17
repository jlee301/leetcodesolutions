package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0007;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0007 {

  @Test
  public void testProblemCase1() {
    LeetCode0007 solution = new LeetCode0007();
    int result = solution.reverse(123);
    Assert.assertEquals(321, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0007 solution = new LeetCode0007();
    int result = solution.reverse(-321);
    Assert.assertEquals(-123, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0007 solution = new LeetCode0007();
    int result = solution.reverse(120);
    Assert.assertEquals(21, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0007 solution = new LeetCode0007();
    int result = solution.reverse(1);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0007 solution = new LeetCode0007();
    int result = solution.reverse(-1);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0007 solution = new LeetCode0007();
    int result = solution.reverse(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase7() {
    LeetCode0007 solution = new LeetCode0007();
    int result = solution.reverse(1000);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode0007 solution = new LeetCode0007();
    int result = solution.reverse(1020);
    Assert.assertEquals(201, result);
  }

  @Test
  public void testProblemCase9() {
    LeetCode0007 solution = new LeetCode0007();
    int result = solution.reverse(2147483647);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase10() {
    LeetCode0007 solution = new LeetCode0007();
    int result = solution.reverse(-2147483648);
    Assert.assertEquals(0, result);
  }
}
