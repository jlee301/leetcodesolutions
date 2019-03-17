package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0691;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0691 {
  @Test
  public void testProblemCase1() {
    String[] stickers = {"with", "example", "science"};
    String target = "thehat";
    LeetCode0691 solution = new LeetCode0691();
    Assert.assertEquals(3, solution.minStickers(stickers, target));
  }

  @Test
  public void testProblemCase2() {
    String[] stickers = {"notice", "possible"};
    String target = "basicbasic";
    LeetCode0691 solution = new LeetCode0691();
    Assert.assertEquals(-1, solution.minStickers(stickers, target));
  }

  @Test
  public void testProblemCase3() {
    String[] stickers = { "heart", "seven", "consider", "just", "less", "back", "an", "four", "cost", "kill", "skin",
        "happen", "depend", "broad", "caught", "fast", "fig", "way", "under", "print", "white", "war", "sent", "locate",
        "be", "noise", "door", "get", "burn", "quite", "eight", "press", "eye", "wave", "bread", "wont", "short", "cow",
        "plain", "who", "well", "drive", "fact", "chief", "store", "night", "operate", "page", "south", "once" };
    String target = "simpleexample";
    LeetCode0691 solution = new LeetCode0691();
    Assert.assertEquals(-1, solution.minStickers(stickers, target));
  }
}
