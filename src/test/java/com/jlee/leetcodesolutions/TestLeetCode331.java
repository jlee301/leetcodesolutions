package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode331;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode331 {
  @Test
  public void testProblemCase1() {
    String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
    LeetCode331 solution = new LeetCode331();
    Assert.assertTrue(solution.isValidSerialization(preorder));
  }

  @Test
  public void testProblemCase2() {
    String preorder = "1,#";
    LeetCode331 solution = new LeetCode331();
    Assert.assertFalse(solution.isValidSerialization(preorder));
  }

  @Test
  public void testProblemCase3() {
    String preorder = "9,#,#,1";
    LeetCode331 solution = new LeetCode331();
    Assert.assertFalse(solution.isValidSerialization(preorder));
  }

  @Test
  public void testEmpty() {
    String preorder = "";
    LeetCode331 solution = new LeetCode331();
    Assert.assertFalse(solution.isValidSerialization(preorder));
  }

  @Test
  public void testNull() {
    String preorder = null;
    LeetCode331 solution = new LeetCode331();
    Assert.assertFalse(solution.isValidSerialization(preorder));
  }
}
