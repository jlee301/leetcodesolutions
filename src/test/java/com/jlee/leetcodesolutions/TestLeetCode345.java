package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode345;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode345 {
  @Test
  public void testHello() {
    String s = "HeLlO";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("HOLle", solution.reverseVowels(s));
  }

  @Test
  public void testMiddleVowel() {
    String s = "lloll";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("lloll", solution.reverseVowels(s));
  }

  @Test
  public void testAllVowel() {
    String s = "AaEeIiOoUu";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("uUoOiIeEaA", solution.reverseVowels(s));
  }

  @Test
  public void testNoVowels() {
    String s = "BbCcDdFfGgHh";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("BbCcDdFfGgHh", solution.reverseVowels(s));
  }

  @Test
  public void testSpaces() {
    String s = "  ";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("  ", solution.reverseVowels(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("", solution.reverseVowels(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode345 solution = new LeetCode345();
    Assert.assertNull(solution.reverseVowels(s));
  }
}
