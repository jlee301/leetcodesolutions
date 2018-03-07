package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode241;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode241 {
  @Test
  public void testProblemCase1() {
    String input = "2-1-1";
    LeetCode241 solution = new LeetCode241();
    List<Integer> result = solution.diffWaysToCompute(input);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(2, (int) result.get(0));
    Assert.assertEquals(0, (int) result.get(1));
  }

  @Test
  public void testProblemCase2() {
    String input = "2*3-4*5";
    LeetCode241 solution = new LeetCode241();
    List<Integer> result = solution.diffWaysToCompute(input);
    Assert.assertEquals(5, result.size());
    Assert.assertEquals(-34, (int) result.get(0));
    Assert.assertEquals(-10, (int) result.get(1));
    Assert.assertEquals(-14, (int) result.get(2));
    Assert.assertEquals(-10, (int) result.get(3));
    Assert.assertEquals(10, (int) result.get(4));
  }

  @Test
  public void testAdd() {
    String input = "2+2+2";
    LeetCode241 solution = new LeetCode241();
    List<Integer> result = solution.diffWaysToCompute(input);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(6, (int) result.get(0));
    Assert.assertEquals(6, (int) result.get(1));
  }

  @Test
  public void testSub() {
    String input = "2-2-2";
    LeetCode241 solution = new LeetCode241();
    List<Integer> result = solution.diffWaysToCompute(input);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(2, (int) result.get(0));
    Assert.assertEquals(-2, (int) result.get(1));
  }

  @Test
  public void testMul() {
    String input = "2*2*2";
    LeetCode241 solution = new LeetCode241();
    List<Integer> result = solution.diffWaysToCompute(input);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(8, (int) result.get(0));
    Assert.assertEquals(8, (int) result.get(0));
  }

  @Test
  public void testJustANumber() {
    String input = "2";
    LeetCode241 solution = new LeetCode241();
    List<Integer> result = solution.diffWaysToCompute(input);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(2, (int) result.get(0));
  }

  @Test
  public void testEmpty() {
    String input = "";
    LeetCode241 solution = new LeetCode241();
    List<Integer> result = solution.diffWaysToCompute(input);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    String input = null;
    LeetCode241 solution = new LeetCode241();
    List<Integer> result = solution.diffWaysToCompute(input);
    Assert.assertEquals(0, result.size());
  }
}
