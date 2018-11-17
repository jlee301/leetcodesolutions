package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode044;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode044 {
  @Test
  public void testProblemCase1() {
    String s = "aa", p = "a";
    LeetCode044 solution = new LeetCode044();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase2() {
    String s = "aa", p = "*";
    LeetCode044 solution = new LeetCode044();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase3() {
    String s = "cb", p = "?a";
    LeetCode044 solution = new LeetCode044();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase4() {
    String s = "adceb", p = "*a*b";
    LeetCode044 solution = new LeetCode044();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase5() {
    String s = "acdcb", p = "a*c?b";
    LeetCode044 solution = new LeetCode044();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase6() {
    String s = "", p = "*";
    LeetCode044 solution = new LeetCode044();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase7() {
    String s = "mississippi", p = "m??*ss*?i*pi";
    LeetCode044 solution = new LeetCode044();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase8() {
    String s = "a", p = "a*";
    LeetCode044 solution = new LeetCode044();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase9() {
    String s = "a", p = "a**";
    LeetCode044 solution = new LeetCode044();
    Assert.assertTrue(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase10() {
    String s = "abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb";
    String p = "**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb";
    LeetCode044 solution = new LeetCode044();
    Assert.assertFalse(solution.isMatch(s, p));
  }

  @Test
  public void testProblemCase11() {
    String s = "a";
    String p = "aa";
    LeetCode044 solution = new LeetCode044();
    Assert.assertFalse(solution.isMatch(s, p));
  }
}
