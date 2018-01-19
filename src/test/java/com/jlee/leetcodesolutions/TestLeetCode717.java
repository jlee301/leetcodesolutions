package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode717;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode717 {
  @Test
  public void testOneBit() {
    int[] bits = {0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testTwoBitCombo1() {
    int[] bits = {0,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testTwoBitCombo2() {
    int[] bits = {1,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertFalse(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testThreeBitCombo1() {
    int[] bits = {0,0,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testThreeBitCombo2() {
    int[] bits = {0,1,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertFalse(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testThreeBitCombo3() {
    int[] bits = {1,0,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testThreeBitCombo4() {
    int[] bits = {1,1,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }
  
  @Test
  public void testFourBitCombo1() {
    int[] bits = {0,0,0,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testFourBitCombo2() {
    int[] bits = {0,0,1,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertFalse(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testFourBitCombo3() {
    int[] bits = {0,1,0,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testFourBitCombo4() {
    int[] bits = {0,1,1,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testFourBitCombo5() {
    int[] bits = {1,0,0,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testFourBitCombo6() {
    int[] bits = {1,0,0,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testFourBitCombo7() {
    int[] bits = {1,0,1,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertFalse(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testFourBitCombo8() {
    int[] bits = {1,1,0,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertTrue(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testFourBitCombo9() {
    int[] bits = {1,1,1,0};
    LeetCode717 solution = new LeetCode717();
    Assert.assertFalse(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testEmpty() {
    int[] bits = {};
    LeetCode717 solution = new LeetCode717();
    Assert.assertFalse(solution.isOneBitCharacter(bits));
  }

  @Test
  public void testNull() {
    int[] bits = null;
    LeetCode717 solution = new LeetCode717();
    Assert.assertFalse(solution.isOneBitCharacter(bits));
  }  
}
