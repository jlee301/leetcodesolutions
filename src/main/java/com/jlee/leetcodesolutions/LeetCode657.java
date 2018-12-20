package com.jlee.leetcodesolutions;

public class LeetCode657 {
  /*
   * Initially, there is a Robot at position (0, 0). Given a sequence of its
   * moves, judge if this robot makes a circle, which means it moves back to the
   * original place.
   * 
   * The move sequence is represented by a string. And each move is represent by a
   * character. The valid robot moves are R (Right), L (Left), U (Up) and D
   * (down). The output should be true or false representing whether the robot
   * makes a circle.
   * 
   * Example 1: 
   * Input: "UD" 
   * Output: true 
   * 
   * Example 2: 
   * Input: "LL" 
   * Output: false
   * 
   * https://leetcode.com/problems/judge-route-circle/description/
   */
  public boolean judgeCircle(String moves) {
    int x = 0, y = 0;
    for(int i = 0; i < moves.length(); i++) {
      char ch = moves.charAt(i);
      if(ch == 'U')
        y++;
      else if(ch == 'D')
        y--;
      else if(ch == 'L')
        x--;
      else
        x++;
    }
    return x == 0 && y == 0;
  }
}
