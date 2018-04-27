package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode676;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode676 {
  @Test
  public void testProblemCase() {
    LeetCode676 solution = new LeetCode676();
    solution.buildDict(new String[] {"hello", "leetcode"});
    Assert.assertFalse(solution.search("hello"));
    Assert.assertTrue(solution.search("hhllo"));
    Assert.assertFalse(solution.search("hell"));
    Assert.assertFalse(solution.search("leetcoded"));
  }
}
