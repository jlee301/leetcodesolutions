package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class LeetCode0853 {
  /*
   * N cars are going to the same destination along a one lane road. The
   * destination is target miles away.
   * 
   * Each car i has a constant speed speed[i] (in miles per hour), and initial
   * position position[i] miles towards the target along the road.
   * 
   * A car can never pass another car ahead of it, but it can catch up to it, and
   * drive bumper to bumper at the same speed.
   * 
   * The distance between these two cars is ignored - they are assumed to have the
   * same position.
   * 
   * A car fleet is some non-empty set of cars driving at the same position and
   * same speed. Note that a single car is also a car fleet.
   * 
   * If a car catches up to a car fleet right at the destination point, it will
   * still be considered as one car fleet.
   * 
   * How many car fleets will arrive at the destination?
   * 
   * https://leetcode.com/contest/weekly-contest-89/problems/car-fleet/
   */
  public int carFleet(int target, int[] position, int[] speed) {
    int N = position.length;
    
    // Store in each array the car's starting position and it's finish time.
    Car[] data = new Car[N];
    for(int i = 0; i < N; i++) {
      double finish = (double) (target-position[i]) / speed[i]; 
      data[i] = new Car(position[i], finish);
    }
      
    // Sort by starting position descending
    Arrays.sort(data, new PositionComparator());

    int fleet = 0;
    HashSet<Integer> used = new HashSet<>();
    // Scan the array to see which car(s) finishes less than or equal
    // These cars will form a fleet
    for(int i = 0; i < N; i++) {
      if(used.contains(i)) continue;
      used.add(i);
      for(int j = 0; j < N; j++) {
        if(used.contains(j)) continue;
        if(data[i].finish >= data[j].finish)
          used.add(j);
      }
      fleet++;
    }
    return fleet;
  }
  
  private class PositionComparator implements Comparator<Car> {
    @Override
    public int compare(Car a, Car b) {
      return b.pos - a.pos; 
    }
  }
  
  private class Car {
    public int pos;
    public double finish;
    Car(int a, double b) {
      pos = a;
      finish = b;
    }
  }
}
