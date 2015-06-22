package com.mystuff.saveddefinitions.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mystuff.saveddefinitions.dao.DefinitionDao;
import com.mystuff.saveddefinitions.model.Definition;

@Repository("definitionDao")
public class DefinitionDaoImpl implements DefinitionDao {
	
	@Resource
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Definition> listDefinitions() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Definition.class);
		return (List<Definition>)criteria.list();
	};
}
