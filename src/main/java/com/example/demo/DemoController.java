package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor
public class DemoController {
	private final DemoHandler handler;

	@GetMapping("/hello")
	public String hello(String who) {
		return handler.hello(who);
	}

	@GetMapping("/hellooo")
	public String helloSlow(String who) throws InterruptedException {
		return handler.hellooo(who);
	}

}
