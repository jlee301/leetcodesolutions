package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0420;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0420 {
  @Test
  public void testProblemCase1() {
    String s = "aaa";
    LeetCode0420 solution = new LeetCode0420();
    Assert.assertEquals(3, solution.strongPasswordChecker(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "aaaaaaaaaaaaaaaaaaaa";
    LeetCode0420 solution = new LeetCode0420();
    Assert.assertEquals(6, solution.strongPasswordChecker(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "aA1";
    LeetCode0420 solution = new LeetCode0420();
    Assert.assertEquals(3, solution.strongPasswordChecker(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "aA1aaa";
    LeetCode0420 solution = new LeetCode0420();
    Assert.assertEquals(1, solution.strongPasswordChecker(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "aA1a.b";
    LeetCode0420 solution = new LeetCode0420();
    Assert.assertEquals(0, solution.strongPasswordChecker(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "123456789012345678aAc";
    LeetCode0420 solution = new LeetCode0420();
    Assert.assertEquals(1, solution.strongPasswordChecker(s));
  }

  @Test
  public void testProblemCase7() {
    String s = "12345678901234567Aaaa";
    LeetCode0420 solution = new LeetCode0420();
    Assert.assertEquals(1, solution.strongPasswordChecker(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "1234567890123456Aaaaa";
    LeetCode0420 solution = new LeetCode0420();
    Assert.assertEquals(2, solution.strongPasswordChecker(s));
  }
}
