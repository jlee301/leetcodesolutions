package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode371;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode371 {
  @Test
  public void testProblemCase1() {
    LeetCode371 solution = new LeetCode371();
    int a = 1;
    int b = 2;
    Assert.assertEquals(3, solution.getSum(a, b));
  }

  @Test
  public void testProblemCase2() {
    LeetCode371 solution = new LeetCode371();
    int a = 2;
    int b = 3;
    Assert.assertEquals(5, solution.getSum(a, b));
  }

  @Test
  public void testProblemCase3() {
    LeetCode371 solution = new LeetCode371();
    int a = 1000;
    int b = 24;
    Assert.assertEquals(1024, solution.getSum(a, b));
  }

  @Test
  public void testProblemCase4() {
    LeetCode371 solution = new LeetCode371();
    int a = 1000;
    int b = -24;
    Assert.assertEquals(976, solution.getSum(a, b));
  }

  @Test
  public void testProblemCase5() {
    LeetCode371 solution = new LeetCode371();
    int a = 24;
    int b = -1000;
    Assert.assertEquals(-976, solution.getSum(a, b));
  }

  @Test
  public void testProblemCase6() {
    LeetCode371 solution = new LeetCode371();
    int a = -1000;
    int b = -24;
    Assert.assertEquals(-1024, solution.getSum(a, b));
  }

  @Test
  public void testProblemCase7() {
    LeetCode371 solution = new LeetCode371();
    int a = 0;
    int b = 1000;
    Assert.assertEquals(1000, solution.getSum(a, b));
  }

  @Test
  public void testProblemCase8() {
    LeetCode371 solution = new LeetCode371();
    int a = 1000;
    int b = 0;
    Assert.assertEquals(1000, solution.getSum(a, b));
  }

  @Test
  public void testProblemCase9() {
    LeetCode371 solution = new LeetCode371();
    int a = 0;
    int b = 0;
    Assert.assertEquals(0, solution.getSum(a, b));
  }
}
