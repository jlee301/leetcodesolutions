package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode115;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode115 {
  @Test
  public void testProblemCase1() {
    String s = "rabbbit", t = "rabbit";
    LeetCode115 solution = new LeetCode115();
    Assert.assertEquals(3, solution.numDistinct(s, t));
  }

  @Test
  public void testProblemCase2() {
    String s = "babgbag", t = "bag";
    LeetCode115 solution = new LeetCode115();
    Assert.assertEquals(5, solution.numDistinct(s, t));
  }
}
