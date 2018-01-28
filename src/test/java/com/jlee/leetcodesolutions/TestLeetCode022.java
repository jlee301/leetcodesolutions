package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode022;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode022 {
  @Test
  public void testN3() {
    int n = 3;
    LeetCode022 solution = new LeetCode022();
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
    LeetCode022 solution = new LeetCode022();
    List<String> result = solution.generateParenthesis(n);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals("(())", result.get(0));
    Assert.assertEquals("()()", result.get(1));
  }

  @Test
  public void testN1() {
    int n = 1;
    LeetCode022 solution = new LeetCode022();
    List<String> result = solution.generateParenthesis(n);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("()", result.get(0));
  }

  @Test
  public void testN0() {
    int n = 0;
    LeetCode022 solution = new LeetCode022();
    List<String> result = solution.generateParenthesis(n);
    Assert.assertEquals(0, result.size());
  }
}
