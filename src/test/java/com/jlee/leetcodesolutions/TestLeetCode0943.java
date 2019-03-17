package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0943;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0943 {
  @Test
  public void testProblemCase1() {
    String[] A = {"alex","loves","leetcode"};
    LeetCode0943 solution = new LeetCode0943();
    Assert.assertEquals("alexlovesleetcode", solution.shortestSuperstring(A));
  }

  @Test
  public void testProblemCase2() {
    String[] A = {"catg","ctaagt","gcta","ttca","atgcatc"};
    LeetCode0943 solution = new LeetCode0943();
    Assert.assertEquals("gctaagttcatgcatc", solution.shortestSuperstring(A));
  }

  @Test
  public void testProblemCase3() {
    String[] A = { "cmqitnqwahfl", "ygeeoensdpuobhazkn", "fxlqkqwemwhpeoblldcv", "eoblldcvypdygeeoen",
        "dpuobhazknowcmq", "yfhctxzvfxlqkqwemwh", "emwhpeoblldcvypdygee", "dcvypdygeeoensdpuobh",
        "zvfxlqkqwemwhpeobl" };
    LeetCode0943 solution = new LeetCode0943();
    Assert.assertEquals("yfhctxzvfxlqkqwemwhpeoblldcvypdygeeoensdpuobhazknowcmqitnqwahfl", solution.shortestSuperstring(A));
  }

  @Test
  public void testProblemCase4() {
    String[] A = { "ppgortnmsy", "czmysoeeyugbiylso", "nbfzpppvhbjydtx", "rnzynedhoiunkpon", "ornzynedhoiunkpo",
        "ylsomoktkyfgljcf", "jtvkrornzynedhoiunk", "hvhhihwdffmxnczmyso", "ktkyfgljcfbkqcpp", "nzynedhoiunkponbfz",
        "nedhoiunkponbfzpppvh" };
    LeetCode0943 solution = new LeetCode0943();
    String result = solution.shortestSuperstring(A);
    for(String str : A)
      Assert.assertTrue(result.indexOf(str) >= 0);
    
    Assert.assertEquals("hvhhihwdffmxnczmysoeeyugbiylsomoktkyfgljcfbkqcppgortnmsyjtvkrornzynedhoiunkponbfzpppvhbjydtx", solution.shortestSuperstring(A));
  }

  @Test
  public void testProblemCase5() {
    String[] A = {"ift","efd","dnete","tef","fdn"};
    LeetCode0943 solution = new LeetCode0943();
    Assert.assertEquals("iftefdnete", solution.shortestSuperstring(A));
  }
}
