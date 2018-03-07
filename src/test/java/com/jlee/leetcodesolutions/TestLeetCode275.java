package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode275;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode275 {
  @Test
  public void testProblemCase() {
    int[] citations = {0,1,3,5,6};
    LeetCode275 solution = new LeetCode275();
    Assert.assertEquals(3, solution.hIndex(citations));
  }

  @Test
  public void testAllSame() {
    int[] citations = {8,8,8,8,8};
    LeetCode275 solution = new LeetCode275();
    Assert.assertEquals(5, solution.hIndex(citations));
  }

  @Test
  public void testWrongAns() {
    int[] citations = {0,0,4,4};
    LeetCode275 solution = new LeetCode275();
    Assert.assertEquals(2, solution.hIndex(citations));
  }

  @Test
  public void testWrongAns2() {
    int[] citations = {0};
    LeetCode274 solution = new LeetCode274();
    Assert.assertEquals(0, solution.hIndex(citations));
  }
  
  @Test
  public void testEmpty() {
    int[] citations = {};
    LeetCode275 solution = new LeetCode275();
    Assert.assertEquals(0, solution.hIndex(citations));
  }

  @Test
  public void testNull() {
    int[] citations = null;
    LeetCode275 solution = new LeetCode275();
    Assert.assertEquals(0, solution.hIndex(citations));
  }
}
