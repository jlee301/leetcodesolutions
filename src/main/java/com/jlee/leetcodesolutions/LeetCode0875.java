package com.jlee.leetcodesolutions;

public class LeetCode0875 {
  /*
   * Koko loves to eat bananas. There are N piles of bananas, the i-th pile has
   * piles[i] bananas. The guards have gone and will come back in H hours.
   * 
   * Koko can decide her bananas-per-hour eating speed of K. Each hour, she
   * chooses some pile of bananas, and eats K bananas from that pile. If the pile
   * has less than K bananas, she eats all of them instead, and won't eat any more
   * bananas during this hour.
   * 
   * Koko likes to eat slowly, but still wants to finish eating all the bananas
   * before the guards come back.
   * 
   * Return the minimum integer K such that she can eat all the bananas within H
   * hours.
   * 
   * Note:
   * 1. 1 <= piles.length <= 10^4
   * 2. piles.length <= H <= 10^9
   * 3. 1 <= piles[i] <= 10^9
   * 
   * https://leetcode.com/problems/koko-eating-bananas/description/
   */
  public int minEatingSpeed(int[] piles, int H) {
    // We have to search every available option 1 thru 10^9
    // So instead of linear search, we use binary search
    int low = 1;
    int high = 1000000000;
    while(low < high) {
      int mid = low + ((high-low) / 2);
      // Check if mid is possible for Koko to finish in time
      if(isPossible(piles, H, mid))
        high = mid;
      else
        low = mid+1;
    }
    return low;
  }
  
  private boolean isPossible(int[] piles, int H, int K) {
    // Checking to see if it is possible for Koko to eat all bananas at K rate
    // in H time
    int total = 0;
    for(int p : piles) {
      total += p / K;
      // Any remainder will require another hour to finish
      total += p % K == 0 ? 0 : 1;
    }
    return total <= H;
  }
}
