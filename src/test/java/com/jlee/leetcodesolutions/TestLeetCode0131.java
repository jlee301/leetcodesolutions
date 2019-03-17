package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0131;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0131 {
  @Test
  public void testProblemCase() {
    String s = "aab";
    LeetCode0131 solution = new LeetCode0131();
    List<List<String>> result = solution.partition(s);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(3, result.get(0).size());
    Assert.assertEquals("a", result.get(0).get(0));
    Assert.assertEquals("a", result.get(0).get(1));
    Assert.assertEquals("b", result.get(0).get(2));
    Assert.assertEquals(2, result.get(1).size());
    Assert.assertEquals("aa", result.get(1).get(0));
    Assert.assertEquals("b", result.get(1).get(1));
  }

  @Test
  public void testEntireStringPalindrome() {
    String s = "abba";
    LeetCode0131 solution = new LeetCode0131();
    List<List<String>> result = solution.partition(s);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(4, result.get(0).size());
    Assert.assertEquals("a", result.get(0).get(0));
    Assert.assertEquals("b", result.get(0).get(1));
    Assert.assertEquals("b", result.get(0).get(2));
    Assert.assertEquals("a", result.get(0).get(3));
    Assert.assertEquals(3, result.get(1).size());
    Assert.assertEquals("a", result.get(1).get(0));
    Assert.assertEquals("bb", result.get(1).get(1));
    Assert.assertEquals("a", result.get(1).get(2));
    Assert.assertEquals(1, result.get(2).size());
    Assert.assertEquals("abba", result.get(2).get(0));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode0131 solution = new LeetCode0131();
    List<List<String>> result = solution.partition(s);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(0, result.get(0).size());
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode0131 solution = new LeetCode0131();
    List<List<String>> result = solution.partition(s);
    Assert.assertEquals(0, result.size());
  }
}
