package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    // Map list1 Strings to their indices for faster searches
    HashMap<String,Integer> map = new HashMap<>();
    for(int i = 0; i < list1.length; i++)
      map.put(list1[i], i);
    
    int min = Integer.MAX_VALUE;
    int[] sum = new int[list2.length];
    Arrays.fill(sum, -1);
    // sum[i] = sum of indices of list2[i]
    // sum[i] = -1 no matches found
    
    for(int i = 0; i < list2.length; i++) {
      if(map.containsKey(list2[i])) {
        sum[i] = i + map.get(list2[i]);
        min = Math.min(min, sum[i]);
      }
    }
    List<String> result = new ArrayList<>();
    for(int i = 0; i < sum.length; i++) {
      if(sum[i] == min)
        result.add(list2[i]);
    }
    String[] ans = new String[result.size()];
    ans = result.toArray(ans);
    return ans;
  }
}
