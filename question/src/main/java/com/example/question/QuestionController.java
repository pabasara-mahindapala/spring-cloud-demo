package com.example.question;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

	
	@GetMapping("/question") // maps the random http get request to rand method, which
	// returns a Rand object.
	public Question quest(
            @RequestParam(value = "stem", defaultValue = "What is ") String stem,
			@RequestParam(value = "operator", defaultValue = "*") String operator,
            @RequestParam(value = "opa", defaultValue = "0") String opa,
            @RequestParam(value = "opb", defaultValue = "0") String opb
            ) {
		// Dependency injection of the Random subclass SecureRandom 
		 return 
		     new Question(stem, operator, opa, opb);
		    

	}
	
}
