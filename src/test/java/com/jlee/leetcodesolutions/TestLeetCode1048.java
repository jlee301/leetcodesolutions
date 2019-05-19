package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1048;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1048 {
  @Test
  public void testProblemCase1() {
    String[] words = {"a","b","ba","bca","bda","bdca"};
    LeetCode1048 solution = new LeetCode1048();
    Assert.assertEquals(4, solution.longestStrChain(words));
  }
}
