package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0468;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0468 {
  @Test
  public void testProblemCase1() {
    String IP = "172.16.254.1";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("IPv4", solution.validIPAddress(IP));
  }

  @Test
  public void testProblemCase2() {
    String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("IPv6", solution.validIPAddress(IP));
  }

  @Test
  public void testProblemCase3() {
    String IP = "256.256.256.256";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv4ThreeSubs() {
    String IP = "255.255.255";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv4SubGreaterThan3() {
    String IP = "255.255.2555.255";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv4EmptySub() {
    String IP = "255.255..255";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv4LeadingZeroSub() {
    String IP = "255.255.055.255";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv4ZeroSub() {
    String IP = "255.255.0.255";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("IPv4", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv4Greater255() {
    String IP = "255.255.256.255";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv4LessThan0() {
    String IP = "255.255.-1.255";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv4Characters() {
    String IP = "255.255.abc.255";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv4ExtraDotEnd() {
    String IP = "255.255.255.255.";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv4ExtraDotBegin() {
    String IP = ".255.255.255.255";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv6MoreSubs() {
    String IP = "2001";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }
  
  @Test
  public void testIPv6EmptySub() {
    String IP = "2001:0db8:85a3:0::8A2E:0370:7334";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv6GreaterThan16Bit() {
    String IP = "2001:0db8:85a3:0:00000:8A2E:0370:7334";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv6NotHex() {
    String IP = "2001:0db8:85a3:0:GGGG:8A2E:0370:7334";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv6ExtraColonEnd() {
    String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334:";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testIPv6ExtraColonBegin() {
    String IP = ":2001:0db8:85a3:0:0:8A2E:0370:7334";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testEmpty() {
    String IP = "";
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }

  @Test
  public void testNull() {
    String IP = null;
    LeetCode0468 solution = new LeetCode0468();
    Assert.assertEquals("Neither", solution.validIPAddress(IP));
  }
}
