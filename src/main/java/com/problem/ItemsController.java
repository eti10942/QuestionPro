package com.problem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.problem.entity.Item;

@RestController
@RequestMapping("/api")
public class ItemsController {
	
	@Autowired
	ItemsService itemsService;

	
	@GetMapping(value="/top-stories")
	public List<Item> topStories(){
    
		return itemsService.getTopStories();
	}
	
	@GetMapping("/{id}/comments")
	public List<Item> comments(@PathVariable int id ){
    
		return itemsService.getComments(id);
	}


	
}
	



