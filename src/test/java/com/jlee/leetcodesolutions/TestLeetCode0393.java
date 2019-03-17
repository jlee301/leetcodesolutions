package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0393;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0393 {
  @Test
  public void testProblemCase1() {
    int[] data = {197, 130, 1};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertTrue(solution.validUtf8(data));
  }

  @Test
  public void testProblemCase2() {
    int[] data = {235, 140, 4};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }

  @Test
  public void testJustOneByteInRange() {
    int[] data = {1};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertTrue(solution.validUtf8(data));
  }

  @Test
  public void testJustOneByteNotInRange() {
    int[] data = {250};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }

  @Test
  public void testJustOneByteNotInRangeNeg() {
    int[] data = {-1};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }

  @Test
  public void testFourByteNotEndingWith1Byte() {
    int[] data = {240,191,191,191};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertTrue(solution.validUtf8(data));
  }

  @Test
  public void testFourByteButNextByteOverRange() {
    int[] data = {240,192};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }

  @Test
  public void testFourByteButNextByteUnderRange() {
    int[] data = {240,127};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }

  @Test
  public void testFourByteButNotEnoughByteCounts() {
    int[] data = {240,191};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }

  @Test
  public void testFourByteButTooManyOctetsRemain() {
    int[] data = {240,191,191,191,191,191,191};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }

  @Test
  public void testFourByteBut1ByteOver() {
    int[] data = {240,191,191,191,128};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }

  @Test
  public void testFourByteBut1ByteUnder() {
    int[] data = {240,191,191,191,-1};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }

  @Test
  public void testWrongAns() {
    int[] data = {228,189,160,229,165,189,13,10};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertTrue(solution.validUtf8(data));
  }

  @Test
  public void testEmpty() {
    int[] data = {};
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }

  @Test
  public void testNull() {
    int[] data = null;
    LeetCode0393 solution = new LeetCode0393();
    Assert.assertFalse(solution.validUtf8(data));
  }
}
