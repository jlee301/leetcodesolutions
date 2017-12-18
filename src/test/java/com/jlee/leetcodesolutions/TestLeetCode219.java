package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode219;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode219 {
  @Test
  public void testBegDuplicatesInRange() {
    int[] nums = {1,1,2,3};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testMidDuplicatesInRange() {
    int[] nums = {1,2,2,3};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testEndDuplicatesInRange() {
    int[] nums = {1,2,3,3};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testDuplicatesNotInRange() {
    int[] nums = {1,2,3,1};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testDuplicatesNotInRange2() {
    int[] nums = {1,2,3,1};
    int k = 2;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testDuplicatesInRange() {
    int[] nums = {1,2,3,1};
    int k = 3;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testDuplicatesOverRange() {
    int[] nums = {1,2,3,1};
    int k = 10;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testSkipsFirstDupeSecondDupeInRange() {
    int[] nums = {1, 2, 3, 1, 4, 1};
    int k = 2;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicate(nums, k));
  }
  
  @Test
  public void testDuplicatesZeroRange() {
    int[] nums = {1,2,3,1};
    int k = 0;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testDuplicatesNegRange() {
    int[] nums = {1, 2, 3, 1};
    int k = -1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testNoDuplicates() {
    int[] nums = {1, 2, 3, 4};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testOneEntry() {
    int[] nums = {1};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testEmptyEntry() {
    int[] nums = {};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testNullEntry() {
    int[] nums = null;
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicate(nums, k));
  }

  @Test
  public void testBegDuplicatesInRangeHash() {
    int[] nums = {1,1,2,3};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testMidDuplicatesInRangeHash() {
    int[] nums = {1,2,2,3};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testEndDuplicatesInRangeHash() {
    int[] nums = {1,2,3,3};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testDuplicatesNotInRangeHash() {
    int[] nums = {1,2,3,1};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testDuplicatesNotInRange2Hash() {
    int[] nums = {1,2,3,1};
    int k = 2;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testDuplicatesInRangeHash() {
    int[] nums = {1,2,3,1};
    int k = 3;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testDuplicatesOverRangeHash() {
    int[] nums = {1,2,3,1};
    int k = 10;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testSkipsFirstDupeSecondDupeInRangeHash() {
    int[] nums = {1, 2, 3, 1, 4, 1};
    int k = 2;
    LeetCode219 solution = new LeetCode219();
    Assert.assertTrue(solution.containsNearbyDuplicateHash(nums, k));
  }
  
  @Test
  public void testDuplicatesZeroRangeHash() {
    int[] nums = {1,2,3,1};
    int k = 0;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testDuplicatesNegRangeHash() {
    int[] nums = {1, 2, 3, 1};
    int k = -1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testNoDuplicatesHash() {
    int[] nums = {1, 2, 3, 4};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testOneEntryHash() {
    int[] nums = {1};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testEmptyEntryHash() {
    int[] nums = {};
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicateHash(nums, k));
  }

  @Test
  public void testNullEntryHash() {
    int[] nums = null;
    int k = 1;
    LeetCode219 solution = new LeetCode219();
    Assert.assertFalse(solution.containsNearbyDuplicateHash(nums, k));
  }
}
