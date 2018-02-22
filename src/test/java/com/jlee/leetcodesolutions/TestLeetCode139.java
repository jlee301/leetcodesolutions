package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode139;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode139 {
  @Test
  public void testProblemCase() {
    String s = "leetcode";
    List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"leet","code"}));
    LeetCode139 solution = new LeetCode139();
    Assert.assertTrue(solution.wordBreak(s, wordDict));
  }

  @Test
  public void testWholeWord() {
    String s = "leetcode";
    List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"leetcode","leet","le","et"}));
    LeetCode139 solution = new LeetCode139();
    Assert.assertTrue(solution.wordBreak(s, wordDict));
  }

  @Test
  public void testMultipleBreaks() {
    String s = "leetcode";
    List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"le","et","co","de"}));
    LeetCode139 solution = new LeetCode139();
    Assert.assertTrue(solution.wordBreak(s, wordDict));
  }

  @Test
  public void testNotBreakable() {
    String s = "leetcode";
    List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"le","et","de"}));
    LeetCode139 solution = new LeetCode139();
    Assert.assertFalse(solution.wordBreak(s, wordDict));
  }

  @Test
  public void testSEmpty() {
    String s = "";
    List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"leet","code"}));
    LeetCode139 solution = new LeetCode139();
    Assert.assertFalse(solution.wordBreak(s, wordDict));
  }

  @Test
  public void testWordDictEmpty() {
    String s = "leetcode";
    List<String> wordDict = new ArrayList<>();
    LeetCode139 solution = new LeetCode139();
    Assert.assertFalse(solution.wordBreak(s, wordDict));
  }

  @Test
  public void testSNull() {
    String s = null;
    List<String> wordDict = new ArrayList<>(Arrays.asList(new String[] {"leet","code"}));
    LeetCode139 solution = new LeetCode139();
    Assert.assertFalse(solution.wordBreak(s, wordDict));
  }

  @Test
  public void testWordDictNull() {
    String s = "leetcode";
    List<String> wordDict = null;
    LeetCode139 solution = new LeetCode139();
    Assert.assertFalse(solution.wordBreak(s, wordDict));
  }
}
