package com.harsh.springboot.myfirstwebapp.todo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService1 {

	private static List<Todo1> todos= new ArrayList<>();
	static {
		todos.add(new Todo1(1, "Lucky", "Python Programming", LocalDate.now().plusYears(1), false));
		todos.add(new Todo1(2, "Lucky", "C Programming", LocalDate.now().plusYears(2), false));
		todos.add(new Todo1(3, "Lucky", "C++ Programming", LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo1> findByUserName(String username) {
		return todos;
	}
}
