package com.in28Minutes.springboot.myFirstWebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {
//	@RequestMapping("say-hello")
//	@ResponseBody
//	public String sayHello() {
//		return "Hi! My Name Is Rishabh";
//	}
	@RequestMapping("say-hello-jsp")
	public String sayHello() {
		return "sayHello";
	}

}
