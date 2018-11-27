package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode038;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode038 {
  @Test
  public void testProblemCase1() {
    LeetCode038 solution = new LeetCode038();
    String result = solution.countAndSay(1);
    Assert.assertEquals("1", result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode038 solution = new LeetCode038();
    String result = solution.countAndSay(2);
    Assert.assertEquals("11", result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode038 solution = new LeetCode038();
    String result = solution.countAndSay(3);
    Assert.assertEquals("21", result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode038 solution = new LeetCode038();
    String result = solution.countAndSay(4);
    Assert.assertEquals("1211", result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode038 solution = new LeetCode038();
    String result = solution.countAndSay(5);
    Assert.assertEquals("111221", result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode038 solution = new LeetCode038();
    String result = solution.countAndSay(6);
    Assert.assertEquals("312211", result);
  }

  @Test
  public void testProblemCase7() {
    LeetCode038 solution = new LeetCode038();
    String result = solution.countAndSay(7);
    Assert.assertEquals("13112221", result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode038 solution = new LeetCode038();
    String result = solution.countAndSay(8);
    Assert.assertEquals("1113213211", result);
  }

  @Test
  public void testProblemCase9() {
    LeetCode038 solution = new LeetCode038();
    String result = solution.countAndSay(9);
    Assert.assertEquals("31131211131221", result);
  }

  @Test
  public void testProblemCase10() {
    LeetCode038 solution = new LeetCode038();
    String result = solution.countAndSay(10);
    Assert.assertEquals("13211311123113112211", result);
  }
}
