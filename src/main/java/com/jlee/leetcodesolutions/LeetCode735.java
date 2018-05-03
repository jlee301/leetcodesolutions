package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode735 {
  /*
   * We are given an array asteroids of integers representing asteroids in a row.
   * 
   * For each asteroid, the absolute value represents its size, and the sign
   * represents its direction (positive meaning right, negative meaning left).
   * Each asteroid moves at the same speed.
   * 
   * Find out the state of the asteroids after all collisions. If two asteroids
   * meet, the smaller one will explode. If both are the same size, both will
   * explode. Two asteroids moving in the same direction will never meet.
   * 
   * https://leetcode.com/problems/asteroid-collision/description/
   */
  public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> stack = new Stack<>();
    int i = 0;
    while(i < asteroids.length) {
      if(!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0) {
        int left = Math.abs(stack.peek());
        int right = Math.abs(asteroids[i]);
        if(left > right) i++; // right asteroid is destroyed
        else if(left < right) stack.pop(); // left is destroyed
        else {
          // both left and right are destroyed
          stack.pop();
          i++;
        }
      }
      else {
        stack.push(asteroids[i]);
        i++;
      }
    }
    // Convert what is in the stack into the array
    int[] result = new int[stack.size()];
    for(int j = result.length-1; j >= 0; j--)
      result[j] = stack.pop();
    return result;
  }
}
