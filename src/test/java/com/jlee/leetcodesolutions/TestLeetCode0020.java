package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0020;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0020 {

  @Test
  public void theProblemCase1() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid("()");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase2() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid("{}");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase3() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid("[]");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase4() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid("()[]{}");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase5() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid("()[]{}()[]{}");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase6() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid("(]");
    Assert.assertFalse(result);
  }

  @Test
  public void theProblemCase7() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid("([)]");
    Assert.assertFalse(result);
  }

  @Test
  public void theProblemCase8() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid(")(}{][");
    Assert.assertFalse(result);
  }

  @Test
  public void theProblemCase9() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid("abc12345");
    Assert.assertFalse(result);
  }

  @Test
  public void theProblemCase10() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid("");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase11() {
    LeetCode0020 solution = new LeetCode0020();
    boolean result = solution.isValid("(}");
    Assert.assertFalse(result);
  }
}
