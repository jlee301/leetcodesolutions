package com.jlee.leetcodesolutions;

import java.util.Random;
import java.util.TreeMap;

public class LeetCode528 {
  /*
   * Given an array w of positive integers, where w[i] describes the weight of
   * index i, write a function pickIndex which randomly picks an index in
   * proportion to its weight.
   * 
   * Note:
   * 1. 1 <= w.length <= 10000
   * 2. 1 <= w[i] <= 10^5
   * 3. pickIndex will be called at most 10000 times.
   * 
   * https://leetcode.com/problems/random-pick-with-weight/description/
   */
  private TreeMap<Integer,Integer> map;
  private int sum;
  private Random rand;
  
  public LeetCode528(int[] w) {
    // w = {2,3,5,4}
    //         0,1 --> 2 --> map.get(0)
    //       2,3,4 --> 3 --> map.get(2)
    //   5,6,7,8,9 --> 5 --> map.get(5)
    // 10,11,12,13 --> 4 --> map.get(10)
    // sum = 14
    map = new TreeMap<>();
    sum = 0;
    for(int i = 0; i < w.length; i++) {
      map.put(sum, i);
      sum += w[i];
    }
    rand = new Random();
  }
  
  public int pickIndex() {
    // Choose random number from [0 (inclusive) : sum (exclusive)]
    int index = rand.nextInt(sum);
    return map.get(map.floorKey(index));
  }
}
