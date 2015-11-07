package com.mystuff.saveddefinitions.dto;

import com.mystuff.saveddefinitions.model.Definition;

public class DefinitionDto {

	private Integer id;
	private String name;
	private String definition;
	
	public DefinitionDto(Definition definition){
		this.id = definition.getId();
		this.name = definition.getName();
		this.definition = definition.getDefinition();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
}
