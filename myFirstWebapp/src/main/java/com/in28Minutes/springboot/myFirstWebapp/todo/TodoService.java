package com.in28Minutes.springboot.myFirstWebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TodoService {

	private static List<Todo> todos=new ArrayList();
	private static int todoCount=0;
	static {
		todos.add(new Todo(++todoCount,"in28Minutes","Learn Dev0ps",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoCount,"in28Minutes","Learn AWS",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++todoCount,"in28Minutes","Learn AZURE",LocalDate.now().plusYears(3),false));
		
	}
	public List<Todo> findByUsername(String username){
		return todos;
	}
	public void addTodo(String username,String description,LocalDate targetDate,boolean done) {
		Todo todo=new Todo(++todoCount,username,description,targetDate,done);
		todos.add(todo);
		
	}

}
