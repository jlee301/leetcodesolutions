package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0022;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0022 {
  @Test
  public void testN3() {
    int n = 3;
    LeetCode0022 solution = new LeetCode0022();
    List<String> result = solution.generateParenthesis(n);
    Assert.assertEquals(5, result.size());
    Assert.assertEquals("((()))", result.get(0));
    Assert.assertEquals("(()())", result.get(1));
    Assert.assertEquals("(())()", result.get(2));
    Assert.assertEquals("()(())", result.get(3));
    Assert.assertEquals("()()()", result.get(4));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode0022 solution = new LeetCode0022();
    List<String> result = solution.generateParenthesis(n);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals("(())", result.get(0));
    Assert.assertEquals("()()", result.get(1));
  }

  @Test
  public void testN1() {
    int n = 1;
    LeetCode0022 solution = new LeetCode0022();
    List<String> result = solution.generateParenthesis(n);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("()", result.get(0));
  }

  @Test
  public void testN0() {
    int n = 0;
    LeetCode0022 solution = new LeetCode0022();
    List<String> result = solution.generateParenthesis(n);
    Assert.assertEquals(0, result.size());
  }
}
