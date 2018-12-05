package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode345;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode345 {
  @Test
  public void testProblemCase1() {
    String s = "HeLlO";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("HOLle", solution.reverseVowels(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "lloll";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("lloll", solution.reverseVowels(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "AaEeIiOoUu";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("uUoOiIeEaA", solution.reverseVowels(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "BbCcDdFfGgHh";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("BbCcDdFfGgHh", solution.reverseVowels(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "  ";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("  ", solution.reverseVowels(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "";
    LeetCode345 solution = new LeetCode345();
    Assert.assertEquals("", solution.reverseVowels(s));
  }
}
