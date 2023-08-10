package fr.eni.demoWeb.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.demoWeb.bo.Metier;
import fr.eni.demoWeb.bo.Personne;

//@Component
@Repository
public class PersonneDAOImpl implements PersonneDAO{
	List<Personne> personnes;
	
	List<Metier> metiers;
	
	
	public PersonneDAOImpl() {
		personnes = new ArrayList<Personne>();
		metiers = new ArrayList<Metier>();
		metiers.add(new Metier(1, "vigneron.ne"));
		metiers.add(new Metier(2, "bucheron.ne"));
		metiers.add(new Metier(3, "esteticen.ne"));
	}
	
	@Override
	public List<Personne> selectPersonnes() {
		
		return personnes;
	}

	@Override
	public void addPersonne(Personne p) {
		personnes.add(p);
		
	}

	@Override
	public List<Metier> selectMetiers() {
		// TODO Auto-generated method stub
		return metiers;
	}

	@Override
	public Metier findMetierById(Integer id) {
		for(Metier m: metiers) {
			if(m.getId()==id) {
				return m;
			}
		}
		return null;
	}

}
