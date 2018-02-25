package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode165;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode165 {
  @Test
  public void testBasicV2() {
    String version1 = "1";
    String version2 = "2";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(-1, solution.compareVersion(version1, version2));
  }

  @Test
  public void testBasicV1() {
    String version1 = "2";
    String version2 = "1";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(1, solution.compareVersion(version1, version2));
  }

  @Test
  public void testBasicSame() {
    String version1 = "1";
    String version2 = "1";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(0, solution.compareVersion(version1, version2));
  }

  @Test
  public void testTwoSeqV2() {
    String version1 = "1.1";
    String version2 = "1.2";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(-1, solution.compareVersion(version1, version2));
  }

  @Test
  public void testTwoSeqV1() {
    String version1 = "1.2";
    String version2 = "1.1";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(1, solution.compareVersion(version1, version2));
  }

  @Test
  public void testTwoSeqSame() {
    String version1 = "1.0";
    String version2 = "1.0";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(0, solution.compareVersion(version1, version2));
  }
  
  @Test
  public void testV2MoreSeq() {
    String version1 = "1.0";
    String version2 = "1.0.0";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(0, solution.compareVersion(version1, version2));
  }

  @Test
  public void testV1MoreSeq() {
    String version1 = "1.0.0";
    String version2 = "1.0";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(0, solution.compareVersion(version1, version2));
  }

  @Test
  public void testEndsWithPeriodV2() {
    String version1 = "1.0.";
    String version2 = "1.1.";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(-1, solution.compareVersion(version1, version2));
  }

  @Test
  public void testEndsWithPeriodV1() {
    String version1 = "1.1.";
    String version2 = "1.0.";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(1, solution.compareVersion(version1, version2));
  }

  @Test
  public void testEndsWithPeriodSame() {
    String version1 = "1.0.";
    String version2 = "1.0.";
    LeetCode165 solution = new LeetCode165();
    Assert.assertEquals(0, solution.compareVersion(version1, version2));
  }  
}
