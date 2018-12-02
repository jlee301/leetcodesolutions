package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode950 {
  /*
   * https://leetcode.com/problems/reveal-cards-in-increasing-order/
   */
  public int[] deckRevealedIncreasing(int[] deck) {
    Arrays.sort(deck);
    // Lets say we have four cards [1,2,3,4]
    // Lets recreate the order working with the highest first
    // --> 4 []
    // --> 3 [4] --> [3,4]
    // --> 2 [3,4] --> [2,4,3]
    // --> 1 [2,4,3] --> [1,3,2,4]
    // The bottom card of the queue is moved to the top before placing the next card
    // on top of the deck
    Deque<Integer> deque = new ArrayDeque<>();
    for(int i = deck.length-1; i >= 0; i--) {
      if(deque.isEmpty())
        deque.addFirst(deck[i]);
      else {
        deque.addFirst(deque.pollLast());
        deque.addFirst(deck[i]);
      }
    }
    
    int i = 0;
    int[] result = new int[deck.length];
    while(!deque.isEmpty())
      result[i++] = deque.pollFirst();
    
    return result;
  }
}
