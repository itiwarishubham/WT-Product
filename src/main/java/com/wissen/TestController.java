package com.wissen;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {



	@GetMapping("/")
	public Map<String, String> healthCheck() {
		Map<String, String> response = new HashMap<>();
		response.put("status", "success");
		response.put("msg", "App is running");
		return response;
	}


}
