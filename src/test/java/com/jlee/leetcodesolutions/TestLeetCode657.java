package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode657;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode657 {
  @Test
  public void testNormalCase() {
    String moves = "UDLR";
    LeetCode657 solution = new LeetCode657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }

  @Test
  public void testNormalCaseDouble() {
    String moves = "UUDDLLRR";
    LeetCode657 solution = new LeetCode657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }

  @Test
  public void testNotCircle() {
    String moves = "UDLRRU";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testAllUp() {
    String moves = "UUUU";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testAllDown() {
    String moves = "DDDD";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testAllLeft() {
    String moves = "LLLL";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testAllRight() {
    String moves = "RRRR";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testCircleWithInvalidChars() {
    String moves = " !@#UFDSLARMNB";
    LeetCode657 solution = new LeetCode657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }

  @Test
  public void testNonCircleWithInvalidChars() {
    String moves = " !@#UFDSLAMNB";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testEmpty() {
    String moves = "";
    LeetCode657 solution = new LeetCode657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }

  @Test
  public void testNull() {
    String moves = null;
    LeetCode657 solution = new LeetCode657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }
}
