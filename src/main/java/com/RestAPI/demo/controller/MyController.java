package com.RestAPI.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestAPI.demo.entity.Book;
import com.RestAPI.demo.entity.LoginCredentialTuple;
import com.RestAPI.demo.entity.User;
import com.RestAPI.demo.services.BookService;
import com.RestAPI.demo.services.UserService;

@CrossOrigin
@RestController
public class MyController {
	@Autowired
	BookService BookList;
	
	@Autowired
	UserService userService;

	@GetMapping("/Home")
	public String Home() {	
		return "Hello Siddhu";
	}
	
	@GetMapping("/Books")
	public List<Book> getbook() {
		return BookList.getBooks();
		
	}
	
	@GetMapping("/Book/{BookId}")
	public Book getBookById(@PathVariable String BookId) {
		return BookList.getBookById(Long.parseLong(BookId));
		
	}
	
	@PostMapping("/Book")
	public String AddBook(@RequestBody Book book) {
		if(BookList.addBook(book) == true) {
			return "sucess";
		}else {
			return "Error Occur in Saving";
		}
		
	}
	
	@DeleteMapping("/DeleteBook/{Id}")
	public String DeleteBookById(@PathVariable String Id) {
		
		if(BookList.deleteBookById(Long.parseLong(Id))) {
			return "sucess";
		}else {
			return "Error occur in deleting";
		}
	}
	
	@PutMapping("/UpdateBook")
	public String UpdateBookDetail(@RequestBody Book book) {
		
		if(BookList.UpdateBookDetails(book)) {
			return "success";
		}
		else {
			return "Some Error occurred";
		}
		
	}
	
	@PostMapping("/Register")
	public String AddUser(@RequestBody User user) {
		try{
			userService.AddUserDetail(user);
			return "success";
		}catch(Exception e) {
			return "Error occured";
		}
		
	}
	
	@PostMapping("/Login")
	public User CheckUser(@RequestBody LoginCredentialTuple data) {
		try {
			User userDetial = userService.getUserDetial(data.getUsername(), data.getPassword());
			if(userDetial != null) {
				return userDetial;
			}else {
				return null;
			}
			}
		catch(Exception e) {
			return null;
		}	
		
	}
	

	
	

	
}
