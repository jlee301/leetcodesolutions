package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0811;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0811 {
  @Test
  public void testProblemCase1() {
    String[] cpdomains = { "9001 discuss.leetcode.com" };
    LeetCode0811 solution = new LeetCode0811();
    List<String> result = solution.subdomainVisits(cpdomains);
    Assert.assertEquals(3, result.size());
    Assert.assertTrue(result.contains("9001 discuss.leetcode.com"));
    Assert.assertTrue(result.contains("9001 leetcode.com"));
    Assert.assertTrue(result.contains("9001 com"));
  }

  @Test
  public void testProblemCase2() {
    String[] cpdomains = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
    LeetCode0811 solution = new LeetCode0811();
    List<String> result = solution.subdomainVisits(cpdomains);
    Assert.assertEquals(7, result.size());
    Assert.assertTrue(result.contains("901 mail.com"));
    Assert.assertTrue(result.contains("50 yahoo.com"));
    Assert.assertTrue(result.contains("900 google.mail.com"));
    Assert.assertTrue(result.contains("5 wiki.org"));
    Assert.assertTrue(result.contains("5 org"));
    Assert.assertTrue(result.contains("1 intel.mail.com"));
    Assert.assertTrue(result.contains("951 com"));
  }

  @Test
  public void testEmpty() {
    String[] cpdomains = {};
    LeetCode0811 solution = new LeetCode0811();
    List<String> result = solution.subdomainVisits(cpdomains);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    String[] cpdomains = null;
    LeetCode0811 solution = new LeetCode0811();
    List<String> result = solution.subdomainVisits(cpdomains);
    Assert.assertEquals(0, result.size());
  }
}
