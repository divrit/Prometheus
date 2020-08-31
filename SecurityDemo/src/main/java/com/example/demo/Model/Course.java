package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	
	@javax.persistence.Id
	private int Id;
	private String Name;
	private String Description;
	@ManyToOne
	private Topics topics;
	
	public Course(int id, String name, String description, Topics topics) {
		super();
		Id = id;
		Name = name;
		Description = description;
		this.topics = topics;
	}

	public Topics getTopics() {
		return topics;
	}

	public void setTopics(Topics topics) {
		this.topics = topics;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
