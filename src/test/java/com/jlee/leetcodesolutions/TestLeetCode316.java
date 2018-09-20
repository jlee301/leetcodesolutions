package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode316;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode316 {
  @Test
  public void testProblemCase1() {
    String s = "bcabc";
    LeetCode316 solution = new LeetCode316();
    Assert.assertEquals("abc", solution.removeDuplicateLetters(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "cbacdcbc";
    LeetCode316 solution = new LeetCode316();
    Assert.assertEquals("acdb", solution.removeDuplicateLetters(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "mitnlruhznjfyzmtmfnstsxwktxlboxutbic";
    LeetCode316 solution = new LeetCode316();
    Assert.assertEquals("ilrhjfyzmnstwkboxuc", solution.removeDuplicateLetters(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "eywdgenmcnzhztolafcfnirfpuxmfcenlppegrcalgxjlajxmphwidqqtrqnmmbssotoywfrtylm";
    LeetCode316 solution = new LeetCode316();
    Assert.assertEquals("chzafipuegjlxdqnbsotwrym", solution.removeDuplicateLetters(s));
  }
}
