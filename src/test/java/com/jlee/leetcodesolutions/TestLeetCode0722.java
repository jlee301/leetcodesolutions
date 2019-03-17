package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0722;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0722 {
  @Test
  public void testProblemCase1() {
    String[] source = {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}" };
    LeetCode0722 solution = new LeetCode0722();
    List<String> result = solution.removeComments(source);
    String[] data = new String[result.size()];
    data = result.toArray(data);
    Assert.assertArrayEquals(new String[] {"int main()","{ ","  ","int a, b, c;","a = b + c;","}"}, data);
  }

  @Test
  public void testProblemCase2() {
    String[] source = {"a/*comment", "line", "more_comment*/b" };
    LeetCode0722 solution = new LeetCode0722();
    List<String> result = solution.removeComments(source);
    String[] data = new String[result.size()];
    data = result.toArray(data);
    Assert.assertArrayEquals(new String[] {"ab"}, data);
  }

  @Test
  public void testSlashUsage() {
    String[] source = {"a/comment" };
    LeetCode0722 solution = new LeetCode0722();
    List<String> result = solution.removeComments(source);
    String[] data = new String[result.size()];
    data = result.toArray(data);
    Assert.assertArrayEquals(new String[] {"a/comment"}, data);
  }

  @Test
  public void testSneakyBlock() {
    String[] source = {"a/* *comment*/" };
    LeetCode0722 solution = new LeetCode0722();
    List<String> result = solution.removeComments(source);
    String[] data = new String[result.size()];
    data = result.toArray(data);
    Assert.assertArrayEquals(new String[] {"a"}, data);
  }
}
