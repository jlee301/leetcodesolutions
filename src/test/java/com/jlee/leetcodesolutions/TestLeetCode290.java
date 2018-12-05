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
  public void testProblemCase5() {
    String pattern = "aaaa";
    String str = "dog dog dog dog";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertTrue(solution.wordPattern(pattern, str));
  }

  @Test
  public void testProblemCase6() {
    String pattern = "abcd";
    String str = "dog cat fish mouse";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertTrue(solution.wordPattern(pattern, str));
  }

  @Test
  public void testProblemCase7() {
    String pattern = "d";
    String str = "mouse";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertTrue(solution.wordPattern(pattern, str));
  }
  
  @Test
  public void testProblemCase8() {
    String pattern = "aaaaa";
    String str = "dog dog dog dog";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertFalse(solution.wordPattern(pattern, str));
  }

  @Test
  public void testProblemCase9() {
    String pattern = "aaaa";
    String str = "dog dog dog dog dog";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertFalse(solution.wordPattern(pattern, str));
  }

  @Test
  public void testProblemCase10() {
    String pattern = "";
    String str = "";
    
    LeetCode290 solution = new LeetCode290();
    Assert.assertFalse(solution.wordPattern(pattern, str));
  }
}
