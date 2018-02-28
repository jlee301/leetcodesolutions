package com.jlee.leetcodesolutions;

import java.util.Queue;
import java.util.LinkedList;

public class LeetCode207 {
  /*
   * There are a total of n courses you have to take, labeled from 0 to n - 1.
   * 
   * Some courses may have prerequisites, for example to take course 0 you have to
   * first take course 1, which is expressed as a pair: [0,1]
   * 
   * Given the total number of courses and a list of prerequisite pairs, is it
   * possible for you to finish all courses?
   * 
   * For example:
   * 2, [[1,0]] There are a total of 2 courses to take. To take course 1 you
   * should have finished course 0. So it is possible.
   * 
   * 2, [[1,0],[0,1]] There are a total of 2 courses to take. To take course 1 you
   * should have finished course 0, and to take course 0 you should also have
   * finished course 1. So it is impossible.
   * 
   * https://leetcode.com/problems/course-schedule/description/
   */
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    if(prerequisites == null || prerequisites.length == 0)
      return true;
    
    int[] preReqCounts = new int[numCourses];
    // Tally up the number of prereqs for a course
    for(int[] course : prerequisites)
      preReqCounts[course[0]]++;
    
    // Store into queue all courses that have no prereqs
    Queue<Integer> queue = new LinkedList<>();
    for(int i = 0; i < preReqCounts.length; i++) {
      if(preReqCounts[i] == 0)
        queue.add(i);
    }
    
    // Initial courses you can take (no prereqs)
    int coursesYouCanTake = queue.size();
    while(!queue.isEmpty()) {
      int prereq = queue.remove();
      for(int[] course : prerequisites) {
        if(course[1] == prereq) {
          if(--preReqCounts[course[0]] == 0) {
            // We found another course we can take because we meet the prereqs
            queue.add(course[0]);
            coursesYouCanTake++;
          }
        }
      }
    }
    return numCourses == coursesYouCanTake;
  }
}
