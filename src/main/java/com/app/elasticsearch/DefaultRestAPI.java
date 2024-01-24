package com.app.elasticsearch;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestAPI {
	
	private static final Logger LOG = LoggerFactory.getLogger(DefaultRestAPI.class);

	@GetMapping("/hello")
	public String Welcome() {
		LOG.info("Hello SpringBoot");
		return "Hello SpringBoot";
	}

	@GetMapping("/time")
	public String getTime() {
		LOG.info(LocalDateTime.now().toString());
		return LocalDateTime.now().toString();
	}

}
