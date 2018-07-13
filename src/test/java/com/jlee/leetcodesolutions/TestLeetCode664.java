package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode664;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode664 {
  @Test
  public void testProblemCase1() {
    // Input: "aaabbb"
    // Output: 2
    String s = "aaabbb";
    LeetCode664 solution = new LeetCode664();
    Assert.assertEquals(2, solution.strangePrinter(s));
  }

  @Test
  public void testProblemCase2() {
    // Input: "aba"
    // Output: 2
    String s = "aba";
    LeetCode664 solution = new LeetCode664();
    Assert.assertEquals(2, solution.strangePrinter(s));
  }

  @Test
  public void testProblemCase3() {
    // Input: "tbgtgb"
    // Output: 4
    String s = "tbgtgb";
    // 1. "tttttt"   1. "tttttt"
    // 2. "tbbbbb"   2. "tbtttt"
    // 3. "tbgggb"   3. "tbgttt"
    // 4. "tbgtgb"   4. "tbgtgt"
    //               5. "tbgtgb"
    LeetCode664 solution = new LeetCode664();
    Assert.assertEquals(4, solution.strangePrinter(s));
  }

  @Test
  public void testProblemCase4() {
    // Input: "aaa"
    // Output: 1
    String s = "aaa";
    LeetCode664 solution = new LeetCode664();
    Assert.assertEquals(1, solution.strangePrinter(s));
  }

  @Test
  public void testProblemCase5() {
    // Input: ""
    // Output: 0
    String s = "";
    LeetCode664 solution = new LeetCode664();
    Assert.assertEquals(0, solution.strangePrinter(s));
  }
}
