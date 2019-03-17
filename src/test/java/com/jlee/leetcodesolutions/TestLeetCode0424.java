package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0424;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0424 {
  @Test
  public void testProblemCase1() {
    String s = "ABAB";
    int k = 2;
    LeetCode0424 solution = new LeetCode0424();
    Assert.assertEquals(4, solution.characterReplacement(s, k));
  }

  @Test
  public void testProblemCase2() {
    String s = "AABABBA";
    int k = 1;
    LeetCode0424 solution = new LeetCode0424();
    Assert.assertEquals(4, solution.characterReplacement(s, k));
  }

  @Test
  public void testEmpty() {
    String s = "";
    int k = 1;
    LeetCode0424 solution = new LeetCode0424();
    Assert.assertEquals(0, solution.characterReplacement(s, k));
  }

  @Test
  public void testNull() {
    String s = null;
    int k = 1;
    LeetCode0424 solution = new LeetCode0424();
    Assert.assertEquals(0, solution.characterReplacement(s, k));
  }
}
