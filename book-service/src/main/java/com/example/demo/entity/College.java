package com.example.demo.entity;



import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;




@Entity
@Table(name = "college_details")



@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class College {

@Id
@Column(name ="id")
int id;

@Column(name ="collegeName")
String collegeName;

@Column(name ="principalNam")
String principalName;

@Column(name ="location")
String location;



}