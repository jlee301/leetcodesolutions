package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0999;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0999 {
  @Test
  public void testProblemCase1() {
    char[][] board = { { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', 'p', '.', '.', '.', '.' },
                       { '.', '.', '.', 'R', '.', '.', '.', 'p' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' },
                       { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', 'p', '.', '.', '.', '.' },
                       { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' } };
    
    LeetCode0999 solution = new LeetCode0999();
    Assert.assertEquals(3, solution.numRookCaptures(board));
  }
  
  @Test
  public void testProblemCase2() {
    char[][] board = { { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
                       { '.', 'p', 'p', 'B', 'p', 'p', '.', '.' }, 
                       { '.', 'p', 'B', 'R', 'B', 'p', '.', '.' },
                       { '.', 'p', 'p', 'B', 'p', 'p', '.', '.' }, 
                       { '.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
                       { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' } };
    
    LeetCode0999 solution = new LeetCode0999();
    Assert.assertEquals(0, solution.numRookCaptures(board));
  }

  @Test
  public void testProblemCase3() {
    char[][] board = { { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', 'p', '.', '.', '.', '.' },
                       { '.', '.', '.', 'p', '.', '.', '.', '.' }, 
                       { 'p', 'p', '.', 'R', '.', 'p', 'B', '.' },
                       { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', 'B', '.', '.', '.', '.' },
                       { '.', '.', '.', 'p', '.', '.', '.', '.' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' } };
    
    LeetCode0999 solution = new LeetCode0999();
    Assert.assertEquals(3, solution.numRookCaptures(board));
  }

  @Test
  public void testProblemCase4() {
    char[][] board = { { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' },
                       { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', 'R', '.', '.', '.', '.' },
                       { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' },
                       { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' } };
    
    LeetCode0999 solution = new LeetCode0999();
    Assert.assertEquals(0, solution.numRookCaptures(board));
  }

  @Test
  public void testProblemCase5() {
    char[][] board = { { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' },
                       { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' },
                       { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' },
                       { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                       { '.', '.', '.', '.', '.', '.', '.', '.' } };
    
    LeetCode0999 solution = new LeetCode0999();
    Assert.assertEquals(0, solution.numRookCaptures(board));
  }
}
