package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode412;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode412 {
  @Test
  public void testProblemCase1() {
    int n = 1;
    LeetCode412 solution = new LeetCode412();
    List<String> result = solution.fizzBuzz(n);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("1", result.get(0));
  }

  @Test
  public void testProblemCase2() {
    int n = 2;
    LeetCode412 solution = new LeetCode412();
    List<String> result = solution.fizzBuzz(n);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals("1", result.get(0));
    Assert.assertEquals("2", result.get(1));
  }

  @Test
  public void testProblemCase3() {
    int n = 3;
    LeetCode412 solution = new LeetCode412();
    List<String> result = solution.fizzBuzz(n);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals("1", result.get(0));
    Assert.assertEquals("2", result.get(1));
    Assert.assertEquals("Fizz", result.get(2));
  }

  @Test
  public void testProblemCase4() {
    int n = 4;
    LeetCode412 solution = new LeetCode412();
    List<String> result = solution.fizzBuzz(n);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals("1", result.get(0));
    Assert.assertEquals("2", result.get(1));
    Assert.assertEquals("Fizz", result.get(2));
    Assert.assertEquals("4", result.get(3));
  }

  @Test
  public void testProblemCase5() {
    int n = 5;
    LeetCode412 solution = new LeetCode412();
    List<String> result = solution.fizzBuzz(n);
    Assert.assertEquals(5, result.size());
    Assert.assertEquals("1", result.get(0));
    Assert.assertEquals("2", result.get(1));
    Assert.assertEquals("Fizz", result.get(2));
    Assert.assertEquals("4", result.get(3));
    Assert.assertEquals("Buzz", result.get(4));
  }

  @Test
  public void testProblemCase6() {
    int n = 15;
    LeetCode412 solution = new LeetCode412();
    List<String> result = solution.fizzBuzz(n);
    Assert.assertEquals(15, result.size());
    Assert.assertEquals("1", result.get(0));
    Assert.assertEquals("2", result.get(1));
    Assert.assertEquals("Fizz", result.get(2));
    Assert.assertEquals("4", result.get(3));
    Assert.assertEquals("Buzz", result.get(4));
    Assert.assertEquals("Fizz", result.get(5));
    Assert.assertEquals("7", result.get(6));
    Assert.assertEquals("8", result.get(7));
    Assert.assertEquals("Fizz", result.get(8));
    Assert.assertEquals("Buzz", result.get(9));
    Assert.assertEquals("11", result.get(10));
    Assert.assertEquals("Fizz", result.get(11));
    Assert.assertEquals("13", result.get(12));
    Assert.assertEquals("14", result.get(13));
    Assert.assertEquals("FizzBuzz", result.get(14));
  }
}
