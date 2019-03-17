package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0097;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0097 {
  @Test
  public void testProblemCase1() {
    String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
    LeetCode0097 solution = new LeetCode0097();
    Assert.assertTrue(solution.isInterleave(s1, s2, s3));
  }

  @Test
  public void testProblemCase2() {
    String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
    LeetCode0097 solution = new LeetCode0097();
    Assert.assertFalse(solution.isInterleave(s1, s2, s3));
  }

  @Test
  public void testProblemCase3() {
    String s1 = "a", s2 = "b", s3 = "a";
    LeetCode0097 solution = new LeetCode0097();
    Assert.assertFalse(solution.isInterleave(s1, s2, s3));
  }

  @Test
  public void testProblemCase4() {
    String s1 = "bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa",
        s2 = "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab",
        s3 = "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab";
    LeetCode0097 solution = new LeetCode0097();
    Assert.assertFalse(solution.isInterleave(s1, s2, s3));
  }

  @Test
  public void testProblemCase5() {
    String s1 = "ab", s2 = "ab", s3 = "ababab";
    LeetCode0097 solution = new LeetCode0097();
    Assert.assertFalse(solution.isInterleave(s1, s2, s3));
  }
}
