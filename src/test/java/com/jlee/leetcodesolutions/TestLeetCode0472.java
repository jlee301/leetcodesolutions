package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0472;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0472 {
  @Test
  public void testProblemCase1() {
    // Input: ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
    // Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
    String[] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
    LeetCode0472 solution = new LeetCode0472();
    List<String> result = solution.findAllConcatenatedWordsInADict(words);
    Assert.assertEquals(3, result.size());
    Assert.assertTrue(result.contains("catsdogcats"));
    Assert.assertTrue(result.contains("dogcatsdog"));
    Assert.assertTrue(result.contains("ratcatdogcat"));
  }

  @Test
  public void testProblemCase2() {
    String[] words = {};
    LeetCode0472 solution = new LeetCode0472();
    List<String> result = solution.findAllConcatenatedWordsInADict(words);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase3() {
    String[] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat",""};
    LeetCode0472 solution = new LeetCode0472();
    List<String> result = solution.findAllConcatenatedWordsInADict(words);
    Assert.assertEquals(3, result.size());
    Assert.assertTrue(result.contains("catsdogcats"));
    Assert.assertTrue(result.contains("dogcatsdog"));
    Assert.assertTrue(result.contains("ratcatdogcat"));
  }
}
