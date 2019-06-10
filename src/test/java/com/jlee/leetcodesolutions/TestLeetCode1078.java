package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1078;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1078 {
  @Test
  public void testProblemCase1() {
    String text = "alice is a good girl she is a good student", first = "a", second = "good";
    LeetCode1078 solution = new LeetCode1078();
    Assert.assertArrayEquals(new String[] {"girl","student"}, solution.findOcurrences(text, first, second));
  }

  @Test
  public void testProblemCase2() {
    String text = "we will we will rock you", first = "we", second = "will";
    LeetCode1078 solution = new LeetCode1078();
    Assert.assertArrayEquals(new String[] {"we","rock"}, solution.findOcurrences(text, first, second));
  }

  @Test
  public void testProblemCase3() {
    String text = "we will we will    ", first = "we", second = "will";
    LeetCode1078 solution = new LeetCode1078();
    Assert.assertArrayEquals(new String[] {"we"}, solution.findOcurrences(text, first, second));
  }
}
