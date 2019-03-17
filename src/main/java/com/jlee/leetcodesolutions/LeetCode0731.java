package com.jlee.leetcodesolutions;

import java.util.TreeMap;

public class LeetCode0731 {
  /*
   * Implement a MyCalendarTwo class to store your events. A new event can be
   * added if adding the event will not cause a triple booking.
   * 
   * Your class will have one method, book(int start, int end). Formally, this
   * represents a booking on the half open interval [start, end), the range of
   * real numbers x such that start <= x < end.
   * 
   * A triple booking happens when three events have some non-empty intersection
   * (ie., there is some time that is common to all 3 events.)
   * 
   * For each call to the method MyCalendar.book, return true if the event can be
   * added to the calendar successfully without causing a triple booking.
   * Otherwise, return false and do not add the event to the calendar.
   * 
   * Your class will be called like this: MyCalendar cal = new MyCalendar();
   * MyCalendar.book(start, end)
   * 
   * https://leetcode.com/problems/my-calendar-ii/description/
   */
  private TreeMap<Integer,Integer> map;
  
  public LeetCode0731() {
    map = new TreeMap<>();
  }
  
  public boolean book(int start, int end) {
    // Create a balance for this event by +1 to the start and -1 to the end 
    map.put(start, map.getOrDefault(start, 0) + 1);
    map.put(end, map.getOrDefault(end, 0) - 1);
    
    // If the accumulation sum >= 3, then we have a triple booking
    int sum = 0;
    for(int num : map.values()) {
      sum += num;
      if(sum >= 3) {
        map.put(start, map.get(start) - 1);
        map.put(end, map.get(end) + 1);
        return false;
      }
    }
    return true;
  }
}
