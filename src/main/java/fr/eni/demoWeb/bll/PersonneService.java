package fr.eni.demoWeb.bll;

import java.util.List;

import fr.eni.demoWeb.bo.Personne;

public interface PersonneService {
	public List<Personne> findPersonnes();
	
	public void addPersonne(Personne p);
}
