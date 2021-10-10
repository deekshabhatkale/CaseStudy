package com.example.demo.service;

import java.util.List;

import com.example.demo.table.DonorCamp;

public interface DonorCampService {
	
	DonorCamp addCamp(DonorCamp camp);
//	DonorCamp searchbycode(int x);
	List<DonorCamp> getAll();
	List<DonorCamp> searchBygroup(int s);

}
