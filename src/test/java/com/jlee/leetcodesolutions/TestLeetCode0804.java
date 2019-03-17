package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0804;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0804 {
  @Test
  public void testProblemCase() {
    String[] words = {"gin", "zen", "gig", "msg"};
    LeetCode0804 solution = new LeetCode0804();
    Assert.assertEquals(2, solution.uniqueMorseRepresentations(words));
  }

  @Test
  public void testCab() {
    String[] words = {"cab"};
    LeetCode0804 solution = new LeetCode0804();
    Assert.assertEquals(1, solution.uniqueMorseRepresentations(words));
  }

  @Test
  public void testEmpty() {
    String[] words = {};
    LeetCode0804 solution = new LeetCode0804();
    Assert.assertEquals(0, solution.uniqueMorseRepresentations(words));
  }

  @Test
  public void testNull() {
    String[] words = null;
    LeetCode0804 solution = new LeetCode0804();
    Assert.assertEquals(0, solution.uniqueMorseRepresentations(words));
  }
}
