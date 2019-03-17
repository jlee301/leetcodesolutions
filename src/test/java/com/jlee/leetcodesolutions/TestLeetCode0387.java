package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0387;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0387 {
  @Test
  public void testProblemCase1() {
    String s = "leetcode";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(0, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "loveleetcode";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(2, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "lllllz";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(5, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "llllzl";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(4, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "lllzll";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(3, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "llzlll";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(2, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase7() {
    String s = "lzllll";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(1, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "zlllll";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(0, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase9() {
    String s = "abcdef";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(0, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase10() {
    String s = "acbacb";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(-1, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase11() {
    String s = "aaaaaa";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(-1, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase14() {
    String s = "";
    LeetCode0387 solution = new LeetCode0387();
    Assert.assertEquals(-1, solution.firstUniqChar(s));
  }
}
