package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode820;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode820 {
  @Test
  public void testProblemCase() {
    String[] words = {"time", "me", "bell"};
    LeetCode820 solution = new LeetCode820();
    Assert.assertEquals(10, solution.minimumLengthEncoding(words));
  }
}
