package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode526;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode526 {
  @Test
  public void testN1() {
    int N = 1;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(1, solution.countArrangement(N));
  }
  
  @Test
  public void testN2() {
    int N = 2;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(2, solution.countArrangement(N));
  }
  
  @Test
  public void testN3() {
    int N = 3;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(3, solution.countArrangement(N));
  }
  
  @Test
  public void testN4() {
    int N = 4;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(8, solution.countArrangement(N));
  }
  
  @Test
  public void testN5() {
    int N = 5;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(10, solution.countArrangement(N));
  }
  
  @Test
  public void testN6() {
    int N = 6;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(36, solution.countArrangement(N));
  }
  
  @Test
  public void testN7() {
    int N = 7;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(41, solution.countArrangement(N));
  }
  
  @Test
  public void testN8() {
    int N = 8;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(132, solution.countArrangement(N));
  }
  
  @Test
  public void testN9() {
    int N = 9;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(250, solution.countArrangement(N));
  }
  
  @Test
  public void testN10() {
    int N = 10;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(700, solution.countArrangement(N));
  }
  
  @Test
  public void testN11() {
    int N = 11;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(750, solution.countArrangement(N));
  }
  
  @Test
  public void testN12() {
    int N = 12;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(4010, solution.countArrangement(N));
  }
  
  @Test
  public void testN13() {
    int N = 13;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(4237, solution.countArrangement(N));
  }
  
  @Test
  public void testN14() {
    int N = 14;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(10680, solution.countArrangement(N));
  }
  
  @Test
  public void testN15() {
    int N = 15;
    LeetCode526 solution = new LeetCode526();
    Assert.assertEquals(24679, solution.countArrangement(N));
  }
}
