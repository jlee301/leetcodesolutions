package com.jlee.leetcodesolutions;

public class LeetCode477 {
  /*
   * The Hamming distance between two integers is the number of positions at which
   * the corresponding bits are different.
   * 
   * Now your job is to find the total Hamming distance between all pairs of the
   * given numbers.
   * 
   * Example:
   * Input: 4, 14, 2
   * Output: 6
   * Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is
   * 0010 (just showing the four bits relevant in this case). So the answer will
   * be: HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) =
   * 2 + 2 + 2 = 6.
   * 
   * Note:
   * 1. Elements of the given array are in the range of 0 to 10^9
   * 2. Length of the array will not exceed 10^4.
   */
  public int totalHammingDistance(int[] nums) {
    if(nums == null || nums.length < 2)
      return 0;
    
    // 10^9 is max number, so no more than 31 bits
    // We are summing the 1 bits for each number at every bit position
    int[] countOnes = new int[31];
    for(int num : nums) {
      for(int i = 0; i < 31; i++)
        countOnes[i] += (num >> i) & 1;
    }
    
    int result = 0;
    for(int count : countOnes)
      // (# of 1's) * (# of 0's) for each particular bit position returns # of XOR on
      // that bit position
      result += count * (nums.length - count);
    return result;
  }
  /*
  public int totalHammingDistance(int[] nums) {
    int result = 0;
    for(int i = 0; i < nums.length-1; i++){
      for(int j = i+1; j < nums.length; j++)
        result += Integer.bitCount(nums[i] ^ nums[j]);
    }
    return result;
  }
  */
}
