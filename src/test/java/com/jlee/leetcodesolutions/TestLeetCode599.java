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
  public void testProblemCase3() {
    String[] list1 = {"Shogun", "KFC", "Burger King"};
    String[] list2 = {"KFC", "Shogun", "Burger King"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(2, result.length);
    Assert.assertEquals("KFC", result[0]);
    Assert.assertEquals("Shogun", result[1]);
  }

  @Test
  public void testProblemCase4() {
    String[] list1 = {"KFC", "Shogun", "Burger King"};
    String[] list2 = {"KFC", "Shogun", "Burger King"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals("KFC", result[0]);
  }

  @Test
  public void testProblemCase5() {
    String[] list1 = {"KFC", "Shogun", "Burger King"};
    String[] list2 = {"Burger King", "Shogun", "KFC"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(3, result.length);
    Assert.assertEquals("Burger King", result[0]);
    Assert.assertEquals("Shogun", result[1]);
    Assert.assertEquals("KFC", result[2]);
  }

  @Test
  public void testProblemCase6() {
    String[] list1 = {};
    String[] list2 = {"Burger King", "Shogun", "KFC"};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testProblemCase7() {
    String[] list1 = {"Burger King", "Shogun", "KFC"};
    String[] list2 = {};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testProblemCase8() {
    String[] list1 = {};
    String[] list2 = {};
    LeetCode599 solution = new LeetCode599();
    String[] result = solution.findRestaurant(list1, list2);
    Assert.assertEquals(0, result.length);
  }
}
