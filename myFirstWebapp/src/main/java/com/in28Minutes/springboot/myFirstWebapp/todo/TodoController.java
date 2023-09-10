package com.in28Minutes.springboot.myFirstWebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("list-todos")
	public String todoListing(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("in28Minutes");
		model.put("todos", todos);
		return "listTodo";
	}

	@RequestMapping(value="add-todos",method=RequestMethod.GET)
	public String addNewTodo() {
		return "todo";
	}
	
	
	@RequestMapping(value="add-todos",method=RequestMethod.POST)
	public String listNewTodo(ModelMap model,Todo todo) {
		Object username = model.get("name");
		todoService.addTodo((String) username, todo.getDescription(), LocalDate.now().plusYears(1), false);

		return "redirect:list-todos";
	}

}
