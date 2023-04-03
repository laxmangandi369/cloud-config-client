package com.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@Value("${auth0.domain}")
	public String domain;
	
	@Value("${auth0.client.id}")
	public String clientId;
	
	@GetMapping
	public String test() {
		return domain+"      --------------      "+clientId;
	}
}
