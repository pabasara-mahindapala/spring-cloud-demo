package com.example.rand.controller;

import com.example.rand.model.Rand;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandController {

	
	@GetMapping(value={"/random"}) // maps the random http get request to rand method, which
	// returns a Rand object.
	public Rand rand(@RequestParam(value = "bound", defaultValue = "100") String bound, // upper bound
			@RequestParam(value = "size", defaultValue = "50") String size, // number of ints
			@RequestParam(value = "origin", defaultValue = "0") String origin,
			@RequestParam(value = "secure", defaultValue = "false") String secure) {
		// Dependency injection of the Random subclass SecureRandom 
		 return secure.equals("true") ?
		     new Rand(new java.security.SecureRandom(), size, origin,bound):
		     new Rand(new java.util.Random(), size, origin,bound);

	}
	@GetMapping("/error")
	public String error() {
          return "Error in Rand";
	}
}