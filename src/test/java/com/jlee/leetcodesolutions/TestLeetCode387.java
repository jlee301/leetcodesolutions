package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode387;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode387 {
  @Test
  public void testProblemCase1() {
    String s = "leetcode";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(0, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "loveleetcode";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(2, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "lllllz";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(5, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "llllzl";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(4, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "lllzll";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(3, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "llzlll";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(2, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase7() {
    String s = "lzllll";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(1, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "zlllll";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(0, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase9() {
    String s = "abcdef";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(0, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase10() {
    String s = "acbacb";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(-1, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase11() {
    String s = "aaaaaa";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(-1, solution.firstUniqChar(s));
  }

  @Test
  public void testProblemCase14() {
    String s = "";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(-1, solution.firstUniqChar(s));
  }
}
