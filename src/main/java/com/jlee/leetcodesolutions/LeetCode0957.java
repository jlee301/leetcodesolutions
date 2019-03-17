package com.jlee.leetcodesolutions;

public class LeetCode0957 {
  /*
   * https://leetcode.com/problems/prison-cells-after-n-days/
   */
  public int[] prisonAfterNDays(int[] cells, int N) {
    // Day 0: [0, 1, 0, 1, 1, 0, 0, 1]                [1, 0, 0, 1, 0, 0, 1, 0]
    // Day 1: [0, 1, 1, 0, 0, 0, 0, 0] <-- repeat --> [0, 0, 0, 1, 0, 0, 1, 0]
    // Day 2: [0, 0, 0, 0, 1, 1, 1, 0]                [0, 1, 0, 1, 0, 0, 1, 0]
    // Day 3: [0, 1, 1, 0, 0, 1, 0, 0]                [0, 1, 1, 1, 0, 0, 1, 0]
    // Day 4: [0, 0, 0, 0, 0, 1, 0, 0]                [0, 0, 1, 0, 0, 0, 1, 0]
    // Day 5: [0, 1, 1, 1, 0, 1, 0, 0]                [0, 0, 1, 0, 1, 0, 1, 0]
    // Day 6: [0, 0, 1, 0, 1, 1, 0, 0]                [0, 0, 1, 1, 1, 1, 1, 0]
    // Day 7: [0, 0, 1, 1, 0, 0, 0, 0]                [0, 0, 0, 1, 1, 1, 0, 0]
    // Day 8: [0, 0, 0, 0, 0, 1, 1, 0]                [0, 1, 0, 0, 1, 0, 0, 0]
    // Day 9: [0, 1, 1, 1, 0, 0, 0, 0]                [0, 1, 0, 0, 1, 0, 1, 0]
    // Day10: [0, 0, 1, 0, 0, 1, 1, 0]                [0, 1, 0, 0, 1, 1, 1, 0]
    // Day11: [0, 0, 1, 0, 0, 0, 0, 0]                [0, 1, 0, 0, 0, 1, 0, 0]
    // Day12: [0, 0, 1, 0, 1, 1, 1, 0]                [0, 1, 0, 1, 0, 1, 0, 0]
    // Day13: [0, 0, 1, 1, 0, 1, 0, 0]                [0, 1, 1, 1, 1, 1, 0, 0]
    // Day14: [0, 0, 0, 0, 1, 1, 0, 0]                [0, 0, 1, 1, 1, 0, 0, 0]
    // Day15: [0, 1, 1, 0, 0, 0, 0, 0] <-- repeat --> [0, 0, 0, 1, 0, 0, 1, 0]
    // Day16: [0, 0, 0, 0, 1, 1, 1, 0]                [0, 1, 0, 1, 0, 0, 1, 0]
    // Day17: [0, 1, 1, 0, 0, 1, 0, 0]                [0, 1, 1, 1, 0, 0, 1, 0]
    
    // Cycle happens every 14 days
    // If the N % 14 == 0, it means day 14 because you cannot use the initial Day 0 value
    N = N % 14 == 0 ? 14 : N % 14;
    while(N > 0) {
      int[] temp = new int[cells.length];
      temp[0] = 0;
      temp[temp.length-1] = 0;
      for(int i = 1; i < temp.length-1; i++)
        temp[i] = cells[i-1] == cells[i+1] ? 1 : 0;
      
      cells = temp;
      N--;
    }
    // System.out.println(Arrays.toString(cells));
    return cells;
  }
}
