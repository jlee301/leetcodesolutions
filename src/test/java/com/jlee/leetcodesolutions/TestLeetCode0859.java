package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0859;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0859 {
  @Test
  public void testProblemCase1() {
    String A = "ab", B = "ba";
    LeetCode0859 solution = new LeetCode0859();
    Assert.assertTrue(solution.buddyStrings(A, B));
  }

  @Test
  public void testProblemCase2() {
    String A = "ab", B = "ab";
    LeetCode0859 solution = new LeetCode0859();
    Assert.assertFalse(solution.buddyStrings(A, B));
  }

  @Test
  public void testProblemCase3() {
    String A = "aa", B = "aa";
    LeetCode0859 solution = new LeetCode0859();
    Assert.assertTrue(solution.buddyStrings(A, B));
  }

  @Test
  public void testProblemCase4() {
    String A = "aaaaaaabc", B = "aaaaaaacb";
    LeetCode0859 solution = new LeetCode0859();
    Assert.assertTrue(solution.buddyStrings(A, B));
  }

  @Test
  public void testProblemCase5() {
    String A = "", B = "aa";
    LeetCode0859 solution = new LeetCode0859();
    Assert.assertFalse(solution.buddyStrings(A, B));
  }

  @Test
  public void testProblemCase6() {
    String A = "abc", B = "cab";
    LeetCode0859 solution = new LeetCode0859();
    Assert.assertFalse(solution.buddyStrings(A, B));
  }

  @Test
  public void testProblemCase7() {
    String A = "ab", B = "ca";
    LeetCode0859 solution = new LeetCode0859();
    Assert.assertFalse(solution.buddyStrings(A, B));
  }

  @Test
  public void testProblemCase8() {
    String A = "ab", B = "cd";
    LeetCode0859 solution = new LeetCode0859();
    Assert.assertFalse(solution.buddyStrings(A, B));
  }

  @Test
  public void testProblemCase9() {
    String A = "ab", B = "ac";
    LeetCode0859 solution = new LeetCode0859();
    Assert.assertFalse(solution.buddyStrings(A, B));
  }
}
