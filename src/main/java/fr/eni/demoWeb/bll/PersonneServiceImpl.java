package fr.eni.demoWeb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.demoWeb.bo.Personne;
import fr.eni.demoWeb.dal.PersonneDAO;

@Service
public class PersonneServiceImpl implements PersonneService{
	private PersonneDAO personneDAO;
	
	@Autowired
	public PersonneServiceImpl(PersonneDAO personneDAO) {
		this.personneDAO = personneDAO;
	}
	
	@Override
	public List<Personne> findPersonnes() {
		// TODO Auto-generated method stub
		return this.personneDAO.selectPersonnes();
	}

	@Override
	public void addPersonne(Personne p) {
		this.personneDAO.addPersonne(p);
		
	}
	
	

}
