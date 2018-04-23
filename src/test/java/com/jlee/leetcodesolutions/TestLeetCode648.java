package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode648;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode648 {
  @Test
  public void testProblemCase() {
    List<String> dict = Arrays.asList("cat", "bat", "rat");
    String sentence = "the cattle was rattled by the battery";
    LeetCode648 solution = new LeetCode648();
    Assert.assertEquals("the cat was rat by the bat", solution.replaceWords(dict, sentence));
  }
}
