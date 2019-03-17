package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0833;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0833 {
  @Test
  public void testProblemCase1() {
    String S = "abcd";
    int[] indexes = {0,2};
    String[] sources = {"a","cd"};
    String[] targets = {"eee","ffff"};
    LeetCode0833 solution = new LeetCode0833();
    Assert.assertEquals("eeebffff", solution.findReplaceString(S, indexes, sources, targets));
  }

  @Test
  public void testProblemCase2() {
    String S = "abcd";
    int[] indexes = {0,2};
    String[] sources = {"ab","ec"};
    String[] targets = {"eee","ffff"};
    LeetCode0833 solution = new LeetCode0833();
    Assert.assertEquals("eeecd", solution.findReplaceString(S, indexes, sources, targets));
  }
}
