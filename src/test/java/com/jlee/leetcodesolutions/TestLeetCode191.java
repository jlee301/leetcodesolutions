package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode191;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode191 {
  @Test
  public void testProblemCase() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0010 1001 0100 0001 1110 1001 1100 (43261596)
    int result = solution.hammingWeight(43261596);
    Assert.assertEquals(12, result);
  }

  @Test
  public void test0() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 0000 (0)
    int result = solution.hammingWeight(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void test1() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 0001 (1)
    int result = solution.hammingWeight(1);
    Assert.assertEquals(1, result);
  }

  @Test
  public void test2() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 0010 (2)
    int result = solution.hammingWeight(2);
    Assert.assertEquals(1, result);
  }

  @Test
  public void test3() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 0011 (3)
    int result = solution.hammingWeight(3);
    Assert.assertEquals(2, result);
  }

  @Test
  public void test5() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 0101 (5)
    int result = solution.hammingWeight(5);
    Assert.assertEquals(2, result);
  }

  @Test
  public void test6() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 0110 (6)
    int result = solution.hammingWeight(6);
    Assert.assertEquals(2, result);
  }

  @Test
  public void test7() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 0111 (7)
    int result = solution.hammingWeight(7);
    Assert.assertEquals(3, result);
  }

  @Test
  public void test8() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 1000 (8)
    int result = solution.hammingWeight(8);
    Assert.assertEquals(1, result);
  }

  @Test
  public void test9() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 1001 (9)
    int result = solution.hammingWeight(9);
    Assert.assertEquals(2, result);
  }

  @Test
  public void test10() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 1010 (10)
    int result = solution.hammingWeight(10);
    Assert.assertEquals(2, result);
  }

  @Test
  public void test11() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 1011 (11)
    int result = solution.hammingWeight(11);
    Assert.assertEquals(3, result);
  }

  @Test
  public void test12() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 1100 (12)
    int result = solution.hammingWeight(12);
    Assert.assertEquals(2, result);
  }

  @Test
  public void test13() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 1101 (13)
    int result = solution.hammingWeight(13);
    Assert.assertEquals(3, result);
  }

  @Test
  public void test14() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 1110 (14)
    int result = solution.hammingWeight(14);
    Assert.assertEquals(3, result);
  }

  @Test
  public void test15() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0000 1111 (15)
    int result = solution.hammingWeight(15);
    Assert.assertEquals(4, result);
  }

  @Test
  public void test16() {
    LeetCode191 solution = new LeetCode191();
    // 0000 0000 0000 0000 0000 0000 0001 0000 (16)
    int result = solution.hammingWeight(16);
    Assert.assertEquals(1, result);
  }
}
