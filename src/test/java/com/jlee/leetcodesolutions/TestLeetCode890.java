package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode890;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode890 {
  @Test
  public void testProblemCase1() {
    String[] words = {"abc","deq","mee","aqq","dkd","ccc","abbb"};
    String pattern = "abb";
    LeetCode890 solution = new LeetCode890();
    List<String> result = solution.findAndReplacePattern(words, pattern);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("mee"));
    Assert.assertTrue(result.contains("aqq"));
  }
}
