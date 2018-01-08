package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode557;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode557 {
  @Test
  public void testOneWord() {
    String s = "Let's";
    LeetCode557 solution = new LeetCode557();
    Assert.assertEquals("s'teL", solution.reverseWords(s));
  }

  @Test
  public void testTwoWord() {
    String s = "Let's take";
    LeetCode557 solution = new LeetCode557();
    Assert.assertEquals("s'teL ekat", solution.reverseWords(s));
  }

  @Test
  public void testThreeWord() {
    String s = "Let's take LeetCode";
    LeetCode557 solution = new LeetCode557();
    Assert.assertEquals("s'teL ekat edoCteeL", solution.reverseWords(s));
  }

  @Test
  public void testFourWord() {
    String s = " Let's take LeetCode contest ";
    LeetCode557 solution = new LeetCode557();
    Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode557 solution = new LeetCode557();
    Assert.assertEquals("", solution.reverseWords(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode557 solution = new LeetCode557();
    Assert.assertEquals("", solution.reverseWords(s));
  }
}
