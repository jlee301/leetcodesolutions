package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode476;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode476 {
  @Test
  public void test0() {
    int num = 0;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(1, solution.findComplement(num));
  }

  @Test
  public void test1() {
    int num = 1;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(0, solution.findComplement(num));
  }

  @Test
  public void test2() {
    int num = 2;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(1, solution.findComplement(num));
  }

  @Test
  public void test3() {
    int num = 3;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(0, solution.findComplement(num));
  }

  @Test
  public void test4() {
    int num = 4;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(3, solution.findComplement(num));
  }

  @Test
  public void test5() {
    int num = 5;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(2, solution.findComplement(num));
  }
  
  @Test
  public void test6() {
    int num = 6;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(1, solution.findComplement(num));
  }

  @Test
  public void test7() {
    int num = 7;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(0, solution.findComplement(num));
  }

  @Test
  public void test8() {
    int num = 8;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(7, solution.findComplement(num));
  }

  @Test
  public void test9() {
    int num = 9;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(6, solution.findComplement(num));
  }

  @Test
  public void test10() {
    int num = 10;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(5, solution.findComplement(num));
  }

  @Test
  public void test11() {
    int num = 11;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(4, solution.findComplement(num));
  }

  @Test
  public void test12() {
    int num = 12;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(3, solution.findComplement(num));
  }

  @Test
  public void test13() {
    int num = 13;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(2, solution.findComplement(num));
  }

  @Test
  public void test14() {
    int num = 14;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(1, solution.findComplement(num));
  }

  @Test
  public void test15() {
    int num = 15;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(0, solution.findComplement(num));
  }

  @Test
  public void testNeg() {
    int num = -1;
    LeetCode476 solution = new LeetCode476();
    Assert.assertEquals(0, solution.findComplement(num));
  }
}
