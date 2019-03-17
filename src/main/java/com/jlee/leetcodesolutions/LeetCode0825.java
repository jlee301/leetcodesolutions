package com.jlee.leetcodesolutions;

public class LeetCode0825 {
  /*
   * Some people will make friend requests. The list of their ages is given and
   * ages[i] is the age of the ith person.
   * 
   * Person A will NOT friend request person B (B != A) if any of the following
   * conditions are true:
   * 1. age[B] <= 0.5 * age[A] + 7
   * 2. age[B] > age[A]
   * 3. age[B] > 100 && age[A] < 100
   * 
   * Otherwise, A will friend request B.
   * 
   * Note that if A requests B, B does not necessarily request A. Also, people
   * will not friend request themselves.
   * 
   * How many total friend requests are made?
   * 
   * Notes:
   * 1. 1 <= ages.length <= 20000.
   * 2. 1 <= ages[i] <= 120.
   * 
   * https://leetcode.com/problems/friends-of-appropriate-ages/description/
   */
  public int numFriendRequests(int[] ages) {
    if(ages == null || ages.length <= 1)
      return 0;
    
    // Count the ages
    int[] count = new int[121];
    for(int age : ages)
      count[age]++;
    
    int requests = 0;
    for(int A = 0; A < 121; A++) {
      for(int B = 0; B < 121; B++) {
        if(B <= 0.5*A+7) continue;
        if(B > A) continue;
        // I don't think this case is plausible with B > A already there
        // if(B > 100 && A < 100) continue;
        
        if(A == B) 
          // The minus 1 is to not friend yourself.
          requests += (count[A]-1) * count[B];
        else
          requests += count[A] * count[B];        
      }
    }
    return requests;
  }
}
