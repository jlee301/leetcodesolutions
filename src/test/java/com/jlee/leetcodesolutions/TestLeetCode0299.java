package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0299;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0299 {
  @Test
  public void testProblemCase1() {
    String secret = "1807";
    String guess = "7810";
    LeetCode0299 solution = new LeetCode0299();
    Assert.assertEquals("1A3B", solution.getHint(secret, guess));
  }

  @Test
  public void testProblemCase2() {
    String secret = "1123";
    String guess = "0111";
    LeetCode0299 solution = new LeetCode0299();
    Assert.assertEquals("1A1B", solution.getHint(secret, guess));
  }

  @Test
  public void testEmptySecret() {
    String secret = "";
    String guess = "0111";
    LeetCode0299 solution = new LeetCode0299();
    Assert.assertEquals("0A0B", solution.getHint(secret, guess));
  }

  @Test
  public void testEmptyGuess() {
    String secret = "1123";
    String guess = "";
    LeetCode0299 solution = new LeetCode0299();
    Assert.assertEquals("0A0B", solution.getHint(secret, guess));
  }

  @Test
  public void testNullSecret() {
    String secret = null;
    String guess = "0111";
    LeetCode0299 solution = new LeetCode0299();
    Assert.assertEquals("0A0B", solution.getHint(secret, guess));
  }

  @Test
  public void testNullGuess() {
    String secret = "1123";
    String guess = null;
    LeetCode0299 solution = new LeetCode0299();
    Assert.assertEquals("0A0B", solution.getHint(secret, guess));
  }
}
