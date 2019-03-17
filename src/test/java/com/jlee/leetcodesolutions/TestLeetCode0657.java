package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0657;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0657 {
  @Test
  public void testProblemCase1() {
    String moves = "UDLR";
    LeetCode0657 solution = new LeetCode0657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase2() {
    String moves = "UUDDLLRR";
    LeetCode0657 solution = new LeetCode0657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase3() {
    String moves = "UDLRRU";
    LeetCode0657 solution = new LeetCode0657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase4() {
    String moves = "UUUU";
    LeetCode0657 solution = new LeetCode0657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase5() {
    String moves = "DDDD";
    LeetCode0657 solution = new LeetCode0657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase6() {
    String moves = "LLLL";
    LeetCode0657 solution = new LeetCode0657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }

  @Test
  public void testProblemCase7() {
    String moves = "RRRR";
    LeetCode0657 solution = new LeetCode0657();
    Assert.assertFalse(solution.judgeCircle(moves));
  }
  
  @Test
  public void testProblemCase8() {
    String moves = "";
    LeetCode0657 solution = new LeetCode0657();
    Assert.assertTrue(solution.judgeCircle(moves));
  }
}
