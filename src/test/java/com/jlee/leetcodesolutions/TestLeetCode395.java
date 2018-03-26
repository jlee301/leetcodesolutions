package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode395;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode395 {
  @Test
  public void testProblemCase1() {
    String s = "aaabb"; 
    int k = 3;
    LeetCode395 solution = new LeetCode395();
    Assert.assertEquals(3, solution.longestSubstring(s, k));
  }

  @Test
  public void testProblemCase2() {
    String s = "ababbc"; 
    int k = 2;
    LeetCode395 solution = new LeetCode395();
    Assert.assertEquals(5, solution.longestSubstring(s, k));
  }

  @Test
  public void testK1() {
    String s = "ababbc"; 
    int k = 1;
    LeetCode395 solution = new LeetCode395();
    Assert.assertEquals(6, solution.longestSubstring(s, k));
  }

  @Test
  public void testSizeLessThanK() {
    String s = "aba"; 
    int k = 4;
    LeetCode395 solution = new LeetCode395();
    Assert.assertEquals(0, solution.longestSubstring(s, k));
  }

  @Test
  public void testEmpty() {
    String s = ""; 
    int k = 4;
    LeetCode395 solution = new LeetCode395();
    Assert.assertEquals(0, solution.longestSubstring(s, k));
  }

  @Test
  public void testNull() {
    String s = null; 
    int k = 4;
    LeetCode395 solution = new LeetCode395();
    Assert.assertEquals(0, solution.longestSubstring(s, k));
  }
}
