package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode438;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode438 {
  @Test
  public void testProblemCase1() {
    String s = "abab"; 
    String p = "ab";
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(0, (int)result.get(0));
    Assert.assertEquals(1, (int)result.get(1));
    Assert.assertEquals(2, (int)result.get(2));
  }

  @Test
  public void testProblemCase2() {
    String s = "cbaebabacd"; 
    String p = "abc";
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(0, (int)result.get(0));
    Assert.assertEquals(6, (int)result.get(1));
  }
  
  @Test
  public void testDupeOverlay() {
    String s = "babc"; 
    String p = "abc";
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(0, (int)result.get(0));
    Assert.assertEquals(6, (int)result.get(1));
  }
  
  @Test
  public void testRepeatCharsInP() {
    String s = "cbaababacd"; 
    String p = "abca";
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(0, (int)result.get(0));
    Assert.assertEquals(5, (int)result.get(1));
  }
  
  @Test
  public void testMultipleSpanningAnagrams() {
    String s = "cbaacb"; 
    String p = "abca";
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(0, (int)result.get(0));
    Assert.assertEquals(1, (int)result.get(1));
    Assert.assertEquals(2, (int)result.get(2));
  }
  
  @Test
  public void testNoMatch() {
    String s = "efghijk"; 
    String p = "abc";
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(0, result.size());
  }
  
  @Test
  public void testSEmpty() {
    String s = ""; 
    String p = "abc";
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testPEmpty() {
    String s = "cbaebabacd"; 
    String p = "";
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testEmpty() {
    String s = ""; 
    String p = "";
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(0, result.size());
  }
  
  @Test
  public void testSNull() {
    String s = null; 
    String p = "abc";
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testPNull() {
    String s = "cbaebabacd"; 
    String p = null;
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    String s = null; 
    String p = null;
    LeetCode438 solution = new LeetCode438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(0, result.size());
  }
}
