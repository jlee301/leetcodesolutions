package com.jlee.leetcodesolutions;

public class LeetCode190 {
  /*
   * Reverse bits of a given 32 bits unsigned integer.
   * 
   * For example, given input 43261596 (represented in binary as
   * 00000010100101000001111010011100), return 964176192 (represented in binary as
   * 00111001011110000010100101000000).
   * 
   * https://leetcode.com/problems/reverse-bits/description/
   */
  public int reverseBits(int n) {
    /* 
     * i=2
     *     n = 0000 0000 1010 0101 0000 0111 1010 0111
     *     1 = 0000 0000 0000 0000 0000 0000 0000 0001
     * n & 1 = 0000 0000 0000 0000 0000 0000 0000 0001
     * 
     * result= 0000 0000 0000 0000 0000 0000 0000 0000 (0)
     * n & 1 = 0000 0000 0000 0000 0000 0000 0000 0001 (1)
     * result= 0000 0000 0000 0000 0000 0000 0000 0001 (1)
     *   +n&1
     *   
     * n>>>1 = 0000 0000 0101 0010 1000 0011 1101 0011 (insert 0 bit leftmost 1 time -- shift)
     * result= 0000 0000 0000 0000 0000 0000 0000 0010 (shift bit pattern to right)
     *   <<1
     *   
     * i=3
     *     n = 0000 0000 0101 0010 1000 0011 1101 0011
     *     1 = 0000 0000 0000 0000 0000 0000 0000 0001
     * n & 1 = 0000 0000 0000 0000 0000 0000 0000 0001
     * 
     * result= 0000 0000 0000 0000 0000 0000 0000 0010 (2)
     * n & 1 = 0000 0000 0000 0000 0000 0000 0000 0001 (1)
     * result= 0000 0000 0000 0000 0000 0000 0000 0011 (3)
     *   +n&1
     *   
     * n>>>1 = 0000 0000 0010 1001 0100 0001 1110 1001 (insert 0 bit leftmost 1 time -- shift)
     * result= 0000 0000 0000 0000 0000 0000 0000 0110 (shift bit pattern to right)
     *   <<1
     */
    int result = 0;
    for(int i = 0; i < 32; i++) {
      result = result + (n & 1);

      // right shift
      //    0000 0010 1001 0100 0001 1110 1001 1100
      // -->0000 0001 0100 1010 0000 1111 0100 1110
      n = n >> 1;
      if(i < 31) {
        // left shift
        //    0000 0000 0000 0000 0000 0000 0000 0011
        // -->0000 0000 0000 0000 0000 0000 0000 0110
        result = result << 1;
      }
    }
    return result;
  }
}
