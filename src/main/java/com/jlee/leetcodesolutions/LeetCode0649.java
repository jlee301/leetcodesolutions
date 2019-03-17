package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0649 {
  /*
   * In the world of Dota2, there are two parties: the Radiant and the Dire.
   * 
   * The Dota2 senate consists of senators coming from two parties. Now the senate
   * wants to make a decision about a change in the Dota2 game. The voting for
   * this change is a round-based procedure. In each round, each senator can
   * exercise one of the two rights:
   * 1. Ban one senator's right:
   * A senator can make another senator lose all his rights in this and all the
   * following rounds.
   * 
   * 2. Announce the victory:
   * If this senator found the senators who still have rights to vote are all from
   * the same party, he can announce the victory and make the decision about the
   * change in the game.
   * 
   * Given a string representing each senator's party belonging. The character 'R'
   * and 'D' represent the Radiant party and the Dire party respectively. Then if
   * there are n senators, the size of the given string will be n.
   * 
   * The round-based procedure starts from the first senator to the last senator
   * in the given order. This procedure will last until the end of voting. All the
   * senators who have lost their rights will be skipped during the procedure.
   * 
   * Suppose every senator is smart enough and will play the best strategy for his
   * own party, you need to predict which party will finally announce the victory
   * and make the change in the Dota2 game. The output should be Radiant or Dire.
   * 
   * https://leetcode.com/problems/dota2-senate/description/
   */
  public String predictPartyVictory(String senate) {
    // Store index position of each senator in their queue
    Queue<Integer> rQueue = new LinkedList<>();
    Queue<Integer> dQueue = new LinkedList<>();
    for(int i = 0; i < senate.length(); i++) {
      if(senate.charAt(i) == 'R')
        rQueue.add(i);
      else
        dQueue.add(i);
    }
    
    // Whichever senator has the lower index position:
    //  1. They want to ban the next opposing party member that has not voted yet
    //  2. If all voted, then you want to vote off the next senator.
    //
    // The senator that has voted: 
    //  1. They are reinserted to the end of their parties 
    //  2. Senators ahead of them in the queue possibly not have voted yet.
    while(!rQueue.isEmpty() && !dQueue.isEmpty()) {
      int r = rQueue.poll();
      int d = dQueue.poll();
      // Using 10000 offset as problem statement says string will not be bigger
      if(r < d)
        rQueue.add(r + 10000);
      else
        dQueue.add(d + 10000);
    }
    return rQueue.isEmpty() ? "Dire" : "Radiant";
  }
}
