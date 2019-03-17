package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0842;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0842 {
  @Test
  public void testProblemCase1() {
    // Input: "123456579"
    // Output: [123,456,579]
    String S = "123456579";
    LeetCode0842 solution = new LeetCode0842();
    List<Integer> result = solution.splitIntoFibonacci(S);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(123, (int) result.get(0));
    Assert.assertEquals(456, (int) result.get(1));
    Assert.assertEquals(579, (int) result.get(2));
  }

  @Test
  public void testProblemCase2() {
    // Input: "11235813"
    // Output: [1,1,2,3,5,8,13]
    String S = "11235813";
    LeetCode0842 solution = new LeetCode0842();
    List<Integer> result = solution.splitIntoFibonacci(S);
    Assert.assertEquals(7, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(1, (int) result.get(1));
    Assert.assertEquals(2, (int) result.get(2));
    Assert.assertEquals(3, (int) result.get(3));
    Assert.assertEquals(5, (int) result.get(4));
    Assert.assertEquals(8, (int) result.get(5));
    Assert.assertEquals(13, (int) result.get(6));
  }

  @Test
  public void testProblemCase3() {
    // Input: "112358130"
    // Output: []
    String S = "112358130";
    LeetCode0842 solution = new LeetCode0842();
    List<Integer> result = solution.splitIntoFibonacci(S);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase4() {
    // Input: "0123"
    // Output: []
    String S = "0123";
    LeetCode0842 solution = new LeetCode0842();
    List<Integer> result = solution.splitIntoFibonacci(S);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testProblemCase5() {
    // Input: "1101111"
    // Output: [11, 0, 11, 11]
    String S = "1101111";
    LeetCode0842 solution = new LeetCode0842();
    List<Integer> result = solution.splitIntoFibonacci(S);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals(11, (int) result.get(0));
    Assert.assertEquals(0, (int) result.get(1));
    Assert.assertEquals(11, (int) result.get(2));
    Assert.assertEquals(11, (int) result.get(3));
  }

  @Test
  public void testSecondLeadingZero() {
    String S = "100";
    LeetCode0842 solution = new LeetCode0842();
    List<Integer> result = solution.splitIntoFibonacci(S);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testMaxIntegerLimitsOnFirst() {
    String S = "30000000003000000000";
    LeetCode0842 solution = new LeetCode0842();
    List<Integer> result = solution.splitIntoFibonacci(S);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testMaxIntegerLimitsOnSecond() {
    String S = "13000000000";
    LeetCode0842 solution = new LeetCode0842();
    List<Integer> result = solution.splitIntoFibonacci(S);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testMaxIntegerLimitsOnFibSequence() {
    String S = "214748364622147483648";
    LeetCode0842 solution = new LeetCode0842();
    List<Integer> result = solution.splitIntoFibonacci(S);
    Assert.assertEquals(0, result.size());
  }
}
