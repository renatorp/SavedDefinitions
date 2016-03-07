package com.mystuff.saveddefinitions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mystuff.saveddefinitions.dto.DefinitionDto;
import com.mystuff.saveddefinitions.service.DefinitionsService;

@Controller
@RequestMapping(value = "/protected/definition")
public class DefinitionController {

	@Autowired
	private DefinitionsService definitionService;
	
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView welcome() {
        return new ModelAndView("definitionList");
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> listAll() {
        return returnListToUser(definitionService.listDefinitions());
    }
    
    private ResponseEntity<List<DefinitionDto>> returnListToUser(List<DefinitionDto> definitionList) {
        return new ResponseEntity<List<DefinitionDto>>(definitionList, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<DefinitionDto> find(@PathVariable("id") Integer id) {
    	DefinitionDto dto = new DefinitionDto();
    	dto.setDescription("Testeta");
    	return new ResponseEntity<DefinitionDto>(dto, HttpStatus.OK);
    }
}
