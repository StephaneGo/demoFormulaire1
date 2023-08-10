package fr.eni.demoWeb.dal;

import java.util.List;

import fr.eni.demoWeb.bo.Metier;
import fr.eni.demoWeb.bo.Personne;

public interface PersonneDAO {
	public List<Personne> selectPersonnes();
	
	public void addPersonne(Personne p);

	public List<Metier> selectMetiers();

	public Metier findMetierById(Integer id);
}
