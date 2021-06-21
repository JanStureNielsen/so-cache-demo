package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class DemoHandler {
	private final DemoService service;

	public DemoEntity save(DemoEntity demoEntity) {
		return service.save(demoEntity);
	}

	public DemoEntity getById(Long id) {
		return service.getById(id);
	}

}
