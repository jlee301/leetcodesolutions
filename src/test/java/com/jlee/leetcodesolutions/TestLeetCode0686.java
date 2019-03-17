package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0686;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0686 {
  @Test
  public void testProblemCase1() {
    String A = "a";
    String B = "a";
    LeetCode0686 solution = new LeetCode0686();
    Assert.assertEquals(1, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testProblemCase2() {
    String A = "ab";
    String B = "abab";
    LeetCode0686 solution = new LeetCode0686();
    Assert.assertEquals(2, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testProblemCase3() {
    String A = "ab";
    String B = "baba";
    LeetCode0686 solution = new LeetCode0686();
    Assert.assertEquals(3, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testProblemCase4() {
    String A = "ab";
    String B = "cdef";
    LeetCode0686 solution = new LeetCode0686();
    Assert.assertEquals(-1, solution.repeatedStringMatch(A, B));
  }

  @Test
  public void testProblemCase5() {
    String A = "ab";
    String B = "";
    LeetCode0686 solution = new LeetCode0686();
    Assert.assertEquals(0, solution.repeatedStringMatch(A, B));
  }
  
  @Test
  public void testProblemCase6() {
    String A = "";
    String B = "";
    LeetCode0686 solution = new LeetCode0686();
    Assert.assertEquals(0, solution.repeatedStringMatch(A, B));
  }
}
