package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0488;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0488 {
  @Test
  public void testProblemCase1() {
    // Input: "WRRBBW", "RB"
    // Output: -1
    String board = "WRRBBW", hand = "RB";
    LeetCode0488 solution = new LeetCode0488();
    Assert.assertEquals(-1, solution.findMinStep(board, hand));
  }

  @Test
  public void testProblemCase2() {
    // Input: "WWRRBBWW", "WRBRW"
    // Output: 2
    String board = "WWRRBBWW", hand = "WRBRW";
    LeetCode0488 solution = new LeetCode0488();
    Assert.assertEquals(2, solution.findMinStep(board, hand));
  }

  @Test
  public void testProblemCase3() {
    // Input:"G", "GGGGG"
    // Output: 2
    String board = "G", hand = "GGGGG";
    LeetCode0488 solution = new LeetCode0488();
    Assert.assertEquals(2, solution.findMinStep(board, hand));
  }

  @Test
  public void testProblemCase4() {
    // Input: "RBYYBBRRB", "YRBGB"
    // Output: 3
    String board = "RBYYBBRRB", hand = "YRBGB";
    LeetCode0488 solution = new LeetCode0488();
    Assert.assertEquals(3, solution.findMinStep(board, hand));
  }

  @Test
  public void testProblemCase5() {
    // Input: "RRWWRRBBRR", "WB"
    // Output: -1
    String board = "RRWWRRBBRR", hand = "WB";
    LeetCode0488 solution = new LeetCode0488();
    Assert.assertEquals(-1, solution.findMinStep(board, hand));
  }
}
