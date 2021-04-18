package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.stereotype.Component;

@WebEndpoint(id = "custom")
@Component
public class CustomEndPoint {

	
	@ReadOperation
	public String releaseInfo() {
	   return "version10";
	  }

}
