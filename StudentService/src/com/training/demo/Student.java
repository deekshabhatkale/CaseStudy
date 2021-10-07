package com.training.demo;


public class Student {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	int rollNumber;
	String studentName;
	double markScored;
	public Student(int rollNumber, String studentName, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.markScored = markScored;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", markScored=" + markScored
				+ "]";
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	

}