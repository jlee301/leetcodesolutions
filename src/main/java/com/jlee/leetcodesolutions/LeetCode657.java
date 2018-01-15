package com.jlee.leetcodesolutions;

import java.util.HashMap;

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
    if(moves == null || moves.length() == 0)
      return true;
    
    moves = moves.toUpperCase().trim();
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    for(int i = 0; i < moves.length(); i++)
      if(moves.charAt(i) == 'U' || moves.charAt(i) == 'D' || moves.charAt(i) == 'L' || moves.charAt(i) == 'R')
        map.put((char) moves.charAt(i), map.getOrDefault((char) moves.charAt(i), 0) + 1);
    
    if(map.getOrDefault((char) 'U',0) - map.getOrDefault((char) 'D',0) == 0 &&
        map.getOrDefault((char) 'L',0) - map.getOrDefault((char) 'R',0) == 0)
      return true;
    else
      return false;
  }
}
