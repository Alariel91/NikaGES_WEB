package com.mony.nikages.dao;

import java.util.logging.Logger;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Local
@Stateless
public class ClienteDAO {
	@PersistenceContext(unitName = "opensigadUnit")
	public EntityManager em = null;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public static final Logger logger = Logger.getLogger(ClienteDAO.class
			.getName());
	
	public ClienteDAO() {
		
	}

}
