package com.jlee.leetcodesolutions;

public class LeetCode0780 {
  /*
   * A move consists of taking a point (x, y) and transforming it to either (x,
   * x+y) or (x+y, y).
   * 
   * Given a starting point (sx, sy) and a target point (tx, ty), return True if
   * and only if a sequence of moves exists to transform the point (sx, sy) to
   * (tx, ty). Otherwise, return False.
   * 
   * Note:
   * sx, sy, tx, ty will all be integers in the range [1, 10^9].
   * 
   * https://leetcode.com/problems/reaching-points/description/
   */
  public boolean reachingPoints(int sx, int sy, int tx, int ty) {
    if(sx == tx && sy == ty)
      return true;
    
    if(sx > tx || sy > ty)
      return false;
    
    int times = 0;
    if(tx >= ty) {
      times = Math.max(1, (tx - sx) / ty);
      return reachingPoints(sx, sy, tx-(times*ty), ty);
    }
    else {
      times = Math.max(1, (ty - sy) / tx);
      return reachingPoints(sx, sy, tx, ty-(times*tx));
    }
  }
}
