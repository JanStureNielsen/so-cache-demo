package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class DemoHandler {
	private final DemoService service;

	public String hello(String who) {
		long start = System.nanoTime();
		String response = service.hello(who);
		long end = System.nanoTime();

		System.out.println("hello.....: " + (end-start) + " nanos");

		return response;
	}

	public String hellooo(String who) throws InterruptedException {
		long start = System.nanoTime();
		String response = service.hellooo(who);
		long end = System.nanoTime();

		System.out.println("hellooo...: " + (end-start) + " nanos");

		return response;
	}

}
