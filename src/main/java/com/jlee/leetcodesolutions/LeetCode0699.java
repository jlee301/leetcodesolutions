package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;
import java.util.TreeMap;

public class LeetCode0699 {
  /*
   * On an infinite number line (x-axis), we drop given squares in the order they
   * are given.
   * 
   * The i-th square dropped (positions[i] = (left, side_length)) is a square with
   * the left-most point being positions[i][0] and sidelength positions[i][1].
   * 
   * The square is dropped with the bottom edge parallel to the number line, and
   * from a higher height than all currently landed squares. We wait for each
   * square to stick before dropping the next.
   * 
   * The squares are infinitely sticky on their bottom edge, and will remain fixed
   * to any positive length surface they touch (either the number line or another
   * square). Squares dropped adjacent to each other will not stick together
   * prematurely.
   * 
   * Return a list ans of heights. Each height ans[i] represents the current
   * highest height of any square we have dropped, after dropping squares
   * represented by positions[0], positions[1], ..., positions[i].
   * 
   * https://leetcode.com/problems/falling-squares/description/
   */
  public List<Integer> fallingSquares(int[][] positions) {
    // Create an index map of the coordinates to avoid having to fill the gap
    // between the square coordinates, ie if the square has length 100, you only
    // care about coordinates that occur again in between
    HashSet<Integer> coordinates = new HashSet<>();
    for(int[] square : positions) {
      coordinates.add(square[0]);
      coordinates.add(square[0]+square[1]-1);
    }
    List<Integer> sortedCoordinates = new ArrayList<>(coordinates);
    Collections.sort(sortedCoordinates);
    int t = 0;
    HashMap<Integer,Integer> indexMap = new HashMap<>();
    for(int coord : sortedCoordinates)
      indexMap.put(coord, t++);
    
    List<Integer> result = new ArrayList<>();
    TreeMap<Integer,Integer> heightAxis = new TreeMap<>();
    int max = 0;
    for(int[] square : positions) {
      // Query for the max height below this square
      // Check every position from square[0] to square[0] + square[1] - 1 for max height
      int left = indexMap.get(square[0]);
      int right = indexMap.get(square[0]+square[1]-1);
      
      Map<Integer,Integer> subMap = heightAxis.subMap(left, true, right, true);
      TreeSet<Integer> subHeights = new TreeSet<>(subMap.values());
      int subMax = subHeights.size() > 0 ? subHeights.last()+square[1] : square[1];
      max = Math.max(max, subMax);
      result.add(max);
      
      // Update height
      for(int i = left; i <= right; i++)
        heightAxis.put(i, subMax);
    }
    return result;
  }
}
