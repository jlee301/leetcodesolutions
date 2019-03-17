package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0567;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0567 {
  @Test
  public void testProblemCase1() {
    String s1 = "ab", s2 = "eidbaooo";
    LeetCode0567 solution = new LeetCode0567();
    Assert.assertTrue(solution.checkInclusion(s1, s2));
  }

  @Test
  public void testProblemCase2() {
    String s1 = "ab", s2 = "eidboaoo";
    LeetCode0567 solution = new LeetCode0567();
    Assert.assertFalse(solution.checkInclusion(s1, s2));
  }

  @Test
  public void testS1GreaterThanS2() {
    String s1 = "ababababab", s2 = "eidboaoo";
    LeetCode0567 solution = new LeetCode0567();
    Assert.assertFalse(solution.checkInclusion(s1, s2));
  }
  
  @Test
  public void testWrongAns() {
    String s1 = "adc", s2 = "dcda";
    LeetCode0567 solution = new LeetCode0567();
    Assert.assertTrue(solution.checkInclusion(s1, s2));
  }

  @Test
  public void testS1Empty() {
    String s1 = "", s2 = "eidboaoo";
    LeetCode0567 solution = new LeetCode0567();
    Assert.assertFalse(solution.checkInclusion(s1, s2));
  }

  @Test
  public void testS2Empty() {
    String s1 = "ab", s2 = "";
    LeetCode0567 solution = new LeetCode0567();
    Assert.assertFalse(solution.checkInclusion(s1, s2));
  }

  @Test
  public void testS1Null() {
    String s1 = null, s2 = "eidboaoo";
    LeetCode0567 solution = new LeetCode0567();
    Assert.assertFalse(solution.checkInclusion(s1, s2));
  }

  @Test
  public void testS2Null() {
    String s1 = "ab", s2 = null;
    LeetCode0567 solution = new LeetCode0567();
    Assert.assertFalse(solution.checkInclusion(s1, s2));
  }
}
