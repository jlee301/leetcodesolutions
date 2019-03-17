package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0438;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0438 {
  @Test
  public void testProblemCase1() {
    String s = "abab"; 
    String p = "ab";
    LeetCode0438 solution = new LeetCode0438();
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
    LeetCode0438 solution = new LeetCode0438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(0, (int)result.get(0));
    Assert.assertEquals(6, (int)result.get(1));
  }
  
  @Test
  public void testProblemCase3() {
    String s = "babc"; 
    String p = "abc";
    LeetCode0438 solution = new LeetCode0438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, (int)result.get(0));
  }
  
  @Test
  public void testProblemCase4() {
    String s = "cbaababacd"; 
    String p = "abca";
    LeetCode0438 solution = new LeetCode0438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(0, (int)result.get(0));
    Assert.assertEquals(5, (int)result.get(1));
  }
  
  @Test
  public void testProblemCase5() {
    String s = "cbaacb"; 
    String p = "abca";
    LeetCode0438 solution = new LeetCode0438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(0, (int)result.get(0));
    Assert.assertEquals(1, (int)result.get(1));
    Assert.assertEquals(2, (int)result.get(2));
  }
  
  @Test
  public void testProblemCase6() {
    String s = "efghijk"; 
    String p = "abc";
    LeetCode0438 solution = new LeetCode0438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(0, result.size());
  }
  
  @Test
  public void testProblemCase7() {
    String s = ""; 
    String p = "abc";
    LeetCode0438 solution = new LeetCode0438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase8() {
    String s = ""; 
    String p = "";
    LeetCode0438 solution = new LeetCode0438();
    List<Integer> result = solution.findAnagrams(s, p);
    Assert.assertEquals(0, result.size());
  }
}
