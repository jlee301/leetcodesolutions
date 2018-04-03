package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode451;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode451 {
  @Test
  public void testProblemCase1() {
    String s = "tree";
    LeetCode451 solution = new LeetCode451();
    Assert.assertEquals("eert", solution.frequencySort(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "cccaaa";
    LeetCode451 solution = new LeetCode451();
    Assert.assertEquals("aaaccc", solution.frequencySort(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "Aabb";
    LeetCode451 solution = new LeetCode451();
    Assert.assertEquals("bbAa", solution.frequencySort(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode451 solution = new LeetCode451();
    Assert.assertEquals("", solution.frequencySort(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode451 solution = new LeetCode451();
    Assert.assertEquals("", solution.frequencySort(s));
  }
}
