package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0210 {
  /*
   * There are a total of n courses you have to take, labeled from 0 to n - 1.
   * 
   * Some courses may have prerequisites, for example to take course 0 you have to
   * first take course 1, which is expressed as a pair: [0,1]
   * 
   * Given the total number of courses and a list of prerequisite pairs, return
   * the ordering of courses you should take to finish all courses.
   * 
   * There may be multiple correct orders, you just need to return one of them. If
   * it is impossible to finish all courses, return an empty array.
   * 
   * For example:
   * 2, [[1,0]] There are a total of 2 courses to take. To take course 1 you
   * should have finished course 0. So the correct course order is [0,1]
   * 
   * 4, [[1,0],[2,0],[3,1],[3,2]] There are a total of 4 courses to take. To take
   * course 3 you should have finished both courses 1 and 2. Both courses 1 and 2
   * should be taken after you finished course 0. So one correct course order is
   * [0,1,2,3]. Another correct ordering is[0,2,1,3].
   * 
   * https://leetcode.com/problems/course-schedule-ii/description/
   */
  public int[] findOrder(int numCourses, int[][] prerequisites) {
    int[] result = new int[numCourses];
    if(prerequisites == null || prerequisites.length == 0) {
      for(int i = 0; i < numCourses; i++)
        result[i] = i;
      return result;
    }
    int[] preReqCounts = new int[numCourses];
    // Tally up the number of prereqs for a course
    for(int[] course : prerequisites)
      preReqCounts[course[0]]++;
    
    // Store into queue all courses that have no prereqs
    Queue<Integer> queue = new LinkedList<>();
    int coursesYouCanTake = 0;
    for(int i = 0; i < preReqCounts.length; i++) {
      if(preReqCounts[i] == 0) {
        queue.add(i);
        result[coursesYouCanTake++] = i;
      }
    }
    
    while(!queue.isEmpty()) {
      int prereq = queue.remove();
      for(int[] course : prerequisites) {
        if(course[1] == prereq) {
          if(--preReqCounts[course[0]] == 0) {
            // We found another course we can take because we meet the prereqs
            queue.add(course[0]);
            result[coursesYouCanTake++] = course[0];
          }
        }
      }
    }
    return numCourses == coursesYouCanTake ? result : new int[] {};
  }
}
