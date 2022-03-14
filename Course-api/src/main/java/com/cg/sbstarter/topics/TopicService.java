package com.cg.sbstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topics> topics = Arrays.asList(
			new Topics("A", "B", "C"),
			new Topics("E", "F", "G"),
			new Topics("I", "J", "K")
			);
	
	public List<Topics> getAllTopics()
	{
		return topics; 
	}
	

}
