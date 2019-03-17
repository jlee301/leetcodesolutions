package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0820;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0820 {
  @Test
  public void testProblemCase() {
    String[] words = {"time", "me", "bell"};
    LeetCode0820 solution = new LeetCode0820();
    Assert.assertEquals(10, solution.minimumLengthEncoding(words));
  }
}
