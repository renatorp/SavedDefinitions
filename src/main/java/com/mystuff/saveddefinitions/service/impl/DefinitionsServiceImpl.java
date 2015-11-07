package com.mystuff.saveddefinitions.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mystuff.saveddefinitions.dao.DefinitionDao;
import com.mystuff.saveddefinitions.dto.DefinitionDto;
import com.mystuff.saveddefinitions.model.Definition;
import com.mystuff.saveddefinitions.service.DefinitionsService;

@Service("definitionsService")
public class DefinitionsServiceImpl implements DefinitionsService{

	@Autowired
	private DefinitionDao definitionDao;
	
	@Override
	public List<DefinitionDto> listDefinitions() {
		return buildResult(definitionDao.listDefinitions());
	}
	
	public List<DefinitionDto> buildResult(List<Definition> results) {
		List<DefinitionDto> dtos = new ArrayList<DefinitionDto>();
		for (Definition result : results) {
			dtos.add(new DefinitionDto(result));
		}
		return dtos;
	}
	
}
