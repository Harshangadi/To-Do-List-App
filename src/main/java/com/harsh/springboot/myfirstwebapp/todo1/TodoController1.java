package com.harsh.springboot.myfirstwebapp.todo1;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController1 {

	private TodoService1 todoService1;
	
	
	public TodoController1(TodoService1 todoService1) {
		super();
		this.todoService1 = todoService1;
	}


	@RequestMapping("list-todos1")
	public String ListAllTodos1(ModelMap model1) {
		List<Todo1> todos=todoService1.findByUserName("Harsh");
		model1.addAttribute("todos", todos);
			return "listTodos";
	}
}
