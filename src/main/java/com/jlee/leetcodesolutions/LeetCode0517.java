package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0517 {
  /*
   * You have n super washing machines on a line. Initially, each washing machine
   * has some dresses or is empty.
   * 
   * For each move, you could choose any m (1 ≤ m ≤ n) washing machines, and pass
   * one dress of each washing machine to one of its adjacent washing machines at
   * the same time .
   * 
   * Given an integer array representing the number of dresses in each washing
   * machine from left to right on the line, you should find the minimum number of
   * moves to make all the washing machines have the same number of dresses. If it
   * is not possible to do it, return -1.
   * 
   * https://leetcode.com/problems/super-washing-machines/description/
   */
  public int findMinMoves(int[] machines) {
    int N = machines.length;
    int sum = Arrays.stream(machines).sum();
    if(sum % N != 0)
      return -1;
    int target = sum / N;
    // left = number of dresses to move to left from machines[i]
    // right = number of dresses to move to right from machines[i]
    // [0,3,0], target = 1
    // i=0: left=0, right=-1, moves=0
    // i=1: left=1, right=1, moves=2
    // i=2: left=-1, right=0, moves=2
    int left = 0, right = 0, moves = 0;
    for(int i = 0; i < N; i++) {
      right = machines[i] - target - left;
      moves = Math.max(moves, Math.max(left, Math.max(right, left+right)));
      left = -right;
    }
    return moves;
  }
}
