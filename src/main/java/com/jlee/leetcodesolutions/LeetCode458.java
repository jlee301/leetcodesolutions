package com.jlee.leetcodesolutions;

public class LeetCode458 {
  /*
   * There are 1000 buckets, one and only one of them contains poison, the rest
   * are filled with water. They all look the same. If a pig drinks that poison it
   * will die within 15 minutes. What is the minimum amount of pigs you need to
   * figure out which bucket contains the poison within one hour.
   * 
   * Answer this question, and write an algorithm for the follow-up general case.
   * 
   * Follow-up:
   * If there are n buckets and a pig drinking poison will die within m minutes,
   * how many pigs (x) you need to figure out the "poison" bucket within p
   * minutes? There is exact one bucket with poison.
   * 
   * https://leetcode.com/problems/poor-pigs/
   */
  public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
    // There are minutesToTest / minutesToDie tests we can run
    // However, we can cover minutesToTest / minutesToDie + 1
    // 60 mins / 15 mins = 4 testing intervals --> meaning we can cover 5 buckets
    //
    // ie 1 pig
    //    [b1, b2, b3, b4, b5]
    // 1. If we had one pig, have it check b1, wait 15 mins, check b2, and so forth
    // 2. If the pig has not died after the 4th test at b4, then b5 must have the poison
    //
    // 3. Each additional pig would allow us to cover another dimension
    // ie 2 pigs
    //    [ b1,  b2,  b3,  b4,  b5]
    //    [ b6,  b7,  b8,  b9, b10]
    //    [b11, b12, b13, b14, b15]
    //    [b16, b17, b18, b19, b20]
    //    [b21, b22, b23, b24, b25]
    int count = 0;
    while(Math.pow(minutesToTest / minutesToDie + 1, count) < buckets)
      count++;
    
    return count;
  }
}
