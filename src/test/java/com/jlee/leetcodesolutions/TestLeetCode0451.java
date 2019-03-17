package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0451;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0451 {
  @Test
  public void testProblemCase1() {
    String s = "tree";
    LeetCode0451 solution = new LeetCode0451();
    Assert.assertEquals("eert", solution.frequencySort(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "cccaaa";
    LeetCode0451 solution = new LeetCode0451();
    Assert.assertEquals("aaaccc", solution.frequencySort(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "Aabb";
    LeetCode0451 solution = new LeetCode0451();
    Assert.assertEquals("bbAa", solution.frequencySort(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode0451 solution = new LeetCode0451();
    Assert.assertEquals("", solution.frequencySort(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode0451 solution = new LeetCode0451();
    Assert.assertEquals("", solution.frequencySort(s));
  }
}
