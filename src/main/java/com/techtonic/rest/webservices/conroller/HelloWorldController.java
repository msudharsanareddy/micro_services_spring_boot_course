package com.techtonic.rest.webservices.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.techtonic.rest.webservices.model.HellowWorldModel;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String hellowWorld() {
		return "hello world...!";
	}

	@GetMapping(path = "/hello-world-model")
	public HellowWorldModel hellowWorldModel() {
		HellowWorldModel hellowWorldModel = new HellowWorldModel();
		hellowWorldModel.setGreeting("hello world...!");
		return hellowWorldModel;
	}
	
	@GetMapping(path = "/hello-world/{greeting}")
	public HellowWorldModel hellowWorldPathVariable(@PathVariable String greeting) {
		HellowWorldModel hellowWorldModel = new HellowWorldModel();
		hellowWorldModel.setGreeting("hello world...! "+greeting);
		return hellowWorldModel;
	}
}
