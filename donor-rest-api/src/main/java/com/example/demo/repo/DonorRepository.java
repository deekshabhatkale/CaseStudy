package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Donor;


@Repository
public interface DonorRepository extends JpaRepository<Donor, Integer> {

	Donor findAllById(int n);
	public List<Donor> findBybloodgroup(String s);

}
