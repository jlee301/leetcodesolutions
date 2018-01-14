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

  @Test
  public void testNeedleDetectStrStr() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "hello";
    String needle = "ll";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testNeedleNoDetectStrStr() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "aaaaa";
    String needle = "bba";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNeedleDetectFirstCharStrStr() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "aaaaa";
    String needle = "a";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNeedleDetectLastCharStrStr() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "bbbba";
    String needle = "a";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(4, result);
  }

  @Test
  public void testNeedleNoDetectLastCharStrStr() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "bbbba";
    String needle = "ab";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNeedleMultipleDetectsStrStr() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "baabababba";
    String needle = "ab";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testNeedleSingleHaystackStrStr() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "a";
    String needle = "a";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNeedleSingleInvalidHaystackStrStr() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "a";
    String needle = "b";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNullHaystackStrStr() {
    LeetCode028 solution = new LeetCode028();
    String haystack = null;
    String needle = "a";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNullNeedleStrStr() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "hello";
    String needle = null;
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(-1, result);
  }
  
  @Test
  public void testNeedleDetectStrStrThree() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "hello";
    String needle = "ll";
    int result = solution.strStrThree(haystack, needle);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testNeedleNoDetectStrStrThree() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "aaaaa";
    String needle = "bba";
    int result = solution.strStrThree(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNeedleDetectFirstCharStrStrThree() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "aaaaa";
    String needle = "a";
    int result = solution.strStrThree(haystack, needle);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNeedleDetectLastCharStrStrThree() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "bbbba";
    String needle = "a";
    int result = solution.strStrThree(haystack, needle);
    Assert.assertEquals(4, result);
  }

  @Test
  public void testNeedleNoDetectLastCharStrStrThree() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "bbbba";
    String needle = "ab";
    int result = solution.strStrThree(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNeedleMultipleDetectsStrStrThree() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "baabababba";
    String needle = "ab";
    int result = solution.strStrThree(haystack, needle);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testNeedleSingleHaystackStrStrThree() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "a";
    String needle = "a";
    int result = solution.strStrThree(haystack, needle);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNeedleSingleInvalidHaystackStrStrThree() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "a";
    String needle = "b";
    int result = solution.strStrThree(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNullHaystackStrStrThree() {
    LeetCode028 solution = new LeetCode028();
    String haystack = null;
    String needle = "a";
    int result = solution.strStrThree(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testNullNeedleStrStrThree() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "hello";
    String needle = null;
    int result = solution.strStrThree(haystack, needle);
    Assert.assertEquals(-1, result);
  }
}
