package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode011;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode011 {
  @Test
  public void testProblemCase() {
    int[] height = {1,8,6,2,5,4,8,3,7};
    LeetCode011 solution = new LeetCode011();
    Assert.assertEquals(49, solution.maxArea(height));
  }

  @Test
  public void testAscending() {
    int[] height = {1,2,3,4};
    LeetCode011 solution = new LeetCode011();
    Assert.assertEquals(4, solution.maxArea(height));
  }

  @Test
  public void testDescending() {
    int[] height = {4,3,2,1};
    LeetCode011 solution = new LeetCode011();
    Assert.assertEquals(4, solution.maxArea(height));
  }

  @Test
  public void testMaxOutside() {
    int[] height = {4,2,3,4};
    LeetCode011 solution = new LeetCode011();
    Assert.assertEquals(12, solution.maxArea(height));
  }

  @Test
  public void testAllSame() {
    int[] height = {1,1,1,1};
    LeetCode011 solution = new LeetCode011();
    Assert.assertEquals(3, solution.maxArea(height));
  }

  @Test
  public void testEmpty() {
    int[] height = {};
    LeetCode011 solution = new LeetCode011();
    Assert.assertEquals(0, solution.maxArea(height));
  }

  @Test
  public void testNull() {
    int[] height = null;
    LeetCode011 solution = new LeetCode011();
    Assert.assertEquals(0, solution.maxArea(height));
  }
}
