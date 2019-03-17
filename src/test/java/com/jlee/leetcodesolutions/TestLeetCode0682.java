package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0682;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0682 {
  @Test
  public void testProblemCase1() {
    String[] ops = {"5","2","C","D","+"};
    LeetCode0682 solution = new LeetCode0682();
    Assert.assertEquals(30, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase2() {
    String[] ops = {"5","-2","4","C","D","9","+","+"};
    LeetCode0682 solution = new LeetCode0682();
    Assert.assertEquals(27, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase3() {
    String[] ops = {"5","+"};
    LeetCode0682 solution = new LeetCode0682();
    Assert.assertEquals(10, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase4() {
    String[] ops = {"+"};
    LeetCode0682 solution = new LeetCode0682();
    Assert.assertEquals(0, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase5() {
    String[] ops = {"C"};
    LeetCode0682 solution = new LeetCode0682();
    Assert.assertEquals(0, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase6() {
    String[] ops = {"D"};
    LeetCode0682 solution = new LeetCode0682();
    Assert.assertEquals(0, solution.calPoints(ops));
  }

  @Test
  public void testProblemCase7() {
    String[] ops = {};
    LeetCode0682 solution = new LeetCode0682();
    Assert.assertEquals(0, solution.calPoints(ops));
  }
}
