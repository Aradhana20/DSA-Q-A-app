package com.SpringBoot.DSATopicsApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.DSATopicsApp.Entity.Topics;
import com.SpringBoot.DSATopicsApp.Services.TopicService;

@RestController
public class MyController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome to DSA Application";
	}
	
	//Get the Topics
	
	@GetMapping("/topics")
	public List<Topics> getTopics(){
		
		return this.topicService.getTopics();
	}
	
	
	//topics/{topicId} to make the topicId dynamic
	@GetMapping("/topics/{topicId}")
	public Topics getTopics(@PathVariable String topicId) {
		return this.topicService.getTopics(Long.parseLong(topicId));
		
	}
	
	// to ADD new topic in Topics
	@PostMapping("/topics")
	public Topics addTopic(@RequestBody Topics t1) {
		return this.topicService.addTopic(t1);
	}
	
	@PutMapping("/topics")
	public Topics updateTopic(@RequestBody Topics t2) {
		
		return this.topicService.updateTopic(t2);
	}

}
