package com.suresnes.opendata.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suresnes.opendata.dto.Arrete;


@RestController
@RequestMapping(ArreteController.ARRETE_URI)
public class ArreteController {
	
	public static final String ARRETE_URI = "od/arrete";
	
	
	@RequestMapping(value="{autorisationNumber}")
	public List <Arrete> getAutorisation(@PathVariable final int autorisationNumber){
		List<Arrete> listArretes = new ArrayList<Arrete>();
		//Si numéro d'autorisation n'est pas null
		Arrete ar = new Arrete();
		ar.setNumber(autorisationNumber);
	
		listArretes.add(ar);
		return listArretes;
		
	}


}
