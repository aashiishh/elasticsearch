package com.app.elasticsearch;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestAPI {

	@GetMapping("/hello")
	public String Welcome() {
		return "Hello SpringBoot";
	}

	@GetMapping("/time")
	public String getTime() {
		return LocalDateTime.now().toString();
	}

}