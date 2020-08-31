package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Topics {
    
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Name;
	private String Review;
	
	
	public String getReview() {
		return Review;
	}
	public void setReview(String review) {
		Review = review;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Topics(Integer id, String name, String any) {
		super();
		this.id = id;
		Name = name;
		Review = any;
	}
	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
