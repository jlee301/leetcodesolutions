package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1108;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1108 {
  @Test
  public void testProblemCase1() {
    String address = "1.1.1.1";
    LeetCode1108 solution = new LeetCode1108();
    Assert.assertEquals("1[.]1[.]1[.]1", solution.defangIPaddr(address));
  }

  @Test
  public void testProblemCase2() {
    String address = "255.100.50.0";
    LeetCode1108 solution = new LeetCode1108();
    Assert.assertEquals("255[.]100[.]50[.]0", solution.defangIPaddr(address));
  }
}
