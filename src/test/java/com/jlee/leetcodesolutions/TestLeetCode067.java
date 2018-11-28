package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode067;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode067 {
  @Test
  public void testProblemCase1() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("0", "0");
    Assert.assertEquals("0", result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("0", "1");
    Assert.assertEquals("1", result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("1", "0");
    Assert.assertEquals("1", result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("1", "1");
    Assert.assertEquals("10", result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("11", "1");
    Assert.assertEquals("100", result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("1", "11");
    Assert.assertEquals("100", result);
  }

  @Test
  public void testProblemCase7() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("000", "001");
    Assert.assertEquals("001", result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("000", "0001");
    Assert.assertEquals("0001", result);
  }

  @Test
  public void testProblemCase9() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("1111", "1111");
    Assert.assertEquals("11110", result);
  }

  @Test
  public void testProblemCase10() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("", "11");
    Assert.assertEquals("11", result);
  }

  @Test
  public void testProblemCase11() {
    LeetCode067 solution = new LeetCode067();
    String result = solution.addBinary("11", "");
    Assert.assertEquals("11", result);
  }
}
