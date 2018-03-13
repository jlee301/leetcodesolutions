package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode318;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode318 {
  @Test
  public void testProblemCase1() {
    String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
    LeetCode318 solution = new LeetCode318();
    Assert.assertEquals(16, solution.maxProduct(words));
  }

  @Test
  public void testProblemCase2() {
    String[] words = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
    LeetCode318 solution = new LeetCode318();
    Assert.assertEquals(4, solution.maxProduct(words));
  }

  @Test
  public void testProblemCase3() {
    String[] words = {"a", "aa", "aaa", "aaaa"};
    LeetCode318 solution = new LeetCode318();
    Assert.assertEquals(0, solution.maxProduct(words));
  }

  @Test
  public void testEmpty() {
    String[] words = {};
    LeetCode318 solution = new LeetCode318();
    Assert.assertEquals(0, solution.maxProduct(words));
  }

  @Test
  public void testNull() {
    String[] words = null;
    LeetCode318 solution = new LeetCode318();
    Assert.assertEquals(0, solution.maxProduct(words));
  }
}
