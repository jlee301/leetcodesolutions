package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0591;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0591 {
  @Test
  public void testProblemCase1() {
    String code = "<DIV>This is the first line <![CDATA[<div>]]></DIV>";
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertTrue(solution.isValid(code));
  }

  @Test
  public void testProblemCase2() {
    String code = "<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>";
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertTrue(solution.isValid(code));
  }

  @Test
  public void testProblemCase3() {
    String code = "<A>  <B> </A>   </B>";
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertFalse(solution.isValid(code));
  }

  @Test
  public void testProblemCase4() {
    String code = "<DIV>  div tag is not closed  <DIV>";
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertFalse(solution.isValid(code));
  }

  @Test
  public void testProblemCase5() {
    String code = "<DIV>  unmatched <  </DIV>";
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertFalse(solution.isValid(code));
  }

  @Test
  public void testProblemCase6() {
    String code = "<DIV> closed tags with invalid tag name  <b>123</b> </DIV>";
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertFalse(solution.isValid(code));
  }

  @Test
  public void testProblemCase7() {
    String code = "<DIV> unmatched tags with invalid tag name  </1234567890> and <CDATA[[]]>  </DIV>";
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertFalse(solution.isValid(code));
  }

  @Test
  public void testProblemCase8() {
    String code = "<DIV>  unmatched start tag <B>  and unmatched end tag </C>  </DIV>";
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertFalse(solution.isValid(code));
  }

  @Test
  public void testProblemCase9() {
    String code = "Hello world";
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertFalse(solution.isValid(code));
  }

  @Test
  public void testProblemCase10() {
    String code = "<DIV><![CDATA[hello world</DIV>";
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertFalse(solution.isValid(code));
  }

  @Test
  public void testProblemCase11() {
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertFalse(solution.isValid("<DIV></"));
    Assert.assertFalse(solution.isValid("<DIV></>"));
    Assert.assertFalse(solution.isValid("<DIV></DIVDIVDIVDIV>"));
    Assert.assertFalse(solution.isValid("<DIV></div>"));
    Assert.assertFalse(solution.isValid("</DIV>"));
  }

  @Test
  public void testProblemCase12() {
    LeetCode0591 solution = new LeetCode0591();
    Assert.assertFalse(solution.isValid("<DIV"));
    Assert.assertFalse(solution.isValid("<>"));
    Assert.assertFalse(solution.isValid("<DIVDIVDIVDIV>"));
    Assert.assertFalse(solution.isValid("<DIV>"));
  }
}
