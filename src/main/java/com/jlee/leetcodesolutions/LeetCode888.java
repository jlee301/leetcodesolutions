package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode888 {
  /*
   * https://leetcode.com/contest/weekly-contest-98/problems/fair-candy-swap/
   */
  public int[] fairCandySwap(int[] A, int[] B) {
    HashSet<Integer> setA = new HashSet<>();
    HashSet<Integer> setB = new HashSet<>();
    int sumA = 0;
    int sumB = 0;
    
    // Calculate the sum and add elements into set for A
    for(int num : A) {
      sumA += num;
      setA.add(num);
    }
    
    // Calculate the sum and add elements into set for B
    for(int num : B) {
      sumB += num;
      setB.add(num);
    }
    
    // The fair even split of both sum
    int fair = (sumA + sumB) / 2;
    
    // Scan all the candies from A
    // 1. Looking for candy that will get the sum of A under the calculated fair
    // 2. Then check to see if B has a candy with the difference
    for(int candyA : setA) {
      int diff = sumA - candyA;
      if(diff < fair && setB.contains(fair - diff))
        return new int[] {candyA, fair-diff};
    }
    return new int[] {0,0};
  }
}
