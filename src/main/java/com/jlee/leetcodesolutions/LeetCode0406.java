package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode0406 {
  /*
   * Suppose you have a random list of people standing in a queue. Each person is
   * described by a pair of integers (h, k), where h is the height of the person
   * and k is the number of people in front of this person who have a height
   * greater than or equal to h. Write an algorithm to reconstruct the queue.
   * 
   * Note: The number of people is less than 1,100.
   * 
   * Example Input: [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]] Output: [[5,0],
   * [7,0], [5,2], [6,1], [4,4], [7,1]]
   * 
   * https://leetcode.com/problems/queue-reconstruction-by-height/description/
   */
  public int[][] reconstructQueue(int[][] people) {
    // Sort by h ascending and k descending
    Arrays.sort(people, new HeightComparator());

    // For a given person to insert, all the people already sorted are higher, so we
    // just insert him in the right place to make the people before him as his
    // k indicates. Since he is shorter than all the people in the sorted list, the 
    // k of the existing people is not broken by the insertion.
    List<int[]> list = new ArrayList<>();
    for (int i = 0; i < people.length; i++)
      list.add(people[i][1], people[i]);

    int[][] result = new int[people.length][];
    int i = 0;
    for (int[] person : list)
      result[i++] = person;
    return result;
  }

  private class HeightComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
      if (a[0] == b[0])
        // If heights are the same, we want number of people in front (k) in ascending
        return a[1] - b[1];
      // We want height in descending order
      return b[0] - a[0];
    }
  }
}
