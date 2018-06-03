package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode844;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode844 {
  @Test
  public void testProblemCase1() {
    // Input: S = "ab#c", T = "ad#c"
    // Output: true
    String S = "ab#c", T = "ad#c";
    LeetCode844 solution = new LeetCode844();
    Assert.assertTrue(solution.backspaceCompare(S, T));
  }

  @Test
  public void testProblemCase2() {
    // Input: S = "ab##", T = "c#d#"
    // Output: true
    String S = "ab##", T = "c#d#";
    LeetCode844 solution = new LeetCode844();
    Assert.assertTrue(solution.backspaceCompare(S, T));
  }

  @Test
  public void testProblemCase3() {
    // Input: S = "a##c", T = "#a#c"
    // Output: true
    String S = "a##c", T = "#a#c";
    LeetCode844 solution = new LeetCode844();
    Assert.assertTrue(solution.backspaceCompare(S, T));
  }

  @Test
  public void testProblemCase4() {
    // Input: S = "a#c", T = "b"
    // Output: false
    String S = "a#c", T = "b";
    LeetCode844 solution = new LeetCode844();
    Assert.assertFalse(solution.backspaceCompare(S, T));
  }
}
