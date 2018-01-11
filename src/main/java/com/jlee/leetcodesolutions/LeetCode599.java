package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode599 {
  /*
   * Suppose Andy and Doris want to choose a restaurant for dinner, and they both
   * have a list of favorite restaurants represented by strings.
   * 
   * You need to help them find out their common interest with the least list
   * index sum. If there is a choice tie between answers, output all of them with
   * no order requirement. You could assume there always exists an answer.
   * 
   * Example 1:
   * Input: 
   * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
   * ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
   * Output: ["Shogun"]
   * 
   * Explanation: The only restaurant they both like is "Shogun".
   * 
   * Example 2:
   * Input:
   * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
   * ["KFC", "Shogun", "Burger King"] 
   * Output: ["Shogun"]
   * 
   * Explanation: The restaurant they both like and have the least index sum is
   * "Shogun" with index sum 1 (0+1).
   * 
   * Note:
   * 1. The length of both lists will be in the range of [1, 1000].
   * 2. The length of strings in both lists will be in the range of [1, 30].
   * 3. The index is starting from 0 to the list length minus 1.
   * 4. No duplicates in both lists.
   * 
   * https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
   */
  public String[] findRestaurant(String[] list1, String[] list2) {
    if(list1 == null || list2 == null || list1.length == 0 || list2.length == 0)
      return new String[] {};
    
    int leastSum = Integer.MAX_VALUE;
    HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
    for(int i = 0; i < list1.length; i++) {
      for(int j = 0; j < list2.length; j++) {
        if(list1[i].equals(list2[j])) {
          if(!map.containsKey(i+j)) {
            map.put(i+j, new ArrayList<String>());
          }
          map.get(i+j).add(list1[i]);
          leastSum = Math.min(leastSum, i+j);
        }
      }
    }
    String[] result = new String[map.get(leastSum).size()];
    return map.get(leastSum).toArray(result);
  }
}
