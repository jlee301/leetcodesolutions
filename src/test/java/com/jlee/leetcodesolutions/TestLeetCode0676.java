package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0676;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0676 {
  @Test
  public void testProblemCase() {
    LeetCode0676 solution = new LeetCode0676();
    solution.buildDict(new String[] {"hello", "leetcode"});
    Assert.assertFalse(solution.search("hello"));
    Assert.assertTrue(solution.search("hhllo"));
    Assert.assertFalse(solution.search("hell"));
    Assert.assertFalse(solution.search("leetcoded"));
  }
}
