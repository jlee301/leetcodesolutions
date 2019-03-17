package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0318;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0318 {
  @Test
  public void testProblemCase1() {
    String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
    LeetCode0318 solution = new LeetCode0318();
    Assert.assertEquals(16, solution.maxProduct(words));
  }

  @Test
  public void testProblemCase2() {
    String[] words = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
    LeetCode0318 solution = new LeetCode0318();
    Assert.assertEquals(4, solution.maxProduct(words));
  }

  @Test
  public void testProblemCase3() {
    String[] words = {"a", "aa", "aaa", "aaaa"};
    LeetCode0318 solution = new LeetCode0318();
    Assert.assertEquals(0, solution.maxProduct(words));
  }

  @Test
  public void testEmpty() {
    String[] words = {};
    LeetCode0318 solution = new LeetCode0318();
    Assert.assertEquals(0, solution.maxProduct(words));
  }

  @Test
  public void testNull() {
    String[] words = null;
    LeetCode0318 solution = new LeetCode0318();
    Assert.assertEquals(0, solution.maxProduct(words));
  }
}
