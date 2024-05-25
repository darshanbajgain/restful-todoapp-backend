package com.darshan.mytodobackend.todoappbackend.todo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.darshan.mytodobackend.todoappbackend.todo.respository.TodoJpaRepository;


@RestController
public class TodoJpaResource {

private TodoJpaRepository todoRepository; 
	
	public TodoJpaResource (TodoJpaRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
 
	
	@GetMapping("users/{username}/todos")
	public List<Todo> retrieveAllTodos(@PathVariable String username) {
			return todoRepository.findByUsername(username);
		}
	
	
	@GetMapping("users/{username}/todos/{id}")
	public Todo retrieveOneTodo(@PathVariable String username, @PathVariable int id) {
			return todoRepository.findById(id).get();
		}
		
	@DeleteMapping("users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable int id) {
		todoRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}
	   
	@PutMapping("users/{username}/todos/{id}")
	public Todo updateTodo(@PathVariable String username, @PathVariable int id, @RequestBody Todo todo) {
		todoRepository.save(todo);
			return todo;
		}
	
	@PostMapping("users/{username}/todos")
	public Todo createTodo(@PathVariable String username, @RequestBody Todo todo) {
		todo.setUsername(username);
		todo.setId(null);
		return todoRepository.save(todo);
			//Todo createTodo = todoRepository.addTodo(username, todo.getDescription(), todo.getTargetDate(), todo.isDone());
			//return createTodo;
		} 
	 		
	
	
}
