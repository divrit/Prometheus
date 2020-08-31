package com.example.demo.BusinessLogic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Course;
import com.example.demo.Repository.CourseRespository;

@Service
public class CourseService {
	@Autowired
	private CourseRespository repo;
	
	
	
	public List<Course> findByTopicId(int topicId){
		List<Course> list = new ArrayList<>();

//		Iterable<Course> s = repo.findByTopicsId(topicId);
		Iterable<Course> s = repo.findAll();
		s.forEach(a -> list.add(a));
		return list;
	}

	public List<Course> getAll() {
		List<Course> list = new ArrayList<>();

		Iterable<Course> s = repo.findAll();
		s.forEach(a -> list.add(a));
		return list;
	}

	public void send(Course course) {
		repo.save(course);
	}

	public void delete(int id) {
		repo.deleteById(id);
	}
	
	
	
	
}
