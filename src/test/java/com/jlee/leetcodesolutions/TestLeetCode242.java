package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode242;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode242 {
  @Test
  public void testProblemCase1() {
    String s = "anagram";
    String t = "nagaram";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertTrue(solution.isAnagram(s, t));
  }

  @Test
  public void testProblemCase2() {
    String s = "rat";
    String t = "car";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagram(s, t));
  }

  @Test
  public void testMixSize() {
    String s = "rat";
    String t = "ratt";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagram(s, t));
  }

  @Test
  public void testEmpty() {
    String s = "";
    String t = "";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertTrue(solution.isAnagram(s, t));
  }

  @Test
  public void testSNull() {
    String s = null;
    String t = "rat";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagram(s, t));
  }

  @Test
  public void testTNull() {
    String s = "rat";
    String t = null;
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagram(s, t));
  }

  @Test
  public void testNull() {
    String s = null;
    String t = null;
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagram(s, t));
  }

  @Test
  public void testProblemCase1UsingHash() {
    String s = "anagram";
    String t = "nagaram";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertTrue(solution.isAnagramUsingHash(s, t));
  }

  @Test
  public void testProblemCase2UsingHash() {
    String s = "rat";
    String t = "car";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagramUsingHash(s, t));
  }

  @Test
  public void testMixSizeUsingHash() {
    String s = "rat";
    String t = "ratt";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagramUsingHash(s, t));
  }

  @Test
  public void testEmptyUsingHash() {
    String s = "";
    String t = "";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertTrue(solution.isAnagramUsingHash(s, t));
  }

  @Test
  public void testSNullUsingHash() {
    String s = null;
    String t = "rat";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagramUsingHash(s, t));
  }

  @Test
  public void testTNullUsingHash() {
    String s = "rat";
    String t = null;
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagramUsingHash(s, t));
  }
  
  @Test
  public void testNullUsingHash() {
    String s = null;
    String t = null;
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagramUsingHash(s, t));
  }


  @Test
  public void testProblemCase1Original() {
    String s = "anagram";
    String t = "nagaram";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertTrue(solution.isAnagramOriginal(s, t));
  }

  @Test
  public void testProblemCase2Original() {
    String s = "rat";
    String t = "car";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagramOriginal(s, t));
  }

  @Test
  public void testMixSizeOriginal() {
    String s = "rat";
    String t = "ratt";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagramOriginal(s, t));
  }

  @Test
  public void testEmptyOriginal() {
    String s = "";
    String t = "";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertTrue(solution.isAnagramOriginal(s, t));
  }

  @Test
  public void testSNullOriginal() {
    String s = null;
    String t = "rat";
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagramOriginal(s, t));
  }

  @Test
  public void testTNullOriginal() {
    String s = "rat";
    String t = null;
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagramOriginal(s, t));
  }
  
  @Test
  public void testNullOriginal() {
    String s = null;
    String t = null;
    
    LeetCode242 solution = new LeetCode242();
    Assert.assertFalse(solution.isAnagramOriginal(s, t));
  }
}
