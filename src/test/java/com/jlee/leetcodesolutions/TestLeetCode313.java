package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode313;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode313 {
  @Test
  public void testProblemCaseN1() {
    int[] primes = {2,7,13,19};
    int n = 1;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(1, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN2() {
    int[] primes = {2,7,13,19};
    int n = 2;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(2, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN3() {
    int[] primes = {2,7,13,19};
    int n = 3;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(4, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN4() {
    int[] primes = {2,7,13,19};
    int n = 4;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(7, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN5() {
    int[] primes = {2,7,13,19};
    int n = 5;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(8, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN6() {
    int[] primes = {2,7,13,19};
    int n = 6;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(13, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN7() {
    int[] primes = {2,7,13,19};
    int n = 7;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(14, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN8() {
    int[] primes = {2,7,13,19};
    int n = 8;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(16, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN9() {
    int[] primes = {2,7,13,19};
    int n = 9;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(19, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN10() {
    int[] primes = {2,7,13,19};
    int n = 10;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(26, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN11() {
    int[] primes = {2,7,13,19};
    int n = 11;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(28, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN12() {
    int[] primes = {2,7,13,19};
    int n = 12;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(32, solution.nthSuperUglyNumber(n, primes));
  }

  @Test
  public void testProblemCaseN0() {
    int[] primes = {2,7,13,19};
    int n = 0;
    LeetCode313 solution = new LeetCode313();
    Assert.assertEquals(0, solution.nthSuperUglyNumber(n, primes));
  }
}
