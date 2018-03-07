package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode274;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode274 {
  @Test
  public void testProblemCase() {
    int[] citations = {3,0,6,1,5};
    LeetCode274 solution = new LeetCode274();
    Assert.assertEquals(3, solution.hIndex(citations));
  }

  @Test
  public void testAllSame() {
    int[] citations = {8,8,8,8,8};
    LeetCode274 solution = new LeetCode274();
    Assert.assertEquals(5, solution.hIndex(citations));
  }

  @Test
  public void testWrongAns() {
    int[] citations = {4,4,0,0};
    LeetCode274 solution = new LeetCode274();
    Assert.assertEquals(2, solution.hIndex(citations));
  }

  @Test
  public void testEmpty() {
    int[] citations = {};
    LeetCode274 solution = new LeetCode274();
    Assert.assertEquals(0, solution.hIndex(citations));
  }

  @Test
  public void testNull() {
    int[] citations = null;
    LeetCode274 solution = new LeetCode274();
    Assert.assertEquals(0, solution.hIndex(citations));
  }
}
