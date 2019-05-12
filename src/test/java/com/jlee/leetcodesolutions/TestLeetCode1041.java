package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1041;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1041 {
  @Test
  public void testProblemCase1() {
    String instructions = "GGLLGG";
    LeetCode1041 solution = new LeetCode1041();
    Assert.assertTrue(solution.isRobotBounded(instructions));
  }

  @Test
  public void testProblemCase2() {
    String instructions = "GG";
    LeetCode1041 solution = new LeetCode1041();
    Assert.assertFalse(solution.isRobotBounded(instructions));
  }

  @Test
  public void testProblemCase3() {
    String instructions = "GL";
    LeetCode1041 solution = new LeetCode1041();
    Assert.assertTrue(solution.isRobotBounded(instructions));
  }

  @Test
  public void testProblemCase4() {
    String instructions = "LLLLRRRLLLLRR";
    LeetCode1041 solution = new LeetCode1041();
    Assert.assertTrue(solution.isRobotBounded(instructions));
  }

  @Test
  public void testProblemCase5() {
    String instructions = "LLLRLLLRLLGLLGGRGLLLGGLRRRRRGLRLRLRLGGRGRGRLLLLLLGLLRLGLGLRLGGGRR";
    LeetCode1041 solution = new LeetCode1041();
    Assert.assertFalse(solution.isRobotBounded(instructions));
  }
}
