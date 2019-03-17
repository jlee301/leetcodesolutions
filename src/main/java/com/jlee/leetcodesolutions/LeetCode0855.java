package com.jlee.leetcodesolutions;

import java.util.TreeSet;

public class LeetCode0855 {
  /*
   * In an exam room, there are N seats in a single row, numbered 0, 1, 2, ...,
   * N-1.
   * 
   * When a student enters the room, they must sit in the seat that maximizes the
   * distance to the closest person. If there are multiple such seats, they sit in
   * the seat with the lowest number. (Also, if no one is in the room, then the
   * student sits at seat number 0.)
   * 
   * Return a class ExamRoom(int N) that exposes two functions: ExamRoom.seat()
   * returning an int representing what seat the student sat in, and
   * ExamRoom.leave(int p) representing that the student in seat number p now
   * leaves the room. It is guaranteed that any calls to ExamRoom.leave(p) have a
   * student sitting in seat p.
   * 
   * https://leetcode.com/problems/exam-room/description/
   */
  class ExamRoom {
    private TreeSet<Integer> seats;
    private int N;
    
    public ExamRoom(int N) {
      seats = new TreeSet<>();
      this.N = N;
    }
    
    public int seat() {
      // Determine which seat the student will sit in
      int seat = 0;
      if(seats.size() > 0) {
        int maxdist = seats.first();
        Integer prev = null;

        // Check each occupied adjacent seats for which can create max distance
        for(Integer next : seats) {
          if(prev != null) {
            // The midpoint is the distance between the current adjacent seats
            int currdist = (next - prev) / 2;
            
            // If the distance is bigger than the max, then take this seat as next possible
            if(currdist > maxdist) {
              maxdist = currdist;
              seat = prev + currdist;
            }
          }
          prev = next;
        }
        
        // Check right most
        if(N-1-seats.last() > maxdist)
          seat = N-1;
      }
      
      seats.add(seat);
      return seat;
    }
    
    public void leave(int p) {
      seats.remove(p);
    }
  }
}
