package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0049;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0049 {
  @Test
  public void testProblemCase() {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    LeetCode0049 solution = new LeetCode0049();
    List<List<String>> result = solution.groupAnagrams(strs);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(2, result.get(0).size());
    Assert.assertEquals("tan", result.get(0).get(0));
    Assert.assertEquals("nat", result.get(0).get(1));
    Assert.assertEquals(1, result.get(1).size());
    Assert.assertEquals("bat", result.get(1).get(0));
    Assert.assertEquals(3, result.get(2).size());
    Assert.assertEquals("eat", result.get(2).get(0));
    Assert.assertEquals("tea", result.get(2).get(1));
    Assert.assertEquals("ate", result.get(2).get(2));
  }

  @Test
  public void testEmpty() {
    String[] strs = {};
    LeetCode0049 solution = new LeetCode0049();
    List<List<String>> result = solution.groupAnagrams(strs);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    String[] strs = null;
    LeetCode0049 solution = new LeetCode0049();
    List<List<String>> result = solution.groupAnagrams(strs);
    Assert.assertEquals(0, result.size());
  }
}
