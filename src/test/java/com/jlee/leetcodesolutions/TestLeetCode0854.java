package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0854;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0854 {
  @Test
  public void testProblemCase1() {
    // Input: A = "ab", B = "ba"
    // Output: 1
    String A = "ab", B = "ba";
    LeetCode0854 solution = new LeetCode0854();
    Assert.assertEquals(1, solution.kSimilarity(A, B));
  }

  @Test
  public void testProblemCase2() {
    // Input: A = "abc", B = "bca"
    // Output: 2
    String A = "abc", B = "bca";
    LeetCode0854 solution = new LeetCode0854();
    Assert.assertEquals(2, solution.kSimilarity(A, B));
  }

  @Test
  public void testProblemCase3() {
    // Input: A = "abac", B = "baca"
    // Output: 2
    String A = "abac", B = "baca";
    LeetCode0854 solution = new LeetCode0854();
    Assert.assertEquals(2, solution.kSimilarity(A, B));
  }

  @Test
  public void testProblemCase4() {
    // Input: A = "aabc", B = "abca"
    // Output: 2
    String A = "aabc", B = "abca";
    LeetCode0854 solution = new LeetCode0854();
    Assert.assertEquals(2, solution.kSimilarity(A, B));
  }

  @Test
  public void testProblemCase5() {
    // Input: A = "abccaacceecdeea", B = "bcaacceeccdeaae"
    // Output: 9
    String A = "abccaacceecdeea", B = "bcaacceeccdeaae";
    LeetCode0854 solution = new LeetCode0854();
    Assert.assertEquals(9, solution.kSimilarity(A, B));
  }

  @Test
  public void testProblemCase6() {
    // Input: A = "cdebcdeadedaaaebfbcf", B = "baaddacfedebefdabecc"
    // Output: 12
    String A = "cdebcdeadedaaaebfbcf", B = "baaddacfedebefdabecc";
    LeetCode0854 solution = new LeetCode0854();
    Assert.assertEquals(12, solution.kSimilarity(A, B));
  }

  @Test
  public void testTwoStringsNotAnagrams() {
    // Input: A = "abc", B = "def"
    // Output: 12
    String A = "abc", B = "def";
    LeetCode0854 solution = new LeetCode0854();
    Assert.assertEquals(-1, solution.kSimilarity(A, B));
  }

  @Test
  public void testSecondStringLonger() {
    // Input: A = "abc", B = "abcd"
    // Output: 
    String A = "abc", B = "abcd";
    LeetCode0854 solution = new LeetCode0854();
    Assert.assertEquals(-1, solution.kSimilarity(A, B));
  }
}
