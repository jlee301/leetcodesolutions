package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0093;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0093 {
  @Test
  public void testProblemCase() {
    String s = "25525511135";
    LeetCode0093 solution = new LeetCode0093();
    List<String> result = solution.restoreIpAddresses(s);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals("255.255.11.135", result.get(0));
    Assert.assertEquals("255.255.111.35", result.get(1));
  }

  @Test
  public void testLeadingZeroSkip() {
    String s = "2000";
    LeetCode0093 solution = new LeetCode0093();
    List<String> result = solution.restoreIpAddresses(s);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("2.0.0.0", result.get(0));
  }

  @Test
  public void testNotEnoughNumbersForValidIP() {
    String s = "200";
    LeetCode0093 solution = new LeetCode0093();
    List<String> result = solution.restoreIpAddresses(s);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode0093 solution = new LeetCode0093();
    List<String> result = solution.restoreIpAddresses(s);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode0093 solution = new LeetCode0093();
    List<String> result = solution.restoreIpAddresses(s);
    Assert.assertEquals(0, result.size());
  }
}
