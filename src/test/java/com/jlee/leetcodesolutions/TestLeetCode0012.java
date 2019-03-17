package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0012;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0012 {
  @Test
  public void test0() {
    int num = 0;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("", solution.intToRoman(num));
  }

  @Test
  public void test1() {
    int num = 1;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("I", solution.intToRoman(num));
  }

  @Test
  public void test2() {
    int num = 2;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("II", solution.intToRoman(num));
  }

  @Test
  public void test3() {
    int num = 3;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("III", solution.intToRoman(num));
  }

  @Test
  public void test4() {
    int num = 4;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("IV", solution.intToRoman(num));
  }

  @Test
  public void test5() {
    int num = 5;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("V", solution.intToRoman(num));
  }

  @Test
  public void test6() {
    int num = 6;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("VI", solution.intToRoman(num));
  }

  @Test
  public void test7() {
    int num = 7;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("VII", solution.intToRoman(num));
  }

  @Test
  public void test8() {
    int num = 8;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("VIII", solution.intToRoman(num));
  }

  @Test
  public void test9() {
    int num = 9;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("IX", solution.intToRoman(num));
  }

  @Test
  public void test10() {
    int num = 10;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("X", solution.intToRoman(num));
  }
  
  @Test
  public void test3999() {
    int num = 3999;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("MMMCMXCIX", solution.intToRoman(num));
  }

  @Test
  public void test4000() {
    int num = 4000;
    LeetCode0012 solution = new LeetCode0012();
    Assert.assertEquals("", solution.intToRoman(num));
  }
}
