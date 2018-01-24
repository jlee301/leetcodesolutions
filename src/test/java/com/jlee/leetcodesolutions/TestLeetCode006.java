package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode006;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode006 {
  @Test
  public void testProblemCaseR0() {
    String s = "PAYPALISHIRING";
    int numRows = 0;
    LeetCode006 solution = new LeetCode006();
    Assert.assertEquals("PAYPALISHIRING", solution.convert(s, numRows));
  }

  @Test
  public void testProblemCaseR1() {
    String s = "PAYPALISHIRING";
    int numRows = 1;
    LeetCode006 solution = new LeetCode006();
    Assert.assertEquals("PAYPALISHIRING", solution.convert(s, numRows));
  }

  @Test
  public void testProblemCaseR2() {
    String s = "PAYPALISHIRING";
    int numRows = 2;
    LeetCode006 solution = new LeetCode006();
    Assert.assertEquals("PYAIHRNAPLSIIG", solution.convert(s, numRows));
  }

  @Test
  public void testProblemCaseR3() {
    String s = "PAYPALISHIRING";
    int numRows = 3;
    LeetCode006 solution = new LeetCode006();
    Assert.assertEquals("PAHNAPLSIIGYIR", solution.convert(s, numRows));
  }

  @Test
  public void testProblemCaseR4() {
    String s = "PAYPALISHIRING";
    int numRows = 4;
    LeetCode006 solution = new LeetCode006();
    Assert.assertEquals("PINALSIGYAHRPI", solution.convert(s, numRows));
  }

  @Test
  public void testProblemCaseR5() {
    String s = "PAYPALISHIRING";
    int numRows = 5;
    LeetCode006 solution = new LeetCode006();
    Assert.assertEquals("PHASIYIRPLIGAN", solution.convert(s, numRows));
  }

  @Test
  public void testEmpty() {
    String s = "";
    int numRows = 1;
    LeetCode006 solution = new LeetCode006();
    Assert.assertEquals("", solution.convert(s, numRows));
  }

  @Test
  public void testNull() {
    String s = null;
    int numRows = 1;
    LeetCode006 solution = new LeetCode006();
    Assert.assertEquals("", solution.convert(s, numRows));
  }
}
