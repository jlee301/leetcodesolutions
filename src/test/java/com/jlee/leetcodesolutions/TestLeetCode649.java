package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode649;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode649 {
  @Test
  public void testProblemCase1() {
    String senate = "RD";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testProblemCase2() {
    String senate = "RDD";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Dire", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators1() {
    String senate = "DDRRR";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Dire", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators2() {
    String senate = "DRDRR";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Dire", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators3() {
    String senate = "DRRDR";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators4() {
    String senate = "DRRRD";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators5() {
    String senate = "RRRDD";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators6() {
    String senate = "RRDRD";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators7() {
    String senate = "RDRRD";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators8() {
    String senate = "RDDRR";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators9() {
    String senate = "RRDDR";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }

  @Test
  public void testFiveSenators10() {
    String senate = "RDRDR";
    LeetCode649 solution = new LeetCode649();
    Assert.assertEquals("Radiant", solution.predictPartyVictory(senate));
  }
}
