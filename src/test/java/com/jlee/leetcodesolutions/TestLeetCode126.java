package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode126;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode126 {
  @Test
  public void testProblemCase1() {
    String beginWord = "hit", endWord = "cog";
    List<String> wordList = Arrays.asList(new String[] {"hot","dot","dog","lot","log","cog"});
    LeetCode126 solution = new LeetCode126();
    List<List<String>> result = solution.findLadders(beginWord, endWord, wordList);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(5, result.get(0).size());
    Assert.assertEquals("hit", result.get(0).get(0));
    Assert.assertEquals("hot", result.get(0).get(1));
    Assert.assertEquals("lot", result.get(0).get(2));
    Assert.assertEquals("log", result.get(0).get(3));
    Assert.assertEquals("cog", result.get(0).get(4));
    Assert.assertEquals(5, result.get(1).size());
    Assert.assertEquals("hit", result.get(1).get(0));
    Assert.assertEquals("hot", result.get(1).get(1));
    Assert.assertEquals("dot", result.get(1).get(2));
    Assert.assertEquals("dog", result.get(1).get(3));
    Assert.assertEquals("cog", result.get(1).get(4));
  }

  @Test
  public void testProblemCase2() {
    String beginWord = "hit", endWord = "cog";
    List<String> wordList = Arrays.asList(new String[] {"hot","dot","dog","lot","log"});
    LeetCode126 solution = new LeetCode126();
    List<List<String>> result = solution.findLadders(beginWord, endWord, wordList);
    Assert.assertEquals(0, result.size());
  }
}
