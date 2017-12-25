package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode434;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode434 {
  @Test
  public void testProblemCase() {
    String s = "Hello, my name is John";
    LeetCode434 solution = new LeetCode434();
    Assert.assertEquals(5, solution.countSegments(s));
  }

  @Test
  public void testOneLongSegment() {
    String s = "Hello,mynameisJohn";
    LeetCode434 solution = new LeetCode434();
    Assert.assertEquals(1, solution.countSegments(s));
  }

  @Test
  public void testBeginsWithSpaces() {
    String s = "  Hello, my name is John";
    LeetCode434 solution = new LeetCode434();
    Assert.assertEquals(5, solution.countSegments(s));
  }

  @Test
  public void testBeginsAndEndsWithSpaces() {
    String s = "  Hello, my name is John  ";
    LeetCode434 solution = new LeetCode434();
    Assert.assertEquals(5, solution.countSegments(s));
  }

  @Test
  public void testDoubleSpaceBetweenSegments() {
    String s = "  Hello,  my  name  is  John  ";
    LeetCode434 solution = new LeetCode434();
    Assert.assertEquals(5, solution.countSegments(s));
  }

  @Test
  public void testSingleCharSpace() {
    String s = "A B C D E F G 1 2 3 4 5 ! @ # $ %";
    LeetCode434 solution = new LeetCode434();
    Assert.assertEquals(17, solution.countSegments(s));
  }

  @Test
  public void testSingleSpace() {
    String s = " ";
    LeetCode434 solution = new LeetCode434();
    Assert.assertEquals(0, solution.countSegments(s));
  }

  @Test
  public void testAllSpaces() {
    String s = "   ";
    LeetCode434 solution = new LeetCode434();
    Assert.assertEquals(0, solution.countSegments(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode434 solution = new LeetCode434();
    Assert.assertEquals(0, solution.countSegments(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode434 solution = new LeetCode434();
    Assert.assertEquals(0, solution.countSegments(s));
  }
}
