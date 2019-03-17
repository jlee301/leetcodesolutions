package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0806;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0806 {
  @Test
  public void testProblemCase1() {
    int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    String S = "abcdefghijklmnopqrstuvwxyz";
    LeetCode0806 solution = new LeetCode0806();
    Assert.assertArrayEquals(new int[] {3,60}, solution.numberOfLines(widths, S));
  }

  @Test
  public void testProblemCase2() {
    int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    String S = "bbbcccdddaaa";
    LeetCode0806 solution = new LeetCode0806();
    Assert.assertArrayEquals(new int[] {2,4}, solution.numberOfLines(widths, S));
  }

  @Test
  public void testEmptyWidths() {
    int[] widths = {};
    String S = "bbbcccdddaaa";
    LeetCode0806 solution = new LeetCode0806();
    Assert.assertArrayEquals(new int[] {0,0}, solution.numberOfLines(widths, S));
  }

  @Test
  public void testEmptyS() {
    int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    String S = "";
    LeetCode0806 solution = new LeetCode0806();
    Assert.assertArrayEquals(new int[] {0,0}, solution.numberOfLines(widths, S));
  }

  @Test
  public void testNullWidths() {
    int[] widths = null;
    String S = "bbbcccdddaaa";
    LeetCode0806 solution = new LeetCode0806();
    Assert.assertArrayEquals(new int[] {0,0}, solution.numberOfLines(widths, S));
  }

  @Test
  public void testNullS() {
    int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    String S = null;
    LeetCode0806 solution = new LeetCode0806();
    Assert.assertArrayEquals(new int[] {0,0}, solution.numberOfLines(widths, S));
  }
}
