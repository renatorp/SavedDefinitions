package com.mystuff.saveddefinitions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/protected/partials")
public class AngularJSSpringController {

	@RequestMapping(value = "/definitionList")
	public String getDefinitionListPartial() {
		return "/definition-list";
	}

	@RequestMapping(value = "/definitionDetail")
	public String getDefinitionDetailPartial() {
		return "/definition-detail";
	}
}
