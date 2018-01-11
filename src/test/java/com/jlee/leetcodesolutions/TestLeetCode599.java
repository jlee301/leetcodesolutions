package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode599;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode599 {
  @Test
  public void testProblemCase1() {
    String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals("Shogun", result[0]);
  }

  @Test
  public void testProblemCase2() {
    String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    String[] list2 = {"KFC", "Shogun", "Burger King"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals("Shogun", result[0]);
  }

  @Test
  public void testMultiples() {
    String[] list1 = {"Shogun", "KFC", "Burger King"};
    String[] list2 = {"KFC", "Shogun", "Burger King"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(2, result.length);
    Assert.assertEquals("Shogun", result[0]);
    Assert.assertEquals("KFC", result[1]);
  }

  @Test
  public void testSameLists() {
    String[] list1 = {"KFC", "Shogun", "Burger King"};
    String[] list2 = {"KFC", "Shogun", "Burger King"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals("KFC", result[0]);
  }

  @Test
  public void testReverseLists() {
    String[] list1 = {"KFC", "Shogun", "Burger King"};
    String[] list2 = {"Burger King", "Shogun", "KFC"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(3, result.length);
    Assert.assertEquals("KFC", result[0]);
    Assert.assertEquals("Shogun", result[1]);
    Assert.assertEquals("Burger King", result[2]);
  }

  @Test
  public void testList1Empty() {
    String[] list1 = {};
    String[] list2 = {"Burger King", "Shogun", "KFC"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testList2Empty() {
    String[] list1 = {"Burger King", "Shogun", "KFC"};
    String[] list2 = {};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testEmpty() {
    String[] list1 = {};
    String[] list2 = {};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testList1Null() {
    String[] list1 = null;
    String[] list2 = {"Burger King", "Shogun", "KFC"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testList2Null() {
    String[] list1 = {"Burger King", "Shogun", "KFC"};
    String[] list2 = null;
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testNull() {
    String[] list1 = null;
    String[] list2 = null;
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(0, result.length);
  }
}
