package com.mystuff.saveddefinitions.dto;

import com.mystuff.saveddefinitions.model.Definition;

public class DefinitionDto {

	private Integer id;
	private String name;
	private String definition;
	private String description;
	private String tag;
	
	public DefinitionDto(Definition definition){
		this.id = definition.getId();
		this.name = definition.getName();
		this.definition = definition.getDefinition();
		this.description = definition.getDescription();
		this.tag = definition.getTag();
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

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
}
