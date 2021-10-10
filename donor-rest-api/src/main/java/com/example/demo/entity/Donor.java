package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="donor")
public class Donor {

	@Id
	@Column(name="id")
	int id;
	@Column(name="donorname")
	String donorname;
	@Column(name="age")
	int age;
	@Column(name="bloodgroup")
	String bloodgroup;
	@Column(name="areacode")
	int areacode;
	@Column(name="dateofdonating")
	LocalDate dateofdonating;

}
