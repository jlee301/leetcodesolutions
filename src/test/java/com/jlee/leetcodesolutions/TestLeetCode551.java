package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode551;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode551 {
  @Test
  public void testProblemCase1() {
    String s = "PPPPPPPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "PPPPPAPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "PAPPPAPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertFalse(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "PPPLLLPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertFalse(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "PPPLLPPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "PPPLPPPPPP";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase7() {
    String s = "LPLLALLPL";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "";
    LeetCode551 solution = new LeetCode551();
    Assert.assertTrue(solution.checkRecord(s));
  }
}
