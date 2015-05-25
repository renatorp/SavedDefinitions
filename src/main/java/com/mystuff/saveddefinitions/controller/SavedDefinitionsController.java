package com.mystuff.saveddefinitions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mystuff.saveddefinitions.service.DefinitionsService;

@Controller
public class SavedDefinitionsController {

	@Autowired
	private DefinitionsService definitionsService;
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		definitionsService.listDefinitions();
		
		String message = "<br><div align='center'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is comming from CrunchifyHelloWorld.java **********<br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
}
