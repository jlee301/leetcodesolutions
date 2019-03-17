package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode0630 {
  /*
   * There are n different online courses numbered from 1 to n. Each course has
   * some duration(course length) t and closed on dth day. A course should be
   * taken continuously for t days and must be finished before or on the dth day.
   * You will start at the 1st day.
   * 
   * Given n online courses represented by pairs (t,d), your task is to find the
   * maximal number of courses that can be taken.
   * 
   * https://leetcode.com/problems/course-schedule-iii/description/
   */
  public int scheduleCourse(int[][] courses) {
    // Sort the courses by its closed date ascending order
    Arrays.sort(courses, new EndComparator());
    
    // 1. The queue size is the number of courses the student will be able to take
    // 2. The queue is the time length of the course in descending order
    int time = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<>(new TimeComparator());
    for(int i = 0; i < courses.length; i++) {
      // Can the course be completed before the closed day?
      if(time + courses[i][0] <= courses[i][1]) {
        pq.add(courses[i][0]);
        time += courses[i][0];
      }
      // 3. Can I remove a course that has a time that's greater or equal to the current course time?
      // 4. The current course will have a bigger end day, it will buy the student more time
      else {
        if(!pq.isEmpty() && pq.peek() >= courses[i][0]) {
          time = time - pq.poll() + courses[i][0];
          pq.add(courses[i][0]);
        }
      }
    }
    return pq.size();
  }

  private class EndComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] A, int[] B) {
      return A[1] - B[1];
    }
  }
  
  private class TimeComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer A, Integer B) {
      return B - A;
    }
  }
}
