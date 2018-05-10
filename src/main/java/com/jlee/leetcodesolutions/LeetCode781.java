package com.jlee.leetcodesolutions;

public class LeetCode781 {
  /*
   * In a forest, each rabbit has some color. Some subset of rabbits (possibly all
   * of them) tell you how many other rabbits have the same color as them. Those
   * answers are placed in an array.
   * 
   * Return the minimum number of rabbits that could be in the forest.
   * 
   * Note:
   * 1. answers will have length at most 1000.
   * 2. Each answers[i] will be an integer in the range [0, 999].
   * 
   * https://leetcode.com/problems/rabbits-in-forest/description/
   */
  public int numRabbits(int[] answers) {
    if(answers == null || answers.length == 0)
      return 0;
    
    // Generate frequency of each result
    int[] counts = new int[1000];
    for(int ans : answers)
      counts[ans]++;
    
    int rabbits = 0;
    for(int i = 0; i < counts.length; i++) {
      if(counts[i] == 0) continue;
      
      // Find how many multiples of i+1 are there
      // ie [3,3,3,3,3] i = 3 --> counts[i] / i+1 == 5 / 4 == 1
      int multiples = counts[i] / (i+1);
      rabbits += (i+1) * multiples;
      
      // If the multiple is not dead even, then add one more
      // ie 5 % 4 != 0, so add +4 to result
      if(counts[i] % (i+1) != 0)
        rabbits += i+1;
    }
    return rabbits;
  }
}
