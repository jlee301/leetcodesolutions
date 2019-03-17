package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0648;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0648 {
  @Test
  public void testProblemCase() {
    List<String> dict = Arrays.asList("cat", "bat", "rat");
    String sentence = "the cattle was rattled by the battery";
    LeetCode0648 solution = new LeetCode0648();
    Assert.assertEquals("the cat was rat by the bat", solution.replaceWords(dict, sentence));
  }
}
