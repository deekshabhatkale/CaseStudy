package com.training.demo.main;

import com.training.demo.Student;

public class Application {
	
	public static void main(String[] args) {
		Student student1=new Student(101,"rakesh",88);
		System.out.println(student1.getMarkScored());
		System.out.println(student1.getRollNumber());
	}

}
