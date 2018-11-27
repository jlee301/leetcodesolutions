package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode020;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode020 {

  @Test
  public void theProblemCase1() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid("()");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase2() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid("{}");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase3() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid("[]");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase4() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid("()[]{}");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase5() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid("()[]{}()[]{}");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase6() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid("(]");
    Assert.assertFalse(result);
  }

  @Test
  public void theProblemCase7() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid("([)]");
    Assert.assertFalse(result);
  }

  @Test
  public void theProblemCase8() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid(")(}{][");
    Assert.assertFalse(result);
  }

  @Test
  public void theProblemCase9() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid("abc12345");
    Assert.assertFalse(result);
  }

  @Test
  public void theProblemCase10() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid("");
    Assert.assertTrue(result);
  }

  @Test
  public void theProblemCase11() {
    LeetCode020 solution = new LeetCode020();
    boolean result = solution.isValid("(}");
    Assert.assertFalse(result);
  }
}
