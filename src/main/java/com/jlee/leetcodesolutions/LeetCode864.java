package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.Random;

public class LeetCode864 {
  /*
   * Given a blacklist B containing unique integers from [0, N), write a function
   * to return a uniform random integer from [0, N) which is NOT in B.
   * 
   * Optimize it such that it minimizes the call to system’s Math.random().
   * 
   * Note:
   * 1. 1 <= N <= 1000000000
   * 2. 0 <= B.length < min(100000, N)
   * 3. [0, N) does NOT include N
   * 
   * https://leetcode.com/problems/random-pick-with-blacklist/description/
   */
  private HashMap<Integer,Integer> map;
  private Random rand;
  private int M;
  
  public LeetCode864(int N, int[] blacklist) {
    rand = new Random();
    // Create a map entry for every blacklist integer less than N
    map = new HashMap<>();
    for(int bnum : blacklist) {
      if(bnum < N)
        map.put(bnum, 0);
    }
    
    // Now fill every entry within the new range M with a valid integer
    M = N - map.size();
    N--;
    for(int bnum : blacklist) {
      if(bnum < M) {
        // Skip until we find next valid integer
        while(map.containsKey(N)) N--;
        map.put(bnum, N);
        N--;
      }
    }
  }
  
  public int pick() {
    int key = rand.nextInt(M);
    if(map.containsKey(key))
      return map.get(key);
    return key;
  }
}
