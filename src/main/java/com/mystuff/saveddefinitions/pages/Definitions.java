package com.mystuff.saveddefinitions.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.mystuff.saveddefinitions.model.Definition;
import com.mystuff.saveddefinitions.service.DefinitionsService;


public class Definitions {

	@Property
	@Persist
	private List<Definition> definitionList;

	@Property
	private Definition defValue;
	
	@Inject
	private DefinitionsService definitionsService;
	
	void onActivate() {
		definitionList = definitionsService.listDefinitions();
		System.out.println("zap!!");
	}
	
}
