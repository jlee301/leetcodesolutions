package com.jlee.leetcodesolutions;

import java.util.List;
import java.util.Stack;

public class LeetCode0636 {
  /*
   * Given the running logs of n functions that are executed in a nonpreemptive
   * single threaded CPU, find the exclusive time of these functions.
   * 
   * Each function has a unique id, start from 0 to n-1. A function may be called
   * recursively or by another function.
   * 
   * A log is a string has this format : function_id:start_or_end:timestamp. For
   * example, "0:start:0" means function 0 starts from the very beginning of time
   * 0. "0:end:0" means function 0 ends to the very end of time 0.
   * 
   * Exclusive time of a function is defined as the time spent within this
   * function, the time spent by calling other functions should not be considered
   * as this function's exclusive time. You should return the exclusive time of
   * each function sorted by their function id.
   * 
   * Note:
   * 1. Input logs will be sorted by timestamp, NOT log id.
   * 2. Your output should be sorted by function id, which means the 0th element
   * of your output corresponds to the exclusive time of function 0.
   * 3. Two functions won't start or end at the same time.
   * 4. Functions could be called recursively, and will always end.
   * 5. 1 <= n <= 100
   * 
   * https://leetcode.com/problems/exclusive-time-of-functions/description/
   */
  public int[] exclusiveTime(int n, List<String> logs) {
    if(logs == null || logs.isEmpty())
      return new int[] {};
    
    int[] time = new int[n];
    String[] data = logs.get(0).split(":");
    int prevTime = Integer.valueOf(data[2]);
    Stack<Integer> stack = new Stack<>();
    stack.push(Integer.valueOf(data[0]));
    
    for(int i = 1; i < logs.size(); i++) {
      data = logs.get(i).split(":");
      int currTime = Integer.valueOf(data[2]);
      if(data[1].equals("start")) {
        if(!stack.isEmpty())
          time[stack.peek()] += currTime - prevTime;
        prevTime = currTime;
        stack.push(Integer.valueOf(data[0]));
      } else { // data[1] == "end"
        // We add +1 with the currTime because for end condition the time is inclusive
        // (to the very end of currTime)
        time[stack.peek()] += currTime - prevTime + 1;
        prevTime = currTime + 1;
        stack.pop();
      }
    }
    return time;
  }
}
