package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode504;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode504 {
  @Test
  public void testProblemCase1() {
    int num = 100;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("202", solution.convertToBase7(num));    
  }
  
  @Test
  public void testProblemCase2() {
    int num = 0;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("0", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase3() {
    int num = 1;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("1", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase4() {
    int num = 2;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("2", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase5() {
    int num = 3;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("3", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase6() {
    int num = 4;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("4", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase7() {
    int num = 5;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("5", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase8() {
    int num = 6;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("6", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase9() {
    int num = 7;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("10", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase10() {
    int num = 8;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("11", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase11() {
    int num = 9;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("12", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase12() {
    int num = 10;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("13", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase13() {
    int num = -1;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-1", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase14() {
    int num = -2;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-2", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase15() {
    int num = -3;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-3", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase16() {
    int num = -4;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-4", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase17() {
    int num = -5;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-5", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase18() {
    int num = -6;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-6", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase19() {
    int num = -7;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-10", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase20() {
    int num = -8;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-11", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase21() {
    int num = -9;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-12", solution.convertToBase7(num));
  }
  
  @Test
  public void testProblemCase22() {
    int num = -10;
    LeetCode504 solution = new LeetCode504();
    Assert.assertEquals("-13", solution.convertToBase7(num));
  }
}
