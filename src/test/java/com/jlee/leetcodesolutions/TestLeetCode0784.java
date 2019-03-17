package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0784;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0784 {
  @Test
  public void testProblemCase1() {
    String S = "a12b";
    LeetCode0784 solution = new LeetCode0784();
    List<String> result = solution.letterCasePermutation(S);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals("A12B", result.get(0));
    Assert.assertEquals("A12b", result.get(1));
    Assert.assertEquals("a12B", result.get(2));
    Assert.assertEquals("a12b", result.get(3));
  }

  @Test
  public void testProblemCase2() {
    String S = "3z4";
    LeetCode0784 solution = new LeetCode0784();
    List<String> result = solution.letterCasePermutation(S);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals("3Z4", result.get(0));
    Assert.assertEquals("3z4", result.get(1));
  }

  @Test
  public void testProblemCase3() {
    String S = "12345";
    LeetCode0784 solution = new LeetCode0784();
    List<String> result = solution.letterCasePermutation(S);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("12345", result.get(0));
  }

  @Test
  public void testUpperCase() {
    String S = "3AZ4";
    LeetCode0784 solution = new LeetCode0784();
    List<String> result = solution.letterCasePermutation(S);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals("3az4", result.get(0));
    Assert.assertEquals("3aZ4", result.get(1));
    Assert.assertEquals("3Az4", result.get(2));
    Assert.assertEquals("3AZ4", result.get(3));
  }

  @Test
  public void testSymbols() {
    String S = "!@#$%^&*(){}|[]";
    LeetCode0784 solution = new LeetCode0784();
    List<String> result = solution.letterCasePermutation(S);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("!@#$%^&*(){}|[]", result.get(0));
  }

  @Test
  public void testEmpty() {
    String S = "";
    LeetCode0784 solution = new LeetCode0784();
    List<String> result = solution.letterCasePermutation(S);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("", result.get(0));
  }

  @Test
  public void testNull() {
    String S = null;
    LeetCode0784 solution = new LeetCode0784();
    List<String> result = solution.letterCasePermutation(S);
    Assert.assertEquals(0, result.size());
  }
}
