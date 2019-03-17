package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0017;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0017 {
  @Test
  public void testProblemCase() {
    String digits = "23";
    LeetCode0017 solution = new LeetCode0017();
    List<String> result = solution.letterCombinations(digits);
    Assert.assertEquals(9, result.size());
    Assert.assertEquals("ad", result.get(0));
    Assert.assertEquals("ae", result.get(1));
    Assert.assertEquals("af", result.get(2));
    Assert.assertEquals("bd", result.get(3));
    Assert.assertEquals("be", result.get(4));
    Assert.assertEquals("bf", result.get(5));
    Assert.assertEquals("cd", result.get(6));
    Assert.assertEquals("ce", result.get(7));
    Assert.assertEquals("cf", result.get(8));
  }

  @Test
  public void testSingleDigit() {
    String digits = "2";
    LeetCode0017 solution = new LeetCode0017();
    List<String> result = solution.letterCombinations(digits);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals("a", result.get(0));
    Assert.assertEquals("b", result.get(1));
    Assert.assertEquals("c", result.get(2));
  }

  @Test
  public void testContainsOne() {
    String digits = "21";
    LeetCode0017 solution = new LeetCode0017();
    List<String> result = solution.letterCombinations(digits);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testContainsZero() {
    String digits = "20";
    LeetCode0017 solution = new LeetCode0017();
    List<String> result = solution.letterCombinations(digits);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testEmpty() {
    String digits = "";
    LeetCode0017 solution = new LeetCode0017();
    List<String> result = solution.letterCombinations(digits);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    String digits = null;
    LeetCode0017 solution = new LeetCode0017();
    List<String> result = solution.letterCombinations(digits);
    Assert.assertEquals(0, result.size());
  }
}
