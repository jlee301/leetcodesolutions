package com.jlee.leetcodesolutions;

public class LeetCode1041 {
  /*
   * https://leetcode.com/problems/robot-bounded-in-circle/
   */
  public boolean isRobotBounded(String instructions) {
    String seq = instructions + instructions + instructions + instructions;
    int x = 0, y = 0, dir = 0;
    for(int i = 0; i < seq.length(); i++) {
      char ch = seq.charAt(i);
      if(ch == 'L')
        dir = (dir+1) % 4;
      else if(ch == 'R')
        dir = (4 + dir - 1) % 4;
      else {
        // dir == 0 == N
        // dir == 1 == W
        // dir == 2 == S
        // dir == 3 == E
        if(dir == 0)
          y++;
        else if(dir == 1)
          x++;
        else if(dir == 2)
          y--;
        else
          x--;
      }
    }
    return x == 0 && y == 0;
  }
}
