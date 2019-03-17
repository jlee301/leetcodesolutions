package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0071;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0071 {
  @Test
  public void testProblemCase1() {
    String path = "/home/";
    LeetCode0071 solution = new LeetCode0071();
    Assert.assertEquals("/home", solution.simplifyPath(path));
  }

  @Test
  public void testProblemCase2() {
    String path = "/a/./b/../../c/";
    LeetCode0071 solution = new LeetCode0071();
    Assert.assertEquals("/c", solution.simplifyPath(path));
  }

  @Test
  public void testProblemCase3() {
    String path = "/../";
    LeetCode0071 solution = new LeetCode0071();
    Assert.assertEquals("/", solution.simplifyPath(path));
  }

  @Test
  public void testProblemCase4() {
    String path = "/home//foo/";
    LeetCode0071 solution = new LeetCode0071();
    Assert.assertEquals("/home/foo", solution.simplifyPath(path));
  }

  @Test
  public void testJustSlash() {
    String path = "/";
    LeetCode0071 solution = new LeetCode0071();
    Assert.assertEquals("/", solution.simplifyPath(path));
  }

  @Test
  public void testJustSlashes() {
    String path = "////";
    LeetCode0071 solution = new LeetCode0071();
    Assert.assertEquals("/", solution.simplifyPath(path));
  }

  @Test
  public void testTooManyBackPeddles1() {
    String path = "/../../../../c/";
    LeetCode0071 solution = new LeetCode0071();
    Assert.assertEquals("/c", solution.simplifyPath(path));
  }

  @Test
  public void testTooManyBackPeddles2() {
    String path = "/c/../../../../";
    LeetCode0071 solution = new LeetCode0071();
    Assert.assertEquals("/", solution.simplifyPath(path));
  }

  @Test
  public void testEmpty() {
    String path = "";
    LeetCode0071 solution = new LeetCode0071();
    Assert.assertEquals("", solution.simplifyPath(path));
  }

  @Test
  public void testNull() {
    String path = null;
    LeetCode0071 solution = new LeetCode0071();
    Assert.assertEquals("", solution.simplifyPath(path));
  }
}
