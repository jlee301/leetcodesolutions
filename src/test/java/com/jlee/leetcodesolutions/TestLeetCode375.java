package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode375;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode375 {
  @Test
  public void testN1() {
    int n = 1;
    LeetCode375 solution = new LeetCode375();
    Assert.assertEquals(0, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN2() {
    int n = 2;
    LeetCode375 solution = new LeetCode375();
    Assert.assertEquals(1, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN3() {
    int n = 3;
    LeetCode375 solution = new LeetCode375();
    Assert.assertEquals(2, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN4() {
    int n = 4;
    LeetCode375 solution = new LeetCode375();
    Assert.assertEquals(4, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN5() {
    int n = 5;
    LeetCode375 solution = new LeetCode375();
    Assert.assertEquals(6, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN6() {
    int n = 6;
    LeetCode375 solution = new LeetCode375();
    Assert.assertEquals(8, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN7() {
    int n = 7;
    LeetCode375 solution = new LeetCode375();
    Assert.assertEquals(10, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN8() {
    int n = 8;
    LeetCode375 solution = new LeetCode375();
    Assert.assertEquals(12, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN9() {
    int n = 9;
    LeetCode375 solution = new LeetCode375();
    Assert.assertEquals(14, solution.getMoneyAmount(n));
  }
  
  @Test
  public void testN10() {
    int n = 10;
    LeetCode375 solution = new LeetCode375();
    Assert.assertEquals(16, solution.getMoneyAmount(n));
  }
}
