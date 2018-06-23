package com.jlee.leetcodesolutions;

import java.util.TreeMap;

public class LeetCode732 {
  /*
   * Implement a MyCalendarThree class to store your events. A new event can
   * always be added.
   * 
   * Your class will have one method, book(int start, int end). Formally, this
   * represents a booking on the half open interval [start, end), the range of
   * real numbers x such that start <= x < end.
   * 
   * A K-booking happens when K events have some non-empty intersection (ie.,
   * there is some time that is common to all K events.)
   * 
   * For each call to the method MyCalendar.book, return an integer K representing
   * the largest integer such that there exists a K-booking in the calendar.
   * 
   * Your class will be called like this: MyCalendarThree cal = new
   * MyCalendarThree(); MyCalendarThree.book(start, end)
   */
  class MyCalendarThree {
    private TreeMap<Integer,Integer> map;
    
    public MyCalendarThree() {
      map = new TreeMap<>();
    }

    public int book(int start, int end) {
      int s = map.getOrDefault(start, 0) + 1;
      int e = map.getOrDefault(end, 0) - 1;
      
      // Clean up map if result is zero to lessen number of bookings
      if(s == 0)
        map.remove(start);
      else
        map.put(start, s);
      
      if(e == 0)
        map.remove(end);
      else
        map.put(end, e);
      
      int maxbookings = 0;
      int bookings = 0;
      for(int num : map.values()) {
        bookings += num;
        maxbookings = Math.max(maxbookings, bookings);
      }
      return maxbookings;
    }
  }
}
