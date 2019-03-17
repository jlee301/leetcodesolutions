package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0848;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0848 {
  @Test
  public void testProblemCase1() {
    // Input: S = "abc", shifts = [3,5,9]
    // Output: "rpl"
    String S = "abc";
    int[] shifts = {3,5,9};
    LeetCode0848 solution = new LeetCode0848();
    Assert.assertEquals("rpl", solution.shiftingLetters(S, shifts));
  }

  @Test
  public void testProblemCase2() {
    // Input: S = "ruu", shifts = [26,9,17]
    // Output: "rul"
    String S = "ruu";
    int[] shifts = {26,9,17};
    LeetCode0848 solution = new LeetCode0848();
    Assert.assertEquals("rul", solution.shiftingLetters(S, shifts));
  }

  @Test
  public void testWrongAns() {
    // Input: S = "mkgfzkkuxownxvfvxasy"
    //        shifts = [505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513]
    // Output: "wqqwlcjnkphhsyvrkdod"
    String S = "mkgfzkkuxownxvfvxasy";
    int[] shifts = { 505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950, 81520022,
        684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912, 116899933, 983296461,
        536563513 };
    LeetCode0848 solution = new LeetCode0848();
    Assert.assertEquals("wqqwlcjnkphhsyvrkdod", solution.shiftingLetters(S, shifts));
  }
}
