package com.problem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.problem.entity.Item;

@Service
public class ItemsService {
	
	@Autowired
	ItemRepository itemRepository;
	
	
	public List<Item> getTopStories(){
		
       return itemRepository.findFirst10ByOrderByScoreDesc();
	}
	
	public List<Item> getComments(int id){
		return itemRepository.findTop10ByIdOrderByIdDesc(id);
		
	}

}
