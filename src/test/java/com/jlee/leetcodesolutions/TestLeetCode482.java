package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode482;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode482 {
  @Test
  public void testProblemCase1() {
    String S = "5F3Z-2e-9-w";
    int K = 4;
    LeetCode482 solution = new LeetCode482();
    Assert.assertEquals("5F3Z-2E9W", solution.licenseKeyFormatting(S, K));
  }

  @Test
  public void testProblemCase2() {
    String S = "2-5g-3-J";
    int K = 2;
    LeetCode482 solution = new LeetCode482();
    Assert.assertEquals("2-5G-3J", solution.licenseKeyFormatting(S, K));
  }

  @Test
  public void testK1() {
    String S = "2-5g-3-J";
    int K = 1;
    LeetCode482 solution = new LeetCode482();
    Assert.assertEquals("2-5-G-3-J", solution.licenseKeyFormatting(S, K));
  }

  @Test
  public void testK0() {
    String S = "2-5g-3-J";
    int K = 0;
    LeetCode482 solution = new LeetCode482();
    Assert.assertEquals("25G3J", solution.licenseKeyFormatting(S, K));
  }

  @Test
  public void testKNeg() {
    String S = "2-5g-3-J";
    int K = -1;
    LeetCode482 solution = new LeetCode482();
    Assert.assertEquals("25G3J", solution.licenseKeyFormatting(S, K));
  }
  
  @Test
  public void testEmpty() {
    String S = "";
    int K = 4;
    LeetCode482 solution = new LeetCode482();
    Assert.assertEquals("", solution.licenseKeyFormatting(S, K));
  }

  @Test
  public void testNull() {
    String S = null;
    int K = 4;
    LeetCode482 solution = new LeetCode482();
    Assert.assertEquals("", solution.licenseKeyFormatting(S, K));
  }
}
