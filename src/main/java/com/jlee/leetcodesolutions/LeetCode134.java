package com.jlee.leetcodesolutions;

public class LeetCode134 {
  /*
   * There are N gas stations along a circular route, where the amount of gas at
   * station i is gas[i].
   * 
   * You have a car with an unlimited gas tank and it costs cost[i] of gas to
   * travel from station i to its next station (i+1). You begin the journey with
   * an empty tank at one of the gas stations.
   * 
   * Return the starting gas station's index if you can travel around the circuit
   * once, otherwise return -1.
   * 
   * Note: The solution is guaranteed to be unique.
   * 
   * https://leetcode.com/problems/gas-station/description/
   */
  public int canCompleteCircuit(int[] gas, int[] cost) {
    if(gas == null || cost == null || gas.length == 0 || cost.length == 0)
      return -1;
    
    // If the total trip requires more gas than we can obtain, then we return -1.
    // Now we know we have enough gas to make the trip, we must find starting point.
    // Any time we reach a point where the reserve goes negative, we move to the
    // next point.
    int startPt = 0, reserve = 0, total = 0;
    for(int i = 0; i < gas.length; i++) {
      total += gas[i] - cost[i];
      reserve += gas[i] - cost[i];
      if(reserve < 0) {
        startPt = i + 1;
        reserve = 0;
      }
    }
    return total < 0 ? -1 : startPt;
  }  
}
