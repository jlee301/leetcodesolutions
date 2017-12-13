package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
  /*
   * Given numRows, generate the first numRows of Pascal's triangle.
   * 
   * Input: 5
   * Output:
   * [
   *      [1],
   *     [1,1],
   *    [1,2,1],
   *   [1,3,3,1],
   *  [1,4,6,4,1]
   * ]
   */
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if(numRows == 0)
      return result;

    ArrayList<Integer> entry = new ArrayList<Integer>();    
    for(int i = 0; i < numRows; i++) {
      // Adding this entry also serves the purpose of having the correct number of
      // entries in the list.
      entry.add(0, 1);
      for(int j = 1; j < entry.size() - 1; j++) {
        // This for loop serves two purposes
        // 1. First two entries will be [1] and [1],[1]
        // 2. The loop will start calculating entries when i=2 / entry 3 is added
        // so when it is i=2, it will look like 
        //  [1], [1], [1] --> [1], [2], [1]
        //  [1], [1], [2], [1] --> [1], [3], [3], [1]
        //  [1], [1], [3], [3]. [1] --> [1], [4], [6]. [4], [1]
        entry.set(j, entry.get(j) + entry.get(j + 1));
      }
      // If you don't add it as a new ArrayList, it will keep passing entry as a
      // reference
      result.add(new ArrayList<Integer>(entry));
    }
    return result;
  }
}