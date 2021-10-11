package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.College;
import com.example.demo.ifaces.CollegeRepository;

@Service
public class CollegeService {
	@Autowired
	private CollegeRepository repo;
	
	public List<College> findAll(){
		return this.repo.findAll();
	}
	public College add(College entity) {
		return this.repo.save(entity);
	}

}
