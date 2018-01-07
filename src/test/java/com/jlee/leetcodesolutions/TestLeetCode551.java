package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode551;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode551 {
  @Test
  public void testPerfectStudent() {
    String s = "PPPPPPPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testOneAbsence() {
    String s = "PPPPPAPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testTwoAbsence() {
    String s = "PAPPPAPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertFalse(solution.checkRecord(s));
  }

  @Test
  public void testThreeLates() {
    String s = "PPPLLLPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertFalse(solution.checkRecord(s));
  }

  @Test
  public void testTwoLates() {
    String s = "PPPLLPPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testOneLate() {
    String s = "PPPLPPPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testVeryLateButSafe() {
    String s = "LPLLALLPL";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }
}
