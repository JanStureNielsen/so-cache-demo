package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor
public class DemoController {
	private final DemoHandler handler;

	@GetMapping("/{id}")
	public DemoEntity getById(@PathVariable("id") Long id) {
		return handler.getById(id);
	}

	@PostMapping("/")
	public DemoEntity save(DemoEntity demoEntity) {
		return handler.save(demoEntity);
	}

}
