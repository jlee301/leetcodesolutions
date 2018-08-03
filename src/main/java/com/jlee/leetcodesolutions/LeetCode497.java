package com.jlee.leetcodesolutions;

import java.util.Random;
import java.util.TreeMap;

public class LeetCode497 {
  /*
   * Given a list of non-overlapping axis-aligned rectangles rects, write a
   * function pick which randomly and uniformily picks an integer point in the
   * space covered by the rectangles.
   * 
   * Note:
   * 1. An integer point is a point that has integer coordinates.
   * 2. A point on the perimeter of a rectangle is included in the space covered
   * by the rectangles.
   * 3. ith rectangle = rects[i] = [x1,y1,x2,y2], where [x1, y1] are the integer
   * coordinates of the bottom-left corner, and [x2, y2] are the integer
   * coordinates of the top-right corner.
   * 4. length and width of each rectangle does not exceed 2000.
   * 5. 1 <= rects.length <= 100
   * 6. pick return a point as an array of integer coordinates [p_x, p_y]
   * 7. pick is called at most 10000 times.
   * 
   * https://leetcode.com/problems/random-point-in-non-overlapping-rectangles/description/
   */
  private TreeMap<Integer,Integer> map;
  private int wsum;
  private Random rand;
  private int[][] rects;
  
  public LeetCode497(int[][] rects) {
    // Store the weighted sum of each rectangle to its index in rects array
    map = new TreeMap<>();
    wsum = 0;
    this.rects = rects;
    for(int i = 0; i < rects.length; i++) {
      map.put(wsum, i); 
      // Not the area, but the number of points (which is why we're adding + 1 to the LW)
      wsum += (rects[i][3] - rects[i][1] + 1) * (rects[i][2] - rects[i][0] + 1);
    }
    rand = new Random();
  }
  
  public int[] pick() {
    // Pick random number from 0 (inclusive) - wsum (exclusive)
    int r = rand.nextInt(wsum);

    // Which rectangle does this number represent
    int key = map.floorKey(r);
    int index = map.get(key);
    
    // Take the bottom left coordinates and add the x and y from the random value
    int coord = r - key;
    int width = rects[index][2] - rects[index][0] + 1;
    return new int[] { rects[index][0] + (coord % width), rects[index][1] + (coord / width) };
  }
}
