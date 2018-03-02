package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.WordDictionary;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode211 {
  @Test
  public void testAddWord() {
    WordDictionary solution = new WordDictionary();
    solution.addWord("bad");
    solution.addWord("dad");
    solution.addWord("mad");
    solution.addWord("badass");
    Assert.assertTrue(solution.search("b.."));
    Assert.assertTrue(solution.search("ba."));
    Assert.assertTrue(solution.search("bad"));
    Assert.assertTrue(solution.search(".ad"));
    Assert.assertTrue(solution.search("..d"));
    Assert.assertTrue(solution.search("..."));
    Assert.assertTrue(solution.search("bad..."));
    Assert.assertFalse(solution.search("pad"));
    Assert.assertFalse(solution.search("."));
    Assert.assertFalse(solution.search("ba"));
  }

  @Test
  public void testInvalid() {
    WordDictionary solution = new WordDictionary();
    solution.addWord("");
    solution.addWord(null);
    Assert.assertFalse(solution.search(""));
    Assert.assertFalse(solution.search(null));
  }
}
