package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0691 {
  /*
   * We are given N different types of stickers. Each sticker has a lowercase
   * English word on it.
   * 
   * You would like to spell out the given target string by cutting individual
   * letters from your collection of stickers and rearranging them.
   * 
   * You can use each sticker more than once if you want, and you have infinite
   * quantities of each sticker.
   * 
   * What is the minimum number of stickers that you need to spell out the target?
   * If the task is impossible, return -1.
   * 
   * https://leetcode.com/problems/stickers-to-spell-word/description/
   */
  public int minStickers(String[] stickers, String target) {
    int[] targetCount = new int[26];
    for(char ch : target.toCharArray())
      targetCount[ch - 'a']++;
    
    // charMap stores the index of the sticker that contains a specific character
    // stickersCount stores char count of every sticker
    HashMap<Character,HashSet<Integer>> charMap = new HashMap<>();
    int[][] stickersCount = new int[stickers.length][26];
    for(int i = 0; i < stickers.length; i++) {
      for(char ch : stickers[i].toCharArray()) {
        stickersCount[i][ch - 'a']++;
        if(!charMap.containsKey(ch))
          charMap.put(ch, new HashSet<>());
        charMap.get(ch).add(i);
      }
    }
    
    // BFS
    int count = 0;
    Queue<int[]> queue = new LinkedList<>();
    queue.add(targetCount.clone());
    outerloop: 
      while(!queue.isEmpty()) {
        int N = queue.size();
        for(int i = 0; i < N; i++) {
          int[] curr = queue.poll();
  
          // Check all characters, do we have more to find?
          int j = 0;
          for(; j < 26; j++)
            if(curr[j] > 0) break;          
          // All characters accounted for
          if(j == 26) return count;
          
          // Add next possible steps from where j stopped
          char key = (char) (j + 'a');
          // There is no sticker containing this character
          if(!charMap.containsKey(key)) 
            break outerloop;
          
          HashSet<Integer> set = charMap.get(key);
          for(int nextSticker : set) {
            int[] next = curr.clone();
            for(int k = 0; k < 26; k++)
              next[k] -= stickersCount[nextSticker][k];
            
            queue.add(next);
          }
        }
        count++;
      }
    return -1;
  }
}
