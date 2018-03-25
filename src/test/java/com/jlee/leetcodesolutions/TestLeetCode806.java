package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode806;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode806 {
  @Test
  public void testProblemCase1() {
    int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    String S = "abcdefghijklmnopqrstuvwxyz";
    LeetCode806 solution = new LeetCode806();
    Assert.assertArrayEquals(new int[] {3,60}, solution.numberOfLines(widths, S));
  }

  @Test
  public void testProblemCase2() {
    int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    String S = "bbbcccdddaaa";
    LeetCode806 solution = new LeetCode806();
    Assert.assertArrayEquals(new int[] {2,4}, solution.numberOfLines(widths, S));
  }

  @Test
  public void testEmptyWidths() {
    int[] widths = {};
    String S = "bbbcccdddaaa";
    LeetCode806 solution = new LeetCode806();
    Assert.assertArrayEquals(new int[] {0,0}, solution.numberOfLines(widths, S));
  }

  @Test
  public void testEmptyS() {
    int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    String S = "";
    LeetCode806 solution = new LeetCode806();
    Assert.assertArrayEquals(new int[] {0,0}, solution.numberOfLines(widths, S));
  }

  @Test
  public void testNullWidths() {
    int[] widths = null;
    String S = "bbbcccdddaaa";
    LeetCode806 solution = new LeetCode806();
    Assert.assertArrayEquals(new int[] {0,0}, solution.numberOfLines(widths, S));
  }

  @Test
  public void testNullS() {
    int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    String S = null;
    LeetCode806 solution = new LeetCode806();
    Assert.assertArrayEquals(new int[] {0,0}, solution.numberOfLines(widths, S));
  }
}
