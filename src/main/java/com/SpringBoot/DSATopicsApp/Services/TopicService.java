package com.SpringBoot.DSATopicsApp.Services;

import java.util.List;

import com.SpringBoot.DSATopicsApp.Entity.Topics;

public interface TopicService {

	//Created interface for loose coupling
	public List<Topics> getTopics();
	
	
	public Topics getTopics(long topicId);
	
	public Topics addTopic(Topics t1);


	public Topics updateTopic(Topics t2);
	
	
}
