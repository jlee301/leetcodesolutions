package com.jlee.leetcodesolutions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode871 {
  /*
   * A car travels from a starting position to a destination which is target miles
   * east of the starting position.
   * 
   * Along the way, there are gas stations. Each station[i] represents a gas
   * station that is station[i][0] miles east of the starting position, and has
   * station[i][1] liters of gas.
   * 
   * The car starts with an infinite tank of gas, which initially has startFuel
   * liters of fuel in it. It uses 1 liter of gas per 1 mile that it drives.
   * 
   * When the car reaches a gas station, it may stop and refuel, transferring all
   * the gas from the station into the car.
   * 
   * What is the least number of refueling stops the car must make in order to
   * reach its destination? If it cannot reach the destination, return -1.
   * 
   * Note that if the car reaches a gas station with 0 fuel left, the car can
   * still refuel there. If the car reaches the destination with 0 fuel left, it
   * is still considered to have arrived.
   * 
   * https://leetcode.com/problems/minimum-number-of-refueling-stops/description/
   */
  public int minRefuelStops(int target, int startFuel, int[][] stations) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(new FuelComparator());
    int stops = 0;
    int prev = 0;
    for(int i = 0; i < stations.length; i++) {      
      startFuel -= stations[i][0] - prev;
      prev = stations[i][0];

      // Need to re-fuel to move to the current station
      while(startFuel < 0) {
        if(pq.isEmpty()) return -1;
        // Re-fuel from largest available
        startFuel += pq.poll();
        stops++;
      }        
      // Cache the gas from the current station into the queue
      pq.add(stations[i][1]);
    }
    
    // Perform loop one last time from last station to the target
    startFuel -= target - prev;
    while(startFuel < 0) {
      if(pq.isEmpty()) return -1;
      startFuel += pq.poll();
      stops++;
    }
    return stops;
  }
  
  private class FuelComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer A, Integer B) {
      return B - A;
    }
  } 
}
