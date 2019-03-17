package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.List;

public class LeetCode0554 {
  /*
   * There is a brick wall in front of you. The wall is rectangular and has
   * several rows of bricks. The bricks have the same height but different width.
   * You want to draw a vertical line from the top to the bottom and cross the
   * least bricks.
   * 
   * The brick wall is represented by a list of rows. Each row is a list of
   * integers representing the width of each brick in this row from left to right.
   * 
   * If your line go through the edge of a brick, then the brick is not considered
   * as crossed. You need to find out how to draw the line to cross the least
   * bricks and return the number of crossed bricks.
   * 
   * You cannot draw a line just along one of the two vertical edges of the wall,
   * in which case the line will obviously cross no bricks.
   * 
   * Note:
   * 1. The width sum of bricks in different rows are the same and won't exceed
   * INT_MAX.
   * 2. The number of bricks in each row is in range [1,10,000]. The height of
   * wall is in range [1,10,000]. Total number of bricks of the wall won't exceed
   * 20,000.
   */
  public int leastBricks(List<List<Integer>> wall) {
    if(wall == null || wall.isEmpty())
      return 0;
    
    // Store the frequency of each edge into HashMap<Length of Edge, Frequency>
    HashMap<Integer,Integer> map = new HashMap<>();
    int maxCount = 0;
    for(List<Integer> row : wall) {
      // We skip adding the last brick of each row because we cannot include the two
      // vertical edges of the wall
      int len = row.size()-1;
      int widthOfEdge = 0;
      for(int i = 0; i < len; i++) {
        widthOfEdge += row.get(i);
        int count = map.getOrDefault(widthOfEdge, 0) + 1;
        map.put(widthOfEdge, count);
        maxCount = Math.max(maxCount, count);
      }
    }
    // Return number of crossed bricks
    return wall.size() - maxCount;
  }
}
