package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode405;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode405 {
  @Test
  public void testProblemCase1() {
    LeetCode405 solution = new LeetCode405();
    Assert.assertEquals("0", solution.toHex(0));
    Assert.assertEquals("1", solution.toHex(1));
    Assert.assertEquals("2", solution.toHex(2));
    Assert.assertEquals("3", solution.toHex(3));
    Assert.assertEquals("4", solution.toHex(4));
    Assert.assertEquals("5", solution.toHex(5));
    Assert.assertEquals("6", solution.toHex(6));
    Assert.assertEquals("7", solution.toHex(7));
    Assert.assertEquals("8", solution.toHex(8));
    Assert.assertEquals("9", solution.toHex(9));
    Assert.assertEquals("a", solution.toHex(10));
    Assert.assertEquals("b", solution.toHex(11));
    Assert.assertEquals("c", solution.toHex(12));
    Assert.assertEquals("d", solution.toHex(13));
    Assert.assertEquals("e", solution.toHex(14));
    Assert.assertEquals("f", solution.toHex(15));
    Assert.assertEquals("10", solution.toHex(16));
    Assert.assertEquals("11", solution.toHex(17));
    Assert.assertEquals("12", solution.toHex(18));
    Assert.assertEquals("13", solution.toHex(19));
    Assert.assertEquals("14", solution.toHex(20));
  }
  
  @Test
  public void testProblemCase2() {
    LeetCode405 solution = new LeetCode405();
    Assert.assertEquals("ffffffff", solution.toHex(-1));
    Assert.assertEquals("fffffffe", solution.toHex(-2));
    Assert.assertEquals("fffffffd", solution.toHex(-3));
    Assert.assertEquals("fffffffc", solution.toHex(-4));
    Assert.assertEquals("fffffffb", solution.toHex(-5));
    Assert.assertEquals("fffffffa", solution.toHex(-6));
    Assert.assertEquals("fffffff9", solution.toHex(-7));
    Assert.assertEquals("fffffff8", solution.toHex(-8));
    Assert.assertEquals("fffffff7", solution.toHex(-9));
    Assert.assertEquals("fffffff6", solution.toHex(-10));
    Assert.assertEquals("fffffff5", solution.toHex(-11));
    Assert.assertEquals("fffffff4", solution.toHex(-12));
    Assert.assertEquals("fffffff3", solution.toHex(-13));
    Assert.assertEquals("fffffff2", solution.toHex(-14));
    Assert.assertEquals("fffffff1", solution.toHex(-15));
    Assert.assertEquals("fffffff0", solution.toHex(-16));
    Assert.assertEquals("ffffffef", solution.toHex(-17));
    Assert.assertEquals("ffffffee", solution.toHex(-18));
    Assert.assertEquals("ffffffed", solution.toHex(-19));
    Assert.assertEquals("ffffffec", solution.toHex(-20));
  }
}
