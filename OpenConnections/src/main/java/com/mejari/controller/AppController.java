package com.mejari.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
	@GetMapping("appData")
	public String testApp(@RequestParam(name="appName") String appName){
		return "Hello World";
		
	}
	
}
