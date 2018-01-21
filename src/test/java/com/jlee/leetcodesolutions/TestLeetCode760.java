package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode760;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode760 {
  @Test
  public void testProblemCase() {
    int[] A = {12, 28, 46, 32, 50};
    int[] B = {50, 12, 32, 46, 28};
    LeetCode760 solution = new LeetCode760();
    int[] result = solution.anagramMappings(A, B);
    Assert.assertEquals(5, result.length);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(4, result[1]);
    Assert.assertEquals(3, result[2]);
    Assert.assertEquals(2, result[3]);
    Assert.assertEquals(0, result[4]);
  }

  @Test
  public void testDuplicates() {
    int[] A = {12, 28, 46, 32, 50, 46, 46};
    int[] B = {50, 46, 46, 12, 32, 46, 28};
    LeetCode760 solution = new LeetCode760();
    int[] result = solution.anagramMappings(A, B);
    Assert.assertEquals(7, result.length);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(6, result[1]);
    Assert.assertEquals(1, result[2]);
    Assert.assertEquals(4, result[3]);
    Assert.assertEquals(0, result[4]);
    Assert.assertEquals(1, result[5]);
    Assert.assertEquals(1, result[6]);
  }

  @Test
  public void testAEmpty() {
    int[] A = {};
    int[] B = {50, 12, 32, 46, 28};
    LeetCode760 solution = new LeetCode760();
    int[] result = solution.anagramMappings(A, B);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testBEmpty() {
    int[] A = {12, 28, 46, 32, 50};
    int[] B = {};
    LeetCode760 solution = new LeetCode760();
    int[] result = solution.anagramMappings(A, B);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testEmpty() {
    int[] A = {};
    int[] B = {};
    LeetCode760 solution = new LeetCode760();
    int[] result = solution.anagramMappings(A, B);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testANull() {
    int[] A = null;
    int[] B = {50, 12, 32, 46, 28};
    LeetCode760 solution = new LeetCode760();
    int[] result = solution.anagramMappings(A, B);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testBNull() {
    int[] A = {12, 28, 46, 32, 50};
    int[] B = null;
    LeetCode760 solution = new LeetCode760();
    int[] result = solution.anagramMappings(A, B);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testNull() {
    int[] A = null;
    int[] B = null;
    LeetCode760 solution = new LeetCode760();
    int[] result = solution.anagramMappings(A, B);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testAGreaterThanB() {
    int[] A = {1,2};
    int[] B = {1};
    LeetCode760 solution = new LeetCode760();
    int[] result = solution.anagramMappings(A, B);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testBGreaterThanA() {
    int[] A = {1};
    int[] B = {1,2};
    LeetCode760 solution = new LeetCode760();
    int[] result = solution.anagramMappings(A, B);
    Assert.assertEquals(0, result.length);
  }
}
