package com.mutyala.springboot.fullstack.todo;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
	
	@Autowired
    private  TodoRepository stockRepository;

    public List<Todo> findAll() {
        return stockRepository.findAll();
    }

    public List<Todo> saveAll(List<Todo> todos) {
        return stockRepository.saveAll(todos);
    }
}
