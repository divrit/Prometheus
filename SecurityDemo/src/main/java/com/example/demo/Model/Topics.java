package com.example.demo.Model;

import javax.persistence.Entity;

@Entity
public class Topics {
    
	@javax.persistence.Id
	private Integer id;
	private String Name;
	private String Any;
	
	
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
	public String getAny() {
		return Any;
	}
	public void setAny(String any) {
		Any = any;
	}
	public Topics(Integer id, String name, String any) {
		super();
		this.id = id;
		Name = name;
		Any = any;
	}
	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
