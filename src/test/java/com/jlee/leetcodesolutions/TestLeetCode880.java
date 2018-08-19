package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode880;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode880 {
  @Test
  public void testProblemCase1() {
    String S = "leet2code3";
    int K = 10;
    LeetCode880 solution = new LeetCode880();
    Assert.assertEquals("o", solution.decodeAtIndex(S, K));
  }

  @Test
  public void testProblemCase2() {
    String S = "ha22";
    int K = 5;
    LeetCode880 solution = new LeetCode880();
    Assert.assertEquals("h", solution.decodeAtIndex(S, K));
  }

  @Test
  public void testProblemCase3() {
    String S = "a2345678999999999999999";
    int K = 1;
    LeetCode880 solution = new LeetCode880();
    Assert.assertEquals("a", solution.decodeAtIndex(S, K));
  }

  @Test
  public void testProblemCase5() {
    String S = "a2b3c4d5e6f7g8h9";
    int K = 10;
    LeetCode880 solution = new LeetCode880();
    Assert.assertEquals("c", solution.decodeAtIndex(S, K));
  }

  @Test
  public void testProblemCase6() {
    String S = "y959q969u3hb22odq595";
    int K = 222280369;
    LeetCode880 solution = new LeetCode880();
    Assert.assertEquals("y", solution.decodeAtIndex(S, K));
  }

  @Test
  public void testProblemCase7() {
    String S = "a23";
    int K = 6;
    LeetCode880 solution = new LeetCode880();
    Assert.assertEquals("a", solution.decodeAtIndex(S, K));
  }
}
