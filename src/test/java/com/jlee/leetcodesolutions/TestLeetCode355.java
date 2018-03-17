package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode355;
import com.jlee.leetcodesolutions.LeetCode355.Twitter;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode355 {
  @Test
  public void testTwitterProblemCase() {
    LeetCode355 leet = new LeetCode355();
    Twitter solution = leet.new Twitter();
    solution.postTweet(1, 5);
    List<Integer> result = solution.getNewsFeed(1);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(5, (int) result.get(0));
    solution.follow(1, 2);
    solution.postTweet(2, 6);
    result = solution.getNewsFeed(1);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(6, (int) result.get(0));
    Assert.assertEquals(5, (int) result.get(1));
    solution.unfollow(1, 2);
    result = solution.getNewsFeed(1);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(5, (int) result.get(0));
  }
  
  @Test
  public void testTwitterOrdering() {
    LeetCode355 leet = new LeetCode355();
    Twitter solution = leet.new Twitter();
    solution.postTweet(1, 5);
    solution.postTweet(1, 3);
    List<Integer> result = solution.getNewsFeed(1);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(3, (int) result.get(0));
    Assert.assertEquals(5, (int) result.get(1));
  }

  @Test
  public void testTwitterReturnLast10() {
    LeetCode355 leet = new LeetCode355();
    Twitter solution = leet.new Twitter();
    solution.postTweet(1, 1);
    solution.postTweet(1, 2);
    solution.postTweet(1, 3);
    solution.postTweet(1, 4);
    solution.postTweet(1, 5);
    solution.postTweet(1, 6);
    solution.postTweet(1, 7);
    solution.postTweet(1, 8);
    solution.postTweet(1, 9);
    solution.postTweet(1, 10);
    solution.postTweet(1, 11);
    List<Integer> result = solution.getNewsFeed(1);
    Assert.assertEquals(10, result.size());
    Assert.assertEquals(11, (int) result.get(0));
    Assert.assertEquals(10, (int) result.get(1));
    Assert.assertEquals(9, (int) result.get(2));
    Assert.assertEquals(8, (int) result.get(3));
    Assert.assertEquals(7, (int) result.get(4));
    Assert.assertEquals(6, (int) result.get(5));
    Assert.assertEquals(5, (int) result.get(6));
    Assert.assertEquals(4, (int) result.get(7));
    Assert.assertEquals(3, (int) result.get(8));
    Assert.assertEquals(2, (int) result.get(9));
  }

  @Test
  public void testTwitterSearchBeforePosting() {
    LeetCode355 leet = new LeetCode355();
    Twitter solution = leet.new Twitter();
    List<Integer> result = solution.getNewsFeed(1);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testTwitterFollowBeforePosting() {
    LeetCode355 leet = new LeetCode355();
    Twitter solution = leet.new Twitter();
    solution.follow(1, 2);
    List<Integer> result = solution.getNewsFeed(1);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testTwitterUnfollowBeforePosting() {
    LeetCode355 leet = new LeetCode355();
    Twitter solution = leet.new Twitter();
    solution.unfollow(1, 2);
    List<Integer> result = solution.getNewsFeed(1);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testTwitterTweetIdAlreadyExist() {
    LeetCode355 leet = new LeetCode355();
    Twitter solution = leet.new Twitter();
    solution.postTweet(1, 1);
    solution.postTweet(1, 2);
    solution.postTweet(1, 1);
    List<Integer> result = solution.getNewsFeed(1);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(2, (int) result.get(0));
    Assert.assertEquals(1, (int) result.get(1));
  }
}
