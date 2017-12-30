package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode475;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode475 {
  @Test
  public void testProblemCase1() {
    int[] houses = {1,2,3};
    int[] heaters = {2};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(1, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testProblemCase2() {
    int[] houses = {1,2,3,4};
    int[] heaters = {1,4};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(1, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testBunchOfHousesHeaters() {
    int[] houses = {1,2,3,4,5,6,7,8};
    int[] heaters = {2,5,9};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(2, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testOneHeater() {
    int[] houses = {1,2,3,4};
    int[] heaters = {1};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(3, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testOneHouse() {
    int[] houses = {1};
    int[] heaters = {1};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(0, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testHeaterAtHouseNotOnList() {
    int[] houses = {1,2,3,4};
    int[] heaters = {8};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(7, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testDontCareAboutEveryHouseInBetween() {
    int[] houses = {2,3,5};
    int[] heaters = {1,8};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(3, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testOneHeaterFarAway() {
    int[] houses = {2,3};
    int[] heaters = {1,8};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(2, solutions.findRadius(houses, heaters));
  }
  
  @Test
  public void testUnorganizedHouseHeaterList() {
    int[] houses = {2,5,3};
    int[] heaters = {8,1};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(3, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testEmptyHouses() {
    int[] houses = {};
    int[] heaters = {1,8};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(0, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testEmptyHeaters() {
    int[] houses = {2,3,5};
    int[] heaters = {};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(0, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testEmpty() {
    int[] houses = {};
    int[] heaters = {};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(0, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testNullHouses() {
    int[] houses = null;
    int[] heaters = {1,8};
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(0, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testNullHeaters() {
    int[] houses = {2,3,5};
    int[] heaters = null;
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(0, solutions.findRadius(houses, heaters));
  }

  @Test
  public void testNull() {
    int[] houses = null;
    int[] heaters = null;
    LeetCode475 solutions = new LeetCode475();
    Assert.assertEquals(0, solutions.findRadius(houses, heaters));
  }
}
