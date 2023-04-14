package com.example.e2ejenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {
	@GetMapping()
	public String helloJenkins() {
		return "welcome to jenkins demo";
	}

}
