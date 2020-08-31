package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Course;
@Repository
public interface CourseRespository extends CrudRepository<Course, Integer>{
	public List<Course> findByTopicsId(int id);

}
