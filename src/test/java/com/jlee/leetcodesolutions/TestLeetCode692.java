package com.jlee.leetcodesolutions;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode692 {
  @Test
  public void testProblemCase1() {
    String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
    int k = 2;
    LeetCode692 solution = new LeetCode692();
    List<String> result = solution.topKFrequent(words, k);
    String[] data = new String[result.size()];
    result.toArray(data);
    Assert.assertArrayEquals(new String[] {"i", "love"}, data);
  }

  @Test
  public void testProblemCase2() {
    String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
    int k = 4;
    LeetCode692 solution = new LeetCode692();
    List<String> result = solution.topKFrequent(words, k);
    String[] data = new String[result.size()];
    result.toArray(data);
    Assert.assertArrayEquals(new String[] {"the", "is", "sunny", "day"}, data);
  }

  @Test
  public void testKBiggerThanWords() {
    String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
    int k = 10;
    LeetCode692 solution = new LeetCode692();
    List<String> result = solution.topKFrequent(words, k);
    String[] data = new String[result.size()];
    result.toArray(data);
    Assert.assertArrayEquals(new String[] {"i", "love", "coding", "leetcode"}, data);
  }
}
