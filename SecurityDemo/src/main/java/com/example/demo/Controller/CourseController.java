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

import io.micrometer.core.annotation.Timed;

@Controller
@ResponseBody
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService  service;
	

	@Timed(
			value="Divrit.getListOfCourses",
			histogram = true
			
			)
	@GetMapping
	 public List<Course> getAll() {
	return service.getAll();
		
	}
	
	@PostMapping
	 public void send(@RequestBody Course course) {
	 service.send(course);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Course course, @PathVariable int id) {
		course.setId(id);
		 service.update(course);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
	
	

}
