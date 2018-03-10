package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode306;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode306 {
  @Test
  public void testProblemCase1() {
    String num = "112358";
    LeetCode306 solution = new LeetCode306();
    Assert.assertTrue(solution.isAdditiveNumber(num));
  }

  @Test
  public void testProblemCase2() {
    String num = "199100199";
    LeetCode306 solution = new LeetCode306();
    Assert.assertTrue(solution.isAdditiveNumber(num));
  }

  @Test
  public void testNotAdditive() {
    String num = "1111";
    LeetCode306 solution = new LeetCode306();
    Assert.assertFalse(solution.isAdditiveNumber(num));
  }

  @Test
  public void testNum1CannotHaveLeadingZero() {
    String num = "0111";
    LeetCode306 solution = new LeetCode306();
    Assert.assertFalse(solution.isAdditiveNumber(num));
  }

  @Test
  public void testNum2CannotBeginWithLeadingZero() {
    String num = "10011";
    LeetCode306 solution = new LeetCode306();
    Assert.assertFalse(solution.isAdditiveNumber(num));
  }

  @Test
  public void testEmpty() {
    String num = "";
    LeetCode306 solution = new LeetCode306();
    Assert.assertFalse(solution.isAdditiveNumber(num));
  }

  @Test
  public void testNull() {
    String num = null;
    LeetCode306 solution = new LeetCode306();
    Assert.assertFalse(solution.isAdditiveNumber(num));
  }
}
