package com.SpringBoot.DSATopicsApp.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBoot.DSATopicsApp.Entity.Topics;

//To mention it's working as service class used for implementaion on service layer
@Service
public class TopicServiceImpl implements TopicService {

	List<Topics> list;
	
	public TopicServiceImpl() {
		list = new ArrayList<>();
		list.add(new Topics(101, " Array ", "This is Array Data structure"));
		list.add(new Topics(119, " Linked List ", "This is Linked List Data structure"));
		
	}

	@Override
	public List<Topics> getTopics() {
		
		return list;
	}

	@Override
	public Topics getTopics(long topicId) {
	
		Topics t = null;
		
		for(Topics t1 : list) {
			
			if(t1.getId()==topicId){
				
				t = t1;
				break;
			}
		}
		return t;
	}

	@Override
	public Topics addTopic(Topics t1) {
		
		list.add(t1);
		return t1;
	}

	@Override
	public Topics updateTopic(Topics t1) {
		
		list.forEach(e ->{
			
			if(e.getId()== t1.getId()) {
				e.setName(t1.getName());
				e.setDescription(t1.getDescription());
			}
				
		});
		
		
		return t1;
	}

}
