package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0535;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0535 {
  @Test
  public void testUrlEncodeDecode() {
    String longUrl = "https://leetcode.com/problems/design-tinyurl";
    LeetCode0535 solution = new LeetCode0535();
    String shortUrl = solution.encode(longUrl);
    Assert.assertEquals(longUrl, solution.decode(shortUrl));
    Assert.assertEquals(longUrl, solution.decode(shortUrl));
    Assert.assertEquals(longUrl, solution.decode(shortUrl));
    shortUrl = solution.encode(longUrl);
    Assert.assertEquals(longUrl, solution.decode(shortUrl));
    Assert.assertEquals(longUrl, solution.decode(shortUrl));
    Assert.assertEquals(longUrl, solution.decode(shortUrl));
  }
}
