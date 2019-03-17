package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0557;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0557 {
  @Test
  public void testProblemCase1() {
    String s = "Let's";
    LeetCode0557 solution = new LeetCode0557();
    Assert.assertEquals("s'teL", solution.reverseWords(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "Let's take";
    LeetCode0557 solution = new LeetCode0557();
    Assert.assertEquals("s'teL ekat", solution.reverseWords(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "Let's take LeetCode";
    LeetCode0557 solution = new LeetCode0557();
    Assert.assertEquals("s'teL ekat edoCteeL", solution.reverseWords(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "Let's take LeetCode contest";
    LeetCode0557 solution = new LeetCode0557();
    Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "";
    LeetCode0557 solution = new LeetCode0557();
    Assert.assertEquals("", solution.reverseWords(s));
  }
}
