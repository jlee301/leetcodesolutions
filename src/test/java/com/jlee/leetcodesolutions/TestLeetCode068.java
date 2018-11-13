package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode068;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode068 {
  @Test
  public void testProblemCase1() {
    String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
    int maxWidth = 16;
    LeetCode068 solution = new LeetCode068();
    List<String> result = solution.fullJustify(words, maxWidth);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals("This    is    an", result.get(0));
    Assert.assertEquals("example  of text", result.get(1));
    Assert.assertEquals("justification.  ", result.get(2));
  }

  @Test
  public void testProblemCase2() {
    String[] words = {"What","must","be","acknowledgment","shall","be"};
    int maxWidth = 16;
    LeetCode068 solution = new LeetCode068();
    List<String> result = solution.fullJustify(words, maxWidth);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals("What   must   be", result.get(0));
    Assert.assertEquals("acknowledgment  ", result.get(1));
    Assert.assertEquals("shall be        ", result.get(2));
  }

  @Test
  public void testProblemCase3() {
    String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
    int maxWidth = 20;
    LeetCode068 solution = new LeetCode068();
    List<String> result = solution.fullJustify(words, maxWidth);
    Assert.assertEquals(6, result.size());
    Assert.assertEquals("Science  is  what we", result.get(0));
    Assert.assertEquals("understand      well", result.get(1));
    Assert.assertEquals("enough to explain to", result.get(2));
    Assert.assertEquals("a  computer.  Art is", result.get(3));
    Assert.assertEquals("everything  else  we", result.get(4));
    Assert.assertEquals("do                  ", result.get(5));
  }
  
  @Test
  public void testProblemCase4() {
    String[] words = {"What","must"};
    int maxWidth = 9;
    LeetCode068 solution = new LeetCode068();
    List<String> result = solution.fullJustify(words, maxWidth);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("What must", result.get(0));
  }
}
