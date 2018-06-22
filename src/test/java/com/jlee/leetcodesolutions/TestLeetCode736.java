package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode736;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode736 {
  @Test
  public void testProblemCase1() {
    String expression = "(add 1 2)";
    LeetCode736 solution = new LeetCode736();
    Assert.assertEquals(3, solution.evaluate(expression));
  }

  @Test
  public void testProblemCase2() {
    String expression = "(mult 3 (add 2 3))";
    LeetCode736 solution = new LeetCode736();
    Assert.assertEquals(15, solution.evaluate(expression));
  }

  @Test
  public void testProblemCase3() {
    String expression = "(let x 2 (mult x 5))";
    LeetCode736 solution = new LeetCode736();
    Assert.assertEquals(10, solution.evaluate(expression));
  }

  @Test
  public void testProblemCase4() {
    String expression = "(let x 2 (mult x (let x 3 y 4 (add x y))))";
    LeetCode736 solution = new LeetCode736();
    Assert.assertEquals(14, solution.evaluate(expression));
  }

  @Test
  public void testProblemCase5() {
    String expression = "(let x 3 x 2 x)";
    LeetCode736 solution = new LeetCode736();
    Assert.assertEquals(2, solution.evaluate(expression));
  }

  @Test
  public void testProblemCase6() {
    String expression = "(let x 1 y 2 x (add x y) (add x y))";
    LeetCode736 solution = new LeetCode736();
    Assert.assertEquals(5, solution.evaluate(expression));
  }

  @Test
  public void testProblemCase7() {
    String expression = "(let x 2 (add (let x 3 (let x 4 x)) x))";
    LeetCode736 solution = new LeetCode736();
    Assert.assertEquals(6, solution.evaluate(expression));
  }

  @Test
  public void testProblemCase8() {
    String expression = "(let a1 3 b2 (add a1 1) b2)";
    LeetCode736 solution = new LeetCode736();
    Assert.assertEquals(4, solution.evaluate(expression));
  }

  @Test
  public void testProblemCase9() {
    String expression = "(add 1 -2)";
    LeetCode736 solution = new LeetCode736();
    Assert.assertEquals(-1, solution.evaluate(expression));
  }
}
