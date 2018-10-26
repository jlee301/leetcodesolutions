package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode140;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode140 {
  @Test
  public void testProblemCase1() {
    String s = "catsanddog";
    List<String> wordDict = Arrays.asList(new String[] {"cat", "cats", "and", "sand", "dog"});
    LeetCode140 solution = new LeetCode140();
    List<String> result = solution.wordBreak(s, wordDict);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("cats and dog"));
    Assert.assertTrue(result.contains("cat sand dog"));
  }

  @Test
  public void testProblemCase2() {
    String s = "pineapplepenapple";
    List<String> wordDict = Arrays.asList(new String[] {"apple", "pen", "applepen", "pine", "pineapple"});
    LeetCode140 solution = new LeetCode140();
    List<String> result = solution.wordBreak(s, wordDict);
    Assert.assertEquals(3, result.size());
    Assert.assertTrue(result.contains("pine apple pen apple"));
    Assert.assertTrue(result.contains("pineapple pen apple"));
    Assert.assertTrue(result.contains("pine applepen apple"));
  }

  @Test
  public void testProblemCase3() {
    String s = "catsandog";
    List<String> wordDict = Arrays.asList(new String[] {"cats", "dog", "sand", "and", "cat"});
    LeetCode140 solution = new LeetCode140();
    List<String> result = solution.wordBreak(s, wordDict);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase4() {
    String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    List<String> wordDict = Arrays.asList(new String[] {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"});
    LeetCode140 solution = new LeetCode140();
    List<String> result = solution.wordBreak(s, wordDict);
    Assert.assertEquals(0, result.size());
  }
}
