package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public class BookService {
	@Autowired
	private Book book;
	List<String> list; 
	public Book getBookById(int id) {
		book.setBookId(200);
		book.setBookName("Head First java");
		book.setAuthor("kathy siene ");
		
		if(id==1) {
			book.setBookId(203);
			book.setBookName("Effective java");
			book.setAuthor("Bruce Erickel ");
			
		}
		return this.book;
	}
	public Book findAll(){
		return this.book;
	}

}
