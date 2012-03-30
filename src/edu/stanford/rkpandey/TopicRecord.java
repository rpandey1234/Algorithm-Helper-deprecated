package edu.stanford.rkpandey;

import java.util.ArrayList;

public class TopicRecord { 
	public String topic;
	public String subtopics;
	//The resource int for the image
	public int image;
	public Class<?> cls;
	// Add image here
	
	public TopicRecord(String topic, String subtopics, Class<?> cls, int image) {
		this.topic = topic;
		this.subtopics = subtopics;
		this.cls = cls;
		this.image = image;
	}
	
	public static ArrayList<TopicRecord> getItems() {
		ArrayList<TopicRecord> topics = new ArrayList<TopicRecord>();
		topics.add(new TopicRecord("Graph Algorithms", "Details: Connectivity, Dijkstra", GraphActivity.class, R.drawable.graph));
        topics.add(new TopicRecord("Sorting Algorithms", "Details: Mergesort, Quicksort", SortingActivity.class, R.drawable.sorting));
        topics.add(new TopicRecord("Binary Search Trees", "", BSTActivity.class, R.drawable.bst));
        topics.add(new TopicRecord("Linked Lists", "Details: Traversal, Combining", LinkedListActivity.class, R.drawable.linkedlist));
        return topics;
	}
	
	/**
	 * Tried to get filtering by words working, but this doesn't do it
	 * @param that
	 * @return
	 */
	public int compareTo(TopicRecord that) {
		final int EQUAL = 0;
		if (this == that) return EQUAL;
		return this.topic.compareTo(that.topic);
	}
}
