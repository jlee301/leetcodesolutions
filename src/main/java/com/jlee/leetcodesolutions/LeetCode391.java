package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode391 {
  /*
   * Given N axis-aligned rectangles where N > 0, determine if they all together
   * form an exact cover of a rectangular region.
   * 
   * Each rectangle is represented as a bottom-left point and a top-right point.
   * For example, a unit square is represented as [1,1,2,2]. (coordinate of
   * bottom-left point is (1, 1) and top-right point is (2, 2)).
   * 
   * https://leetcode.com/problems/perfect-rectangle/description/
   */
  public boolean isRectangleCover(int[][] rectangles) {
    int area = 0;
    int x1 = Integer.MAX_VALUE, y1 = Integer.MAX_VALUE, x2 = Integer.MIN_VALUE, y2 = Integer.MIN_VALUE;
    HashSet<String> coordinates = new HashSet<>();
    for(int[] rect : rectangles) {
      // 1. Maintain overall bottom left and top right positions
      x1 = Math.min(x1, rect[0]);
      y1 = Math.min(y1, rect[1]);
      x2 = Math.max(x2, rect[2]);
      y2 = Math.max(y2, rect[3]);
      
      // 2. Sum the areas of each rectangle
      area += (rect[2] - rect[0]) * (rect[3] - rect[1]);
      
      // 3. The four coordinates of this rectangle
      String[] coords = new String[4];
      coords[0] = rect[0] + "-" + rect[1]; // bottom left
      coords[1] = rect[0] + "-" + rect[3]; // top left
      coords[2] = rect[2] + "-" + rect[3]; // top right
      coords[3] = rect[2] + "-" + rect[1]; // bottom right
      
      // 4. Store the coordinates into set. If it exist already it means this
      // rectangle SHOULD be creating a bigger one, so remove current coordinates.
      // If you remove the coordinates but it is not creating a bigger rectangle, it
      // would indicate an overlap.
      for(int i = 0; i < 4; i++) {
        if(!coordinates.add(coords[i]))
          coordinates.remove(coords[i]);
      }
    }
    
    // 5. There should be exactly four coordinates (the points created with the
    // overall bottom left and top right: (x1,y1), (x1,y2), (x2,y2), (x2,y1)
    //
    // 6. If there are not exactly four coordinates, it means there are gaps or
    // overlaps in the rectangles    
    if(!coordinates.contains(x1 + "-" + y1))
      return false;
    
    if(!coordinates.contains(x1 + "-" + y2))
      return false;
    
    if(!coordinates.contains(x2 + "-" + y2))
      return false;
    
    if(!coordinates.contains(x2 + "-" + y1))
      return false;

    if(coordinates.size() != 4)
      return false;

    
    // 7. If the four coordinates match, but the area does not, it means there are
    // gaps or overlaps
    return area == (x2 - x1) * (y2 - y1);
  }
}
