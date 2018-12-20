package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode657;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode657 {
  @Test
  public void testProblemCase1() {
    String moves = "UDLR";
    LeetCode657 solution = new LeetCode657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase2() {
    String moves = "UUDDLLRR";
    LeetCode657 solution = new LeetCode657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase3() {
    String moves = "UDLRRU";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase4() {
    String moves = "UUUU";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase5() {
    String moves = "DDDD";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase6() {
    String moves = "LLLL";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase7() {
    String moves = "RRRR";
    LeetCode657 solution = new LeetCode657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }
  
  @Test
  public void testProblemCase8() {
    String moves = "";
    LeetCode657 solution = new LeetCode657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }
}
