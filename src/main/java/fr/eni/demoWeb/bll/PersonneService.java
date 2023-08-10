package fr.eni.demoWeb.bll;

import java.util.List;

import fr.eni.demoWeb.bo.Metier;
import fr.eni.demoWeb.bo.Personne;

public interface PersonneService {
	public List<Personne> findPersonnes();
	
	public void addPersonne(Personne p);
	
	public List<Metier> findMetiers();

	Metier findMetierById(Integer id);
}
