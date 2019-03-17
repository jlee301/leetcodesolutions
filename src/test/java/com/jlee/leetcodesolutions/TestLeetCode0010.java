package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0010;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0010 {
  @Test
  public void testProblemCase1() {
    String s = "aa", p = "a";
    LeetCode0010 solution = new LeetCode0010();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase2() {
    String s = "aa", p = "a*";
    LeetCode0010 solution = new LeetCode0010();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase3() {
    String s = "ab", p = ".*";
    LeetCode0010 solution = new LeetCode0010();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase4() {
    String s = "aab", p = "c*a*b";
    LeetCode0010 solution = new LeetCode0010();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase5() {
    String s = "mississippi", p = "mis*is*p*.";
    LeetCode0010 solution = new LeetCode0010();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase6() {
    String s = "ssippi", p = "s*ip*.";
    LeetCode0010 solution = new LeetCode0010();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase7() {
    String s = "a", p = "ab*";
    LeetCode0010 solution = new LeetCode0010();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase8() {
    String s = "aaaa", p = ".*b";
    LeetCode0010 solution = new LeetCode0010();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase9() {
    String s = "aaaa", p = "a*b";
    LeetCode0010 solution = new LeetCode0010();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase10() {
    String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadefg", p = "a*aa*aaas*t*.*k";
    LeetCode0010 solution = new LeetCode0010();
    Assert.assertFalse(solution.isMatch(s, p));
  }
}
