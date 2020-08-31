package com.example.demo.BusinessLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.Topics;
import com.example.demo.Repository.TopicsRepository;

@org.springframework.stereotype.Service
public class TopicsService {
	
	@Autowired
	private TopicsRepository repo;
	
	
	public List<Topics> getAll(){
		List<Topics> list=new ArrayList<>();
		
		repo.findAll().forEach(e -> list.add(e));;
		
		return list;
		
		
	}
	
	public void Save(Topics topic) {
		repo.save(topic);
	}
	
	public Topics getById(int id) {
		Optional<Topics> o= repo.findById(id);
		if(o.isPresent())
		return o.get();
		else
			return new Topics();
	}
	
	public void delete(int id) {
		repo.deleteById(id);;
		
	}
	
	

}
