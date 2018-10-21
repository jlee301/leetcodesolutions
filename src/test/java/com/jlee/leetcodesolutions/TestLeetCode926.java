package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode926;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode926 {
  @Test
  public void testProblemCase1() {
    String S = "00110";
    LeetCode926 solution = new LeetCode926();
    Assert.assertEquals(1, solution.minFlipsMonoIncr(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "010110";
    LeetCode926 solution = new LeetCode926();
    Assert.assertEquals(2, solution.minFlipsMonoIncr(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "00011000";
    LeetCode926 solution = new LeetCode926();
    Assert.assertEquals(2, solution.minFlipsMonoIncr(S));
  }

  @Test
  public void testProblemCase4() {
    String S = "11111110";
    LeetCode926 solution = new LeetCode926();
    Assert.assertEquals(1, solution.minFlipsMonoIncr(S));
  }

  @Test
  public void testProblemCase5() {
    String S = "00001111";
    LeetCode926 solution = new LeetCode926();
    Assert.assertEquals(0, solution.minFlipsMonoIncr(S));
  }
}
