package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode028;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode028 {
  @Test
  public void theProblemCase1() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "hello";
    String needle = "ll";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(2, result);
  }

  @Test
  public void theProblemCase2() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "aaaaa";
    String needle = "bba";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void theProblemCase3() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "aaaaa";
    String needle = "a";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(0, result);
  }

  @Test
  public void theProblemCase4() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "bbbba";
    String needle = "a";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(4, result);
  }

  @Test
  public void theProblemCase5() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "bbbba";
    String needle = "ab";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void theProblemCase6() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "baabababba";
    String needle = "ab";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(2, result);
  }

  @Test
  public void theProblemCase7() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "a";
    String needle = "a";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(0, result);
  }

  @Test
  public void theProblemCase8() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "a";
    String needle = "b";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void theProblemCase9() {
    LeetCode028 solution = new LeetCode028();
    String haystack = "a";
    String needle = "";
    int result = solution.strStr(haystack, needle);
    Assert.assertEquals(0, result);
  }
}
