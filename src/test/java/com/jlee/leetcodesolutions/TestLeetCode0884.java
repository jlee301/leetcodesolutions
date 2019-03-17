package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0884;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0884 {
  @Test
  public void testProblemCase1() {
    // Input: A = "this apple is sweet", B = "this apple is sour"
    // Output: ["sweet","sour"]
    String A = "this apple is sweet", B = "this apple is sour";
    LeetCode0884 solution = new LeetCode0884();
    List<String> result = Arrays.asList(solution.uncommonFromSentences(A, B));
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("sweet"));
    Assert.assertTrue(result.contains("sour"));
  }

  @Test
  public void testProblemCase2() {
    // Input: A = "apple apple", B = "banana"
    // Output: ["banana"]
    String A = "apple apple", B = "banana";
    LeetCode0884 solution = new LeetCode0884();
    List<String> result = Arrays.asList(solution.uncommonFromSentences(A, B));
    Assert.assertEquals(1, result.size());
    Assert.assertTrue(result.contains("banana"));
  }
}
