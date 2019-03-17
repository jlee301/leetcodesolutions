package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0399;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0399 {
  @Test
  public void testProblemCase1() {
    String[][] equations = { {"a", "b"}, {"b", "c"} };
    double[] values = { 2.0, 3.0 };
    String[][] queries = { {"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"} };
    LeetCode0399 solution = new LeetCode0399();
    Assert.assertArrayEquals(new double[] {6.0, 0.5, -1.0, 1.0, -1.0}, solution.calcEquation(equations, values, queries), 0.0);
  }

  @Test
  public void testProblemCase2() {
    String[][] equations = { {"a", "b"}, {"c", "b"} };
    double[] values = { 2.0, 3.0 };
    String[][] queries = { {"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"} };
    LeetCode0399 solution = new LeetCode0399();
    Assert.assertArrayEquals(new double[] {0.6666666666666666, 0.5, -1.0, 1.0, -1.0}, solution.calcEquation(equations, values, queries), 0.0);
  }
}
