package com.in28Minutes.springboot.myFirstWebapp.page;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	private Logger logger=LoggerFactory.getLogger(getClass());
	@RequestMapping("page-login")
	public String page(@RequestParam String name,ModelMap model) {
		model.put("name", name);
		logger.debug("Request Param is"+name);
		System.out.println(" Request Param name is  ="+ name);
		return "page";
	}

}
