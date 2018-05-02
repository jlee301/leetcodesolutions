package com.jlee.leetcodesolutions;

import java.util.TreeMap;

public class LeetCode729 {
  /*
   * Implement a MyCalendar class to store your events. A new event can be added
   * if adding the event will not cause a double booking.
   * 
   * Your class will have the method, book(int start, int end). Formally, this
   * represents a booking on the half open interval [start, end), the range of
   * real numbers x such that start <= x < end.
   * 
   * A double booking happens when two events have some non-empty intersection
   * (ie., there is some time that is common to both events.)
   * 
   * For each call to the method MyCalendar.book, return true if the event can be
   * added to the calendar successfully without causing a double booking.
   * Otherwise, return false and do not add the event to the calendar.
   * 
   * Your class will be called like this: MyCalendar cal = new MyCalendar();
   * MyCalendar.book(start, end)
   * 
   * https://leetcode.com/problems/my-calendar-i/description/
   */
  private TreeMap<Integer,Integer> map;
  
  public LeetCode729() {
    map = new TreeMap<>();
  }
  
  public boolean book(int start, int end) {
    Integer floor = map.floorKey(start);
    Integer ceiling = map.ceilingKey(start);
    
    if( (floor == null || map.get(floor) <= start) && (ceiling == null || end <= ceiling) ) {
      map.put(start, end);
      return true;      
    }
    return false;

    /*if(floor == null && ceiling == null) {
      map.put(start, end);
      return true;
    }
    else if(floor == null) {
      // Start is available, check if end is within ceiling's start
      if(end <= ceiling) {
        map.put(start, end);
        return true;
      }
    }
    else if(ceiling == null) {
      // check if start conflicts with floor's end
      int scheduledEnd = map.get(floor);
      if(scheduledEnd <= start) {
        map.put(start, end);
        return true;
      }
    }
    else {
      // floor != null && ceiling != null
      // Scheduling conflict, floor == ceiling == start
      if(floor == ceiling)
        return false;
      
      // The start and end time are within limits to what's already scheduled
      int scheduledEnd = map.get(floor);
      if(scheduledEnd <= start && end <= ceiling) {
        map.put(start, end);
        return true;
      }
    }
    return false;*/
  }
}
