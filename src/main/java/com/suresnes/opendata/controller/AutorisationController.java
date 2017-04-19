package com.suresnes.opendata.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suresnes.opendata.dto.Autorisation;

@RestController
@RequestMapping(AutorisationController.AUTORISATION_URI)
public class AutorisationController {
	
	public static final String AUTORISATION_URI = "od/auto";
	
	
	@RequestMapping(value="{autorisationNumber}")
	public List <Autorisation> getAutorisation(@PathVariable final int autorisationNumber){
		List<Autorisation> listAuto = new ArrayList<Autorisation>();
		//Si numéro d'autorisation n'est pas null
		Autorisation auto = new Autorisation();
		auto.setNumber(autorisationNumber);
		//auto.setRue(New Rue"Boulevard Henri Sellier");
		
		//Si le numéro d'autorisation est null, on affiche toutes les autorisation
		
		//Query
		listAuto.add(auto);
		return listAuto;
		
	}


}
