package fr.eni.demoWeb.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demoWeb.bll.PersonneServiceImpl;
import fr.eni.demoWeb.bo.Metier;


@Component //Définir le converter en tant que bean Spring
public class StringToMetierConverter implements Converter<String, Metier>{ //Implementer Converter

	private PersonneServiceImpl service;
	
	@Autowired
	public void setMetierService(PersonneServiceImpl service) {
		this.service = service;
	}
	
	@Override
	public Metier convert(String id) {
		Integer theid = Integer.parseInt(id);
		
		return service.findMetierById(theid);
	}

}
