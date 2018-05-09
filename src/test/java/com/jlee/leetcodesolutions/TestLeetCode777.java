package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode777;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode777 {
  @Test
  public void testProblemCase() {
    String start = "RXXLRXRXL", end = "XRLXXRRLX";
    LeetCode777 solution = new LeetCode777();
    Assert.assertTrue(solution.canTransform(start, end));
  }

  @Test
  public void testNoMatch() {
    String start = "XL", end = "RX";
    LeetCode777 solution = new LeetCode777();
    Assert.assertFalse(solution.canTransform(start, end));
  }

  @Test
  public void testAllX() {
    String start = "XX", end = "XX";
    LeetCode777 solution = new LeetCode777();
    Assert.assertTrue(solution.canTransform(start, end));
  }

  @Test
  public void testLForward() {
    String start = "LX", end = "XL";
    LeetCode777 solution = new LeetCode777();
    Assert.assertFalse(solution.canTransform(start, end));
  }

  @Test
  public void testRBackwards() {
    String start = "XR", end = "RX";
    LeetCode777 solution = new LeetCode777();
    Assert.assertFalse(solution.canTransform(start, end));
  }
}
