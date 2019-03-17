package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0212;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0212 {
  @Test
  public void testProblemCase1() {
    String[] words = {"oath","pea","eat","rain"};
    char[][] board = { {'o','a','a','n'},
                       {'e','t','a','e'},
                       {'i','h','k','r'},
                       {'i','f','l','v'} };
    
    LeetCode0212 solution = new LeetCode0212();
    List<String> result = solution.findWords(board, words);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("eat"));
    Assert.assertTrue(result.contains("oath"));
  }

  @Test
  public void testProblemCase2() {
    String[] words = {"aaa","b","c","aa"};
    char[][] board = { {'a','a','a','a'} };
    
    LeetCode0212 solution = new LeetCode0212();
    List<String> result = solution.findWords(board, words);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains("aaa"));
    Assert.assertTrue(result.contains("aa"));
  }
}
