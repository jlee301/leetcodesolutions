package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode028;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode028 {
  @Test
  public void testNeedleDetect() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "hello";
    String needle = "ll";
    int result = solution.strStrNotUsingIndexOf(haystack, needle);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testNeedleNoDetect() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "aaaaa";
    String needle = "bba";
    int result = solution.strStrNotUsingIndexOf(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNeedleDetectFirstChar() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "aaaaa";
    String needle = "a";
    int result = solution.strStrNotUsingIndexOf(haystack, needle);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNeedleDetectLastChar() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "bbbba";
    String needle = "a";
    int result = solution.strStrNotUsingIndexOf(haystack, needle);
    Assert.assertEquals(4, result);
  }

  @Test
  public void testNeedleNoDetectLastChar() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "bbbba";
    String needle = "ab";
    int result = solution.strStrNotUsingIndexOf(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNeedleMultipleDetects() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "baabababba";
    String needle = "ab";
    int result = solution.strStrNotUsingIndexOf(haystack, needle);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testNeedleSingleHaystack() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "a";
    String needle = "a";
    int result = solution.strStrNotUsingIndexOf(haystack, needle);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNeedleSingleInvalidHaystack() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "a";
    String needle = "b";
    int result = solution.strStrNotUsingIndexOf(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNullHaystack() {
    LeetCode028 solution = new LeetCode028();
    String haystack = null;
    String needle = "a";
    int result = solution.strStrNotUsingIndexOf(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNullNeedle() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "hello";
    String needle = null;
    int result = solution.strStrNotUsingIndexOf(haystack, needle);
    Assert.assertEquals(-1, result);
  }
}