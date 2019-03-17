package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0172;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0172 {
  @Test
  public void testProblemCase1() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(1);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(4);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(5);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(9);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(10);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(14);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase7() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(15);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(19);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase9() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(20);
    Assert.assertEquals(4, result);
  }

  @Test
  public void testProblemCase10() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(24);
    Assert.assertEquals(4, result);
  }

  @Test
  public void testProblemCase11() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(25);
    Assert.assertEquals(6, result);
  }

  @Test
  public void testProblemCase12() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(29);
    Assert.assertEquals(6, result);
  }

  @Test
  public void testProblemCase13() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(30);
    Assert.assertEquals(7, result);
  }

  @Test
  public void testProblemCase14() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase15() {
    LeetCode0172 solution = new LeetCode0172();
    int result = solution.trailingZeroes(-1);
    Assert.assertEquals(0, result);
  }
}
