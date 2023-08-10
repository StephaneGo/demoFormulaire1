package fr.eni.demoWeb.ihm;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.demoWeb.bll.PersonneService;
import fr.eni.demoWeb.bo.Personne;

@Controller
public class BonjourController {

	private PersonneService personneService;


	public BonjourController(PersonneService personneService) {
		super();
		this.personneService = personneService;
	}

	@GetMapping({ "", "/accueil"})
	public String accueil(Model modele) {
		modele.addAttribute("personne", new Personne("Votre nom", 1));
		modele.addAttribute("personnes", this.personneService.findPersonnes());
		modele.addAttribute("metiers", this.personneService.findMetiers());
		return "index";
	}
	
	@PostMapping("/accueil")
	public String traitFormulaire( Personne personne,
			Model modele
			             ) {

		this.personneService.addPersonne(personne);
		modele.addAttribute("personnes", this.personneService.findPersonnes());
		
		
		//return "index"; //Délégation de traitement = forward
		return "redirect:/accueil"; //Redirection !!!! STATUT HTTP : 301 ou 302
	}
	

}










