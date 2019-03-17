package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0524;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0524 {
  @Test
  public void testProblemCase1() {
    String s = "abpcplea";
    List<String> d = Arrays.asList("ale","apple","monkey","plea");
    LeetCode0524 solution = new LeetCode0524();
    Assert.assertEquals("apple", solution.findLongestWord(s, d));
  }

  @Test
  public void testProblemCase2() {
    String s = "abpcplea";
    List<String> d = Arrays.asList("a","b","c");
    LeetCode0524 solution = new LeetCode0524();
    Assert.assertEquals("a", solution.findLongestWord(s, d));
  }

  @Test
  public void testLexiLess() {
    String s = "abpcplea";
    List<String> d = Arrays.asList("c","b","a");
    LeetCode0524 solution = new LeetCode0524();
    Assert.assertEquals("a", solution.findLongestWord(s, d));
  }

  @Test
  public void testNoMatch() {
    String s = "abpcplea";
    List<String> d = Arrays.asList("x","y","z");
    LeetCode0524 solution = new LeetCode0524();
    Assert.assertEquals("", solution.findLongestWord(s, d));
  }

  @Test
  public void testSEmpty() {
    String s = "";
    List<String> d = Arrays.asList("x","y","z");
    LeetCode0524 solution = new LeetCode0524();
    Assert.assertEquals("", solution.findLongestWord(s, d));
  }

  @Test
  public void testSNull() {
    String s = null;
    List<String> d = Arrays.asList("x","y","z");
    LeetCode0524 solution = new LeetCode0524();
    Assert.assertEquals("", solution.findLongestWord(s, d));
  }

  @Test
  public void testDEmpty() {
    String s = "abpcplea";
    List<String> d = Arrays.asList();
    LeetCode0524 solution = new LeetCode0524();
    Assert.assertEquals("", solution.findLongestWord(s, d));
  }
}
