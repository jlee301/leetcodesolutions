package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode071;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode071 {
  @Test
  public void testProblemCase1() {
    String path = "/home/";
    LeetCode071 solution = new LeetCode071();
    Assert.assertEquals("/home", solution.simplifyPath(path));
  }

  @Test
  public void testProblemCase2() {
    String path = "/a/./b/../../c/";
    LeetCode071 solution = new LeetCode071();
    Assert.assertEquals("/c", solution.simplifyPath(path));
  }

  @Test
  public void testProblemCase3() {
    String path = "/../";
    LeetCode071 solution = new LeetCode071();
    Assert.assertEquals("/", solution.simplifyPath(path));
  }

  @Test
  public void testProblemCase4() {
    String path = "/home//foo/";
    LeetCode071 solution = new LeetCode071();
    Assert.assertEquals("/home/foo", solution.simplifyPath(path));
  }

  @Test
  public void testJustSlash() {
    String path = "/";
    LeetCode071 solution = new LeetCode071();
    Assert.assertEquals("/", solution.simplifyPath(path));
  }

  @Test
  public void testJustSlashes() {
    String path = "////";
    LeetCode071 solution = new LeetCode071();
    Assert.assertEquals("/", solution.simplifyPath(path));
  }

  @Test
  public void testTooManyBackPeddles1() {
    String path = "/../../../../c/";
    LeetCode071 solution = new LeetCode071();
    Assert.assertEquals("/c", solution.simplifyPath(path));
  }

  @Test
  public void testTooManyBackPeddles2() {
    String path = "/c/../../../../";
    LeetCode071 solution = new LeetCode071();
    Assert.assertEquals("/", solution.simplifyPath(path));
  }

  @Test
  public void testEmpty() {
    String path = "";
    LeetCode071 solution = new LeetCode071();
    Assert.assertEquals("", solution.simplifyPath(path));
  }

  @Test
  public void testNull() {
    String path = null;
    LeetCode071 solution = new LeetCode071();
    Assert.assertEquals("", solution.simplifyPath(path));
  }
}
