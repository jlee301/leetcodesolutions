package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0434;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0434 {
  @Test
  public void testProblemCase1() {
    String s = "Hello, my name is John";
    LeetCode0434 solution = new LeetCode0434();
    Assert.assertEquals(5, solution.countSegments(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "Hello,mynameisJohn";
    LeetCode0434 solution = new LeetCode0434();
    Assert.assertEquals(1, solution.countSegments(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "  Hello, my name is John";
    LeetCode0434 solution = new LeetCode0434();
    Assert.assertEquals(5, solution.countSegments(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "  Hello, my name is John  ";
    LeetCode0434 solution = new LeetCode0434();
    Assert.assertEquals(5, solution.countSegments(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "  Hello,  my  name  is  John  ";
    LeetCode0434 solution = new LeetCode0434();
    Assert.assertEquals(5, solution.countSegments(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "A B C D E F G 1 2 3 4 5 ! @ # $ %";
    LeetCode0434 solution = new LeetCode0434();
    Assert.assertEquals(17, solution.countSegments(s));
  }

  @Test
  public void testProblemCase7() {
    String s = " ";
    LeetCode0434 solution = new LeetCode0434();
    Assert.assertEquals(0, solution.countSegments(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "   ";
    LeetCode0434 solution = new LeetCode0434();
    Assert.assertEquals(0, solution.countSegments(s));
  }

  @Test
  public void testProblemCase9() {
    String s = "";
    LeetCode0434 solution = new LeetCode0434();
    Assert.assertEquals(0, solution.countSegments(s));
  }
}
