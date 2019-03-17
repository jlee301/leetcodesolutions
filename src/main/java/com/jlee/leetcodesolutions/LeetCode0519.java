package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.Random;

public class LeetCode0519 {
  /*
   * You are given the number of rows n_rows and number of columns n_cols of a 2D
   * binary matrix where all values are initially 0. Write a function flip which
   * chooses a 0 value uniformly at random, changes it to 1, and then returns the
   * position [row.id, col.id] of that value. Also, write a function reset which
   * sets all values back to 0. Try to minimize the number of calls to system's
   * Math.random() and optimize the time and space complexity.
   * 
   * https://leetcode.com/problems/random-flip-matrix/description/
   */
  private int n_rows;
  private int n_cols;
  private int total;
  private HashMap<Integer,Integer> map;
  private Random rand;
  
  public LeetCode0519(int n_rows, int n_cols) {
    this.n_rows = n_rows;
    this.n_cols = n_cols;
    // total = total number of row.id, col.id combinations available
    total = n_rows * n_cols;
    map = new HashMap<>();
    rand = new Random();
  }
  
  public int[] flip() {
    // 1. Choose a random number between 0 (inclusive) and total (exclusive)
    // 2. Re-map what was flipped with the tail end as the total shrinks
    // 3. If the number is chosen again, it will give the re-mapped result
    int next = rand.nextInt(total--);
    int coord = map.getOrDefault(next, next);
    map.put(next, map.getOrDefault(total, total));
    return new int[] { coord / n_cols, coord % n_cols };
  }
  
  public void reset() {
    map.clear();
    total = n_rows * n_cols;
  }
}
