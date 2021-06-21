package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class DemoService {
	private final DemoEntityRepository repository;

	public DemoEntity save(DemoEntity demoEntity) {
		return repository.save(demoEntity);
	}

	public DemoEntity getById(Long id) {
		return repository.getById(id);
	}

}
