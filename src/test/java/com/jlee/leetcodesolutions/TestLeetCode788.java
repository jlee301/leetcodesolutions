package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode788;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode788 {
  @Test
  public void testN1() {
    int N = 1;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(0, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN2() {
    int N = 2;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(1, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN3() {
    int N = 3;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(1, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN4() {
    int N = 4;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(1, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN5() {
    int N = 5;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(2, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN6() {
    int N = 6;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(3, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN7() {
    int N = 7;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(3, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN8() {
    int N = 8;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(3, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN9() {
    int N = 9;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(4, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN10() {
    int N = 10;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(4, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN100() {
    int N = 100;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(40, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN1000() {
    int N = 1000;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(316, solution.rotatedDigits(N));
  }
  
  @Test
  public void testN10000() {
    int N = 10000;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(2320, solution.rotatedDigits(N));
  }

  @Test
  public void testN0() {
    int N = 0;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(0, solution.rotatedDigits(N));
  }

  @Test
  public void testNNeg() {
    int N = -1;
    LeetCode788 solution = new LeetCode788();
    Assert.assertEquals(0, solution.rotatedDigits(N));
  }
}
