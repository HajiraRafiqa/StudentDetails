package com.cg.sbstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
	
	@RestController
	public class controller {
	    @GetMapping("/")
	    String return1(){
	        return "Hello World";
	    }
	}

}
