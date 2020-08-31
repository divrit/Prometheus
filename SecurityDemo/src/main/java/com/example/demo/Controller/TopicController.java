package com.example.demo.Controller;

import java.util.Arrays;
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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BusinessLogic.TopicsService;
import com.example.demo.Model.Topics;

import io.micrometer.core.annotation.Timed;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/topics")
public class TopicController {

	@Autowired
	private TopicsService BusinessLogic;

	@Timed(
			value = "divrit.getAllTopics",
			histogram = true
			
			)
	
	@GetMapping
	public List<Topics> getAll() {
		return BusinessLogic.getAll();

	}

	@PostMapping()
	public void addTopic(@RequestBody Topics topic) {
		BusinessLogic.Save(topic);
	}

	@GetMapping("{id}")
	public Topics getOne(@PathVariable Integer id) {
		return BusinessLogic.getById(id);
	}

	@PutMapping("/{id}")
	public void Update(@RequestBody Topics topic, @PathVariable Integer id) {
		BusinessLogic.Save(topic);
	}

	@DeleteMapping("/{id}")
	public void deleteTopic(@PathVariable int id) {
		BusinessLogic.delete(id);
	}

}
