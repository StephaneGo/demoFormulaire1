package fr.eni.demoWeb.dal;

import java.util.List;

import fr.eni.demoWeb.bo.Personne;

public interface PersonneDAO {
	public List<Personne> selectPersonnes();
	
	public void addPersonne(Personne p);
}
