package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode030;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode030 {
  @Test
  public void testProblemCase1() {
    String s = "barfoothefoobarman";
    String[] words = {"foo","bar"};
    LeetCode030 solution = new LeetCode030();
    List<Integer> result = solution.findSubstring(s, words);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(0, (int) result.get(0));
    Assert.assertEquals(9, (int) result.get(1));
  }

  @Test
  public void testProblemCase2() {
    String s = "wordgoodstudentgoodword";
    String[] words = {"word","student"};
    LeetCode030 solution = new LeetCode030();
    List<Integer> result = solution.findSubstring(s, words);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase3() {
    String s = "foobarbar";
    String[] words = {"foo","bar"};
    LeetCode030 solution = new LeetCode030();
    List<Integer> result = solution.findSubstring(s, words);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(0, (int) result.get(0));
  }

  @Test
  public void testProblemCase4() {
    String s = "";
    String[] words = {"bar"};
    LeetCode030 solution = new LeetCode030();
    List<Integer> result = solution.findSubstring(s, words);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase5() {
    String s = null;
    String[] words = {"bar"};
    LeetCode030 solution = new LeetCode030();
    List<Integer> result = solution.findSubstring(s, words);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase6() {
    String s = "bar";
    String[] words = {};
    LeetCode030 solution = new LeetCode030();
    List<Integer> result = solution.findSubstring(s, words);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase7() {
    String s = "bar";
    String[] words = null;
    LeetCode030 solution = new LeetCode030();
    List<Integer> result = solution.findSubstring(s, words);
    Assert.assertEquals(0, result.size());
  }
}
