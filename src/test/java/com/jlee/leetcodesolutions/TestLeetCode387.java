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
  public void testLastChar() {
    String s = "lllllz";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(5, solution.firstUniqChar(s));
  }

  @Test
  public void test2ndLastChar() {
    String s = "llllzl";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(4, solution.firstUniqChar(s));
  }

  @Test
  public void test3rdLastChar() {
    String s = "lllzll";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(3, solution.firstUniqChar(s));
  }

  @Test
  public void testMidChar() {
    String s = "llzlll";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(2, solution.firstUniqChar(s));
  }

  @Test
  public void test2ndChar() {
    String s = "lzllll";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(1, solution.firstUniqChar(s));
  }

  @Test
  public void test1stChar() {
    String s = "zlllll";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(0, solution.firstUniqChar(s));
  }

  @Test
  public void testAllUnique() {
    String s = "abcdef";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(0, solution.firstUniqChar(s));
  }

  @Test
  public void testAllDupes() {
    String s = "acbacb";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(-1, solution.firstUniqChar(s));
  }

  @Test
  public void testAllSame() {
    String s = "aaaaaa";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(-1, solution.firstUniqChar(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(-1, solution.firstUniqChar(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode387 solution = new LeetCode387();
    Assert.assertEquals(-1, solution.firstUniqChar(s));
  }
}
