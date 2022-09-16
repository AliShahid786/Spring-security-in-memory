package com.example.security.springsecuritypractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/user")
	public String getString() {
		return "hi user";
	}
	
	@GetMapping("/updateUser")
	public String updateUser() {
		return "user updated";
	}
	  @GetMapping("/")
	  public String home(){
	    return "Hello World !!";
	  }

	  @GetMapping("/public")
	  public String publicResource(){
	    return "Access allowed to all !!";
	  }
	  
	  @GetMapping("/delete") public String delete()
	    {
	        return "This is the delete request";
	    }
	  
	  @GetMapping("/detail") public String detail()
	    {
	        return "This is the detail request";
	    }
	
}
