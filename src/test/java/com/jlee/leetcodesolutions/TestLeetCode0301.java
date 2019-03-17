package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0301;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0301 {
  @Test
  public void testProblemCase1() {
    String s = "()())()";
    LeetCode0301 solution = new LeetCode0301();
    List<String> result = solution.removeInvalidParentheses(s);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("()()()"));
    Assert.assertTrue(result.contains("(())()"));
  }

  @Test
  public void testProblemCase2() {
    String s = "(a)())()";
    LeetCode0301 solution = new LeetCode0301();
    List<String> result = solution.removeInvalidParentheses(s);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("(a)()()"));
    Assert.assertTrue(result.contains("(a())()"));
  }

  @Test
  public void testProblemCase3() {
    String s = ")(";
    LeetCode0301 solution = new LeetCode0301();
    List<String> result = solution.removeInvalidParentheses(s);
    Assert.assertEquals(1, result.size());
    Assert.assertTrue(result.contains(""));
  }

  @Test
  public void testProblemCase4() {
    String s = "";
    LeetCode0301 solution = new LeetCode0301();
    List<String> result = solution.removeInvalidParentheses(s);
    Assert.assertEquals(1, result.size());
    Assert.assertTrue(result.contains(""));
  }

  @Test
  public void testProblemCase5() {
    String s = null;
    LeetCode0301 solution = new LeetCode0301();
    List<String> result = solution.removeInvalidParentheses(s);
    Assert.assertEquals(0, result.size());
  }
}
