package com.problem;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.problem.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

	List<Item> findFirst10ByOrderByScoreDesc();
	
	List<Item>findTop10ByIdOrderByIdDesc(int id);
	


}
