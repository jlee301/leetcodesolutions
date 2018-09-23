package com.jlee.leetcodesolutions;

import java.util.TreeMap;

public class LeetCode911 {
  /*
   * In an election, the i-th vote was cast for persons[i] at time times[i].
   * 
   * Now, we would like to implement the following query function:
   * TopVotedCandidate.q(int t) will return the number of the person that was
   * leading the election at time t.
   * 
   * Votes cast at time t will count towards our query. In the case of a tie, the
   * most recent vote (among tied candidates) wins.
   * 
   * https://leetcode.com/problems/online-election/description/
   */
  private TreeMap<Integer,Integer> map = new TreeMap<>();
  
  public LeetCode911(int[] persons, int[] times) {
    // votes[] is used to keep tally of all the votes
    int[] votes = new int[persons.length];
    int maxVotes = 0;
    int maxPerson = 0;
    
    // Process the votes in the order they come in
    // 1. Keep track of who has highest vote per entry
    for(int i = 0; i < persons.length; i++) {
      votes[persons[i]]++;
      if(maxVotes <= votes[persons[i]]) {
        maxVotes = votes[persons[i]];
        maxPerson = persons[i];
        
        // Only store who has the highest votes at times[i] when there is a change or
        // tie in the highest votes
        map.put(times[i], maxPerson);
      }
    }
  }
  
  public int q(int t) {
    return map.get(map.floorKey(t));
  }
}
