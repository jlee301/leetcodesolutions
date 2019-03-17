package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0649;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0649 {
  @Test
  public void testProblemCase1() {
    String senate = "RD";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testProblemCase2() {
    String senate = "RDD";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Dire", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators1() {
    String senate = "DDRRR";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Dire", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators2() {
    String senate = "DRDRR";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Dire", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators3() {
    String senate = "DRRDR";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators4() {
    String senate = "DRRRD";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators5() {
    String senate = "RRRDD";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators6() {
    String senate = "RRDRD";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators7() {
    String senate = "RDRRD";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators8() {
    String senate = "RDDRR";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators9() {
    String senate = "RRDDR";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators10() {
    String senate = "RDRDR";
    LeetCode0649 solution = new LeetCode0649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }
}
