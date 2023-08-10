package fr.eni.demoWeb.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.demoWeb.bo.Personne;

//@Component
@Repository
public class PersonneDAOImpl implements PersonneDAO{
	List<Personne> personnes;
	
	
	public PersonneDAOImpl() {
		personnes = new ArrayList<Personne>();
	}
	
	@Override
	public List<Personne> selectPersonnes() {
		
		return personnes;
	}

	@Override
	public void addPersonne(Personne p) {
		personnes.add(p);
		
	}

}
