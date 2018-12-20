package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode682;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode682 {
  @Test
  public void testProblemCase1() {
    String[] ops = {"5","2","C","D","+"};
    LeetCode682 solution = new LeetCode682();
    Assert.assertEquals(30, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase2() {
    String[] ops = {"5","-2","4","C","D","9","+","+"};
    LeetCode682 solution = new LeetCode682();
    Assert.assertEquals(27, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase3() {
    String[] ops = {"5","+"};
    LeetCode682 solution = new LeetCode682();
    Assert.assertEquals(10, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase4() {
    String[] ops = {"+"};
    LeetCode682 solution = new LeetCode682();
    Assert.assertEquals(0, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase5() {
    String[] ops = {"C"};
    LeetCode682 solution = new LeetCode682();
    Assert.assertEquals(0, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase6() {
    String[] ops = {"D"};
    LeetCode682 solution = new LeetCode682();
    Assert.assertEquals(0, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase7() {
    String[] ops = {};
    LeetCode682 solution = new LeetCode682();
    Assert.assertEquals(0, solution.calPoints(ops));
  }
}
