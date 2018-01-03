package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode504;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode504 {
  @Test
  public void testProblemCase() {
    int num = 100;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("202", solution.convertToBase7(num));    
  }
  
  @Test
  public void test0() {
    int num = 0;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("0", solution.convertToBase7(num));
  }
  
  @Test
  public void test1() {
    int num = 1;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("1", solution.convertToBase7(num));
  }
  
  @Test
  public void test2() {
    int num = 2;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("2", solution.convertToBase7(num));
  }
  
  @Test
  public void test3() {
    int num = 3;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("3", solution.convertToBase7(num));
  }
  
  @Test
  public void test4() {
    int num = 4;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("4", solution.convertToBase7(num));
  }
  
  @Test
  public void test5() {
    int num = 5;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("5", solution.convertToBase7(num));
  }
  
  @Test
  public void test6() {
    int num = 6;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("6", solution.convertToBase7(num));
  }
  
  @Test
  public void test7() {
    int num = 7;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("10", solution.convertToBase7(num));
  }
  
  @Test
  public void test8() {
    int num = 8;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("11", solution.convertToBase7(num));
  }
  
  @Test
  public void test9() {
    int num = 9;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("12", solution.convertToBase7(num));
  }
  
  @Test
  public void test10() {
    int num = 10;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("13", solution.convertToBase7(num));
  }
  
  @Test
  public void testNeg1() {
    int num = -1;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-1", solution.convertToBase7(num));
  }
  
  @Test
  public void testNeg2() {
    int num = -2;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-2", solution.convertToBase7(num));
  }
  
  @Test
  public void testNeg3() {
    int num = -3;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-3", solution.convertToBase7(num));
  }
  
  @Test
  public void testNeg4() {
    int num = -4;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-4", solution.convertToBase7(num));
  }
  
  @Test
  public void testNeg5() {
    int num = -5;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-5", solution.convertToBase7(num));
  }
  
  @Test
  public void testNeg6() {
    int num = -6;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-6", solution.convertToBase7(num));
  }
  
  @Test
  public void testNeg7() {
    int num = -7;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-10", solution.convertToBase7(num));
  }
  
  @Test
  public void testNeg8() {
    int num = -8;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-11", solution.convertToBase7(num));
  }
  
  @Test
  public void testNeg9() {
    int num = -9;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-12", solution.convertToBase7(num));
  }
  
  @Test
  public void testNeg10() {
    int num = -10;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-13", solution.convertToBase7(num));
  }
}
