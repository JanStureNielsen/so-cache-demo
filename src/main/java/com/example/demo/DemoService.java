package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Cacheable(cacheNames={"hello"})
	public String hello(String who) {
		return "Hello, " + who;
	}

	@Cacheable(cacheNames={"hellooo"})
	public String hellooo(String who) throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		return "Hello, " + who;
	}

}
