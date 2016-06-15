package algorithms.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 
 * 
 * 
 * 		   Design a simplified version of Twitter where users can post
 *         tweets, follow/unfollow another user and is able to see the 10 most
 *         recent tweets in the user's news feed. Your design should support the
 *         following methods:
 * 
 *         postTweet(userId, tweetId): Compose a new tweet. getNewsFeed(userId):
 *         Retrieve the 10 most recent tweet ids in the user's news feed. Each
 *         item in the news feed must be posted by users who the user followed
 *         or by the user herself. Tweets must be ordered from most recent to
 *         least recent. follow(followerId, followeeId): Follower follows a
 *         followee. unfollow(followerId, followeeId): Follower unfollows a
 *         followee.
 * 
 *         Example:
 * 
 *         Twitter twitter = new Twitter();
 * 
 *         // User 1 posts a new tweet (id = 5). twitter.postTweet(1, 5);
 * 
 *         // User 1's news feed should return a list with 1 tweet id -> [5].
 *         twitter.getNewsFeed(1);
 * 
 *         // User 1 follows user 2. twitter.follow(1, 2);
 * 
 *         // User 2 posts a new tweet (id = 6). twitter.postTweet(2, 6);
 * 
 *         // User 1's news feed should return a list with 2 tweet ids -> [6,
 *         5]. // Tweet id 6 should precede tweet id 5 because it is posted
 *         after tweet id 5. twitter.getNewsFeed(1);
 * 
 *         // User 1 unfollows user 2. twitter.unfollow(1, 2);
 * 
 *         // User 1's news feed should return a list with 1 tweet id -> [5], //
 *         since user 1 is no longer following user 2. twitter.getNewsFeed(1);
 */


class Twitter {

	class Tweet{
		 int tweetId;
		 int timestatmp;
		
		public Tweet(int tweetId, int timestatmp) {
			this.tweetId = tweetId;
			this.timestatmp = timestatmp;
		}
	}
	/** Initialize your data structure here. */
	private Map<Integer, Set<Integer>> followsMap = new HashMap<>();
	private Map<Integer, List<Tweet>> tweetMap = new HashMap<>();
	private static int counter=0;
	public Twitter() {
		followsMap = new HashMap<>();
		tweetMap = new HashMap<>();
	}

	/** Compose a new tweet. */
	public void postTweet(int userId, int tweetId) {
		if (!tweetMap.containsKey(userId)) {
			tweetMap.put(userId, new ArrayList<>());
		}
		List<Tweet> tweets = tweetMap.get(userId);
		tweets.add(new Tweet(tweetId, counter++));
		tweetMap.put(userId, tweets);
	}

	/**
	 * Retrieve the 10 most recent tweet ids in the user's news feed. Each item
	 * in the news feed must be posted by users who the user followed or by the
	 * user herself. Tweets must be ordered from most recent to least recent.
	 */
	public List<Integer> getNewsFeed(int userId) {
		List<Integer> tweets = new ArrayList<>();
		Set<Integer> followers = followsMap.getOrDefault(userId, new HashSet<>());
		followers.add(userId); //Adding the root user as well
		PriorityQueue<Tweet> q = new PriorityQueue<>(new Comparator<Tweet>() {
			@Override
			public int compare(Tweet o1, Tweet o2) {
				return o2.timestatmp-o1.timestatmp;
			}
		});
		for (Integer user : followers) {
			if (tweetMap.containsKey(user)) {
				List<Tweet> tweetsPosted = tweetMap.get(user);
				System.out.println("tweets posted");
				tweetsPosted.forEach(i->System.out.println(i.tweetId));
				q.addAll(tweetsPosted);
			}
		}
		int i=0;
		while(!q.isEmpty() && i<10){
			tweets.add(q.poll().tweetId);
			i++;
		}
		return tweets;
	}

	/**
	 * Follower follows a followee. If the operation is invalid, it should be a
	 * no-op.
	 */
	public void follow(int followerId, int followeeId) {
		if (!followsMap.containsKey(followerId)) {
			followsMap.put(followerId, new HashSet<>());
		}
		Set<Integer> followersList = followsMap.get(followerId);
		followersList.add(followeeId);
		
		//followsMap.putIfAbsent(followeeId, new HashSet<>());
		//followsMap.get(followerId).add(followeeId);
		
	}

	/**
	 * Follower unfollows a followee. If the operation is invalid, it should be
	 * a no-op.
	 */
	public void unfollow(int followerId, int followeeId) {
		if (followsMap.containsKey(followerId)) {
			if (followsMap.get(followerId).contains(followeeId)) {
				followsMap.get(followerId).remove(followeeId);
			} else {
				/*System.out.println("Tweeter user : " + followeeId
						+ " is not being followed by " + followeeId);*/
			}
		} else {
			//System.out.println("User " + followerId + "does not exist!");
		}
	}
}

/**
 * @author Sandeep
 *
 */
public class DesignTwitter {
	public static void main(String args[]) {
		
		//["Twitter","postTweet","getNewsFeed","follow","postTweet","getNewsFeed","unfollow","getNewsFeed"]
		//[[],[1,5],[1],[1,2],[2,6],[1],[1,2],[1]]
		Twitter obj = new Twitter();
		obj.postTweet(1, 5);
		List<Integer> p = obj.getNewsFeed(1);
		p.forEach(i->System.out.println(i));
		obj.follow(1, 2);
		obj.postTweet(2, 6);
		List<Integer> q = obj.getNewsFeed(1);
		q.forEach(i->System.out.println(i));
		obj.unfollow(1, 2);
		List<Integer> r = obj.getNewsFeed(1);
		r.forEach(i->System.out.println(i));
		
	}
}