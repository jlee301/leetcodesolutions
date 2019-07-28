package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode1138 {
  /*
   * https://leetcode.com/problems/alphabet-board-path/
   */
  public String alphabetBoardPath(String target) {
    HashMap<Character,int[]> map = new HashMap<>();
    map.put('a', new int[] {0,0});
    map.put('b', new int[] {0,1});
    map.put('c', new int[] {0,2});
    map.put('d', new int[] {0,3});
    map.put('e', new int[] {0,4});
    map.put('f', new int[] {1,0});
    map.put('g', new int[] {1,1});
    map.put('h', new int[] {1,2});
    map.put('i', new int[] {1,3});
    map.put('j', new int[] {1,4});
    map.put('k', new int[] {2,0});
    map.put('l', new int[] {2,1});
    map.put('m', new int[] {2,2});
    map.put('n', new int[] {2,3});
    map.put('o', new int[] {2,4});
    map.put('p', new int[] {3,0});
    map.put('q', new int[] {3,1});
    map.put('r', new int[] {3,2});
    map.put('s', new int[] {3,3});
    map.put('t', new int[] {3,4});
    map.put('u', new int[] {4,0});
    map.put('v', new int[] {4,1});
    map.put('w', new int[] {4,2});
    map.put('x', new int[] {4,3});
    map.put('y', new int[] {4,4});
    map.put('z', new int[] {5,0});
    
    StringBuilder sb = new StringBuilder();
    char prev = 'a';
    int[] prevCoord = new int[] {0,0};
    for(int i = 0; i < target.length(); i++) {
      char next = target.charAt(i);
      int[] nextCoord = map.get(next);
      int xDiff = nextCoord[0] - prevCoord[0]; // Determines how many UP/DOWN
      int yDiff = nextCoord[1] - prevCoord[1]; // Determines how many LEFT/RIGHT
      
      // if previous letter is z, then move up first
      if(prev == 'z') {
        for(int x = 0; x < Math.abs(xDiff); x++) {
          sb.append('U');
        }
        helper(0, yDiff, sb);
      }
      // if next letter is z, then move left first
      else if(next == 'z') {
        for(int y = 0; y < Math.abs(yDiff); y++) {
          sb.append('L');
        }
        helper(xDiff, 0, sb);
      }
      else {
        helper(xDiff, yDiff, sb);
      }
  
      sb.append('!');
      prev = next;
      prevCoord = nextCoord;
    }
    return sb.toString();
  }
  
  private void helper(int xDiff, int yDiff, StringBuilder sb) {
    for(int x = 0; x < Math.abs(xDiff); x++) {
      sb.append(xDiff < 0 ? 'U' : 'D');
    }
    
    for(int y = 0; y < Math.abs(yDiff); y++) {
      sb.append(yDiff < 0 ? 'L' : 'R');
    }
  }
}
