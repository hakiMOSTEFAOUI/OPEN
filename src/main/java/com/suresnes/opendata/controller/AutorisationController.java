package com.suresnes.opendata.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suresnes.opendata.dto.Autorisation;

@RestController
@RequestMapping(AutorisationController.AUTORISATION_URI)
public class AutorisationController {
	
	public static final String AUTORISATION_URI = "od/auto";
	
	@RequestMapping(value="{autorisationNumber}")
	public Autorisation getAutorisation(@PathVariable final int autorisationNumber){
		Autorisation auto = new Autorisation();
		auto.setNumber(autorisationNumber);
		//auto.setRue(New Rue"Boulevard Henri Sellier");
		return auto;
		
	}

}
