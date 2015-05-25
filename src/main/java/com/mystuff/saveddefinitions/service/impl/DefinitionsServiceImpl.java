package com.mystuff.saveddefinitions.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mystuff.saveddefinitions.model.Definition;
import com.mystuff.saveddefinitions.service.DefinitionsService;

@Service("definitionsService")
public class DefinitionsServiceImpl implements DefinitionsService{

	@Override
	public List<Definition> listDefinitions() {
		return new ArrayList<Definition>(){{
			add(new Definition() {{
				setId(1);
				setName("Anti-pattern");
				setDefinition("An anti-pattern (or antipattern) is a common response to a recurring problem that is usually ineffective and risks being highly counterproductive. Examples: analisys paralisys, cargo culp programming, death march."+
"The AntiPattern may be the result of a manager or developer not knowing any better, not having sufficient knowledge or experience in solving a particular type of problem, or having applied a perfectly good pattern in the wrong context.");
			}});
			add(new Definition() {{
				setId(2);
				setName("Second level cache");
				setDefinition("This is apart from first level cache which is available to be used globally in session factory scope."+
"Second-level cache always associates with the Session Factory object. While running the transactions, in between it loads the objects at the Session Factory level, so that those objects will be available to the entire application, not bound to single user. Since the objects are already loaded in the cache, whenever an object is returned by the query, at that time no need to go for a database transaction.");
			}});
		}};
		
	}
	
}
