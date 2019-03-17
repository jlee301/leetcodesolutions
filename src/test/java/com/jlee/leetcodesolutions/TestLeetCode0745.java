package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0745;
import com.jlee.leetcodesolutions.LeetCode0745.WordFilter;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0745 {
  @Test
  public void testProblemCase() {
    String[] words = { "apple" };
    LeetCode0745 solution = new LeetCode0745();
    WordFilter wf = solution.new WordFilter(words);
    Assert.assertEquals(0, wf.f("a", "e"));
    Assert.assertEquals(-1, wf.f("b", ""));
  }

  @Test
  public void testBigWord() {
    String[] words = { "supercalifragilisticexpialidocious" };
    LeetCode0745 solution = new LeetCode0745();
    WordFilter wf = solution.new WordFilter(words);
    Assert.assertEquals(0, wf.f("su", "ous"));
    Assert.assertEquals(-1, wf.f("b", ""));
  }

  @Test
  public void testDuplicateWords() {
    String[] words = { "apple", "apple" };
    LeetCode0745 solution = new LeetCode0745();
    WordFilter wf = solution.new WordFilter(words);
    Assert.assertEquals(1, wf.f("a", "e"));
    Assert.assertEquals(-1, wf.f("b", ""));
    Assert.assertEquals(-1, wf.f("", "b"));
  }

  @Test
  public void testSimilarWords() {
    String[] words = { "apple", "capples" };
    LeetCode0745 solution = new LeetCode0745();
    WordFilter wf = solution.new WordFilter(words);
    Assert.assertEquals(0, wf.f("a", "e"));
    Assert.assertEquals(1, wf.f("c", "es"));
    Assert.assertEquals(-1, wf.f("a", "es"));
    Assert.assertEquals(-1, wf.f("b", ""));
    Assert.assertEquals(-1, wf.f("", "b"));
  }

  @Test
  public void testSimilarWords2() {
    String[] words = { "capples", "apple" };
    LeetCode0745 solution = new LeetCode0745();
    WordFilter wf = solution.new WordFilter(words);
    Assert.assertEquals(1, wf.f("a", "e"));
    Assert.assertEquals(0, wf.f("c", "es"));
    Assert.assertEquals(-1, wf.f("a", "es"));
    Assert.assertEquals(-1, wf.f("b", ""));
    Assert.assertEquals(-1, wf.f("", "b"));
  }
}
