package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Trie;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0208 {
  @Test
  public void testInsert() {
    Trie solution = new Trie();
    solution.insert("hello");
    solution.insert("helloworld");
    Assert.assertFalse(solution.search("h"));
    Assert.assertFalse(solution.search("he"));
    Assert.assertFalse(solution.search("hel"));
    Assert.assertFalse(solution.search("hell"));
    Assert.assertTrue(solution.search("hello"));
    Assert.assertFalse(solution.search("hellow"));
    Assert.assertFalse(solution.search("hellowo"));
    Assert.assertFalse(solution.search("hellowor"));
    Assert.assertFalse(solution.search("helloworl"));
    Assert.assertTrue(solution.search("helloworld"));
    Assert.assertFalse(solution.search("helloworlds"));
    Assert.assertTrue(solution.startsWith("h"));
    Assert.assertTrue(solution.startsWith("he"));
    Assert.assertTrue(solution.startsWith("hel"));
    Assert.assertTrue(solution.startsWith("hell"));
    Assert.assertTrue(solution.startsWith("hello"));
    Assert.assertTrue(solution.startsWith("hellow"));
    Assert.assertTrue(solution.startsWith("hellowo"));
    Assert.assertTrue(solution.startsWith("hellowor"));
    Assert.assertTrue(solution.startsWith("helloworl"));
    Assert.assertTrue(solution.startsWith("helloworld"));
    Assert.assertFalse(solution.startsWith("helloworlds"));
  }

  @Test
  public void testInvalid() {
    Trie solution = new Trie();
    solution.insert("");
    solution.insert(null);
    Assert.assertFalse(solution.search(""));
    Assert.assertFalse(solution.search(null));
    Assert.assertFalse(solution.startsWith(""));
    Assert.assertFalse(solution.startsWith(null));
  }
}
