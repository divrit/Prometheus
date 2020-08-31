package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.BusinessLogic.CourseService;
import com.example.demo.Model.Course;

@Controller
@ResponseBody
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService  service;
	
	
	@GetMapping("/topic/{id}")
	public List<Course> getByTopic(@PathVariable int id){
		return service.findByTopicId(id);
	}
	
	@GetMapping
	 public List<Course> getAll() {
	return service.getAll();
		
	}
	
	@PostMapping
	 public void send(@RequestBody Course course) {
	 service.send(course);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Course course) {
		 service.send(course);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
	
	

}
