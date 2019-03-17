package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.PriorityQueue;

public class LeetCode0945 {
  /*
   * Given an array of integers A, a move consists of choosing any A[i], and
   * incrementing it by 1.
   * 
   * Return the least number of moves to make every value in A unique.
   * 
   * https://leetcode.com/contest/weekly-contest-112/problems/minimum-increment-to-make-array-unique/
   */
  public int minIncrementForUnique(int[] A) {
    HashSet<Integer> numbers = new HashSet<>();
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    for(int num : A) {
      if(!numbers.add(num))
        queue.add(num);
    }
    int moves = 0;
    int last = Integer.MIN_VALUE;
    while(!queue.isEmpty()) {
      int num = queue.poll();
      if(num > last) {
        last = num;
      }
      else {
        moves += last - num;
      }
      
      while(numbers.contains(last)) {
        last++;
        moves++;
      }
      numbers.add(last);
    }
    return moves;
  }
}
