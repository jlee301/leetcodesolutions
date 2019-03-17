package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0375;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0375 {
  @Test
  public void testN1() {
    int n = 1;
    LeetCode0375 solution = new LeetCode0375();
    Assert.assertEquals(0, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN2() {
    int n = 2;
    LeetCode0375 solution = new LeetCode0375();
    Assert.assertEquals(1, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN3() {
    int n = 3;
    LeetCode0375 solution = new LeetCode0375();
    Assert.assertEquals(2, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN4() {
    int n = 4;
    LeetCode0375 solution = new LeetCode0375();
    Assert.assertEquals(4, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN5() {
    int n = 5;
    LeetCode0375 solution = new LeetCode0375();
    Assert.assertEquals(6, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN6() {
    int n = 6;
    LeetCode0375 solution = new LeetCode0375();
    Assert.assertEquals(8, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN7() {
    int n = 7;
    LeetCode0375 solution = new LeetCode0375();
    Assert.assertEquals(10, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN8() {
    int n = 8;
    LeetCode0375 solution = new LeetCode0375();
    Assert.assertEquals(12, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN9() {
    int n = 9;
    LeetCode0375 solution = new LeetCode0375();
    Assert.assertEquals(14, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN10() {
    int n = 10;
    LeetCode0375 solution = new LeetCode0375();
    Assert.assertEquals(16, solution.getMoneyAmount(n));
  }
}
