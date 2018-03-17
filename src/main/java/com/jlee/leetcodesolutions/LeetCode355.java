package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public class LeetCode355 {
  class Twitter {
    private HashMap<Integer, HashSet<Integer>> userFollows;
    private LinkedHashMap<Integer, Integer> tweets;
    
    /** Initialize your data structure here. */
    public Twitter() {
      userFollows = new HashMap<>();
      tweets = new LinkedHashMap<>();
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
      if(!userFollows.containsKey(userId))
        userFollows.put(userId, new HashSet<>());
      if(!tweets.containsKey(tweetId))
        tweets.put(tweetId, userId);
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in
     * the news feed must be posted by users who the user followed or by the user
     * herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
      if(!userFollows.containsKey(userId))
        userFollows.put(userId, new HashSet<>());
      List<Integer> feed = new ArrayList<>();
      List<Integer> tempList = new ArrayList<>(tweets.keySet());
      for(int i = tempList.size()-1, count = 0; i >= 0 && count < 10; i--) {
        int key = tempList.get(i);
        int id = tweets.get(key);
        if(userId == id || userFollows.get(userId).contains(id)) {
          feed.add(key);
          count++;
        }
      }
      return feed;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a
     * no-op.
     */
    public void follow(int followerId, int followeeId) {
      if(!userFollows.containsKey(followerId))
        userFollows.put(followerId, new HashSet<>());
      userFollows.get(followerId).add(followeeId);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a
     * no-op.
     */
    public void unfollow(int followerId, int followeeId) {
      if(!userFollows.containsKey(followerId))
        userFollows.put(followerId, new HashSet<>());
      userFollows.get(followerId).remove(followeeId);
    }
  }
}
