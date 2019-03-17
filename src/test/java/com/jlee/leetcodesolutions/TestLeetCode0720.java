package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0720;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0720 {
  @Test
  public void testProblemCase1() {
    String[] words = {"w","wo","wor","worl", "world"};
    LeetCode0720 solution = new LeetCode0720();
    Assert.assertEquals("world", solution.longestWord(words));
  }

  @Test
  public void testLexigraphicallyMore() {
    String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
    LeetCode0720 solution = new LeetCode0720();
    Assert.assertEquals("apple", solution.longestWord(words));
  }

  @Test
  public void testLexigraphicallyLess() {
    String[] words = {"a", "banana", "app", "appl", "ap", "apple", "apply"};
    LeetCode0720 solution = new LeetCode0720();
    Assert.assertEquals("apple", solution.longestWord(words));
  }

  @Test
  public void testOneLetterWord() {
    String[] words = {"a", "b", "c", "d"};
    LeetCode0720 solution = new LeetCode0720();
    Assert.assertEquals("a", solution.longestWord(words));
  }

  @Test
  public void testCannotBuild() {
    String[] words = {"ab", "ba", "cd", "dc"};
    LeetCode0720 solution = new LeetCode0720();
    Assert.assertEquals("", solution.longestWord(words));
  }

  @Test
  public void testEmpty() {
    String[] words = {};
    LeetCode0720 solution = new LeetCode0720();
    Assert.assertEquals("", solution.longestWord(words));
  }

  @Test
  public void testNull() {
    String[] words = null;
    LeetCode0720 solution = new LeetCode0720();
    Assert.assertEquals("", solution.longestWord(words));
  }
}
