package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode010;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode010 {
  @Test
  public void testProblemCase1() {
    String s = "aa", p = "a";
    LeetCode010 solution = new LeetCode010();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase2() {
    String s = "aa", p = "a*";
    LeetCode010 solution = new LeetCode010();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase3() {
    String s = "ab", p = ".*";
    LeetCode010 solution = new LeetCode010();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase4() {
    String s = "aab", p = "c*a*b";
    LeetCode010 solution = new LeetCode010();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase5() {
    String s = "mississippi", p = "mis*is*p*.";
    LeetCode010 solution = new LeetCode010();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase6() {
    String s = "ssippi", p = "s*ip*.";
    LeetCode010 solution = new LeetCode010();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase7() {
    String s = "a", p = "ab*";
    LeetCode010 solution = new LeetCode010();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase8() {
    String s = "aaaa", p = ".*b";
    LeetCode010 solution = new LeetCode010();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase9() {
    String s = "aaaa", p = "a*b";
    LeetCode010 solution = new LeetCode010();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase10() {
    String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadefg", p = "a*aa*aaas*t*.*k";
    LeetCode010 solution = new LeetCode010();
    Assert.assertFalse(solution.isMatch(s, p));
  }
}
