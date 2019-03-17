package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0345;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0345 {
  @Test
  public void testProblemCase1() {
    String s = "HeLlO";
    LeetCode0345 solution = new LeetCode0345();
    Assert.assertEquals("HOLle", solution.reverseVowels(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "lloll";
    LeetCode0345 solution = new LeetCode0345();
    Assert.assertEquals("lloll", solution.reverseVowels(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "AaEeIiOoUu";
    LeetCode0345 solution = new LeetCode0345();
    Assert.assertEquals("uUoOiIeEaA", solution.reverseVowels(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "BbCcDdFfGgHh";
    LeetCode0345 solution = new LeetCode0345();
    Assert.assertEquals("BbCcDdFfGgHh", solution.reverseVowels(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "  ";
    LeetCode0345 solution = new LeetCode0345();
    Assert.assertEquals("  ", solution.reverseVowels(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "";
    LeetCode0345 solution = new LeetCode0345();
    Assert.assertEquals("", solution.reverseVowels(s));
  }
}
