package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode290;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode290 {
  @Test
  public void testProblemCase1() {
    String pattern = "abba";
    String str = "dog cat cat dog";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertTrue(solution.wordPattern(pattern, str));
  }

  @Test
  public void testProblemCase2() {
    String pattern = "abba";
    String str = "dog cat cat fish";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertFalse(solution.wordPattern(pattern, str));
  }

  @Test
  public void testProblemCase3() {
    String pattern = "aaaa";
    String str = "dog cat cat dog";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertFalse(solution.wordPattern(pattern, str));
  }

  @Test
  public void testProblemCase4() {
    String pattern = "abba";
    String str = "dog dog dog dog";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertFalse(solution.wordPattern(pattern, str));
  }

  @Test
  public void testAllSame() {
    String pattern = "aaaa";
    String str = "dog dog dog dog";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertTrue(solution.wordPattern(pattern, str));
  }

  @Test
  public void testNoPattern() {
    String pattern = "abcd";
    String str = "dog cat fish mouse";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertTrue(solution.wordPattern(pattern, str));
  }

  @Test
  public void testOnePattern() {
    String pattern = "d";
    String str = "mouse";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertTrue(solution.wordPattern(pattern, str));
  }
  
  @Test
  public void testMorePatternThanWords() {
    String pattern = "aaaaa";
    String str = "dog dog dog dog";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertFalse(solution.wordPattern(pattern, str));
  }

  @Test
  public void testMoreWordsThanPattern() {
    String pattern = "aaaa";
    String str = "dog dog dog dog dog";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertFalse(solution.wordPattern(pattern, str));
  }

  @Test
  public void testEmpty() {
    String pattern = "";
    String str = "";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertFalse(solution.wordPattern(pattern, str));
  }

  @Test
  public void testNull() {
    String pattern = null;
    String str = null;
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertFalse(solution.wordPattern(pattern, str));
  }
}
