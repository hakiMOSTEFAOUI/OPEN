package com.suresnes.opendata.controller;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.suresnes.opendata.dto.Tarification;
import com.suresnes.opendata.util.HibernateUtil;

@Controller

public class ApplicationController {

public static final String APPLICATION_URI = "app";
	
/*
	@RequestMapping(value="{id}")
	public Tarification getTarif(@PathVariable final int id){
		
	    Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		Tarification tari = new Tarification();
	//	tari.setTarif(tarif);
		tari.setId(id);
		tari.setTarif(1800.60);
		tari.setType("Tarification rurale");
		//auto.setRue(New Rue"Boulevard Henri Sellier");
		session.save(tari);
		session.getTransaction().commit();
		return tari;
		
	}*/
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String main(){
		
	return "main";	
	}
	
	//	System.out.println("Maven + Hibernate + Oracle");
	//	Session session = HibernateUtil.getSessionFactory().openSession();

	//	session.beginTransaction();
		
//		Arrete arrete = new Arrete();
//		arrete.setNumber(5);
//		arrete.setTypeAutorisation("typeAutorisation 1");
//		Calendar calendar = new GregorianCalendar(2013,2,13);	
//		arrete.setStartDateAutorisation(calendar.getTime());
//		arrete.setEndDateAutorisation(new Date());
//		arrete.setPetititionDate(new Date());
//		arrete.setAdditionnalInfoTypeAutorisation("Complement d'infos");
//		arrete.setTarif(400.90);
//		arrete.setTitle("Le titre de l'arrêté municipal");
//		arrete.setTopValid(0);
		
//		Tarification tarif = new Tarification();
//		tarif.setId(3);
//		tarif.setTarif(1540.60);
//		tarif.setType("Tarification rurale");
		
		
	//	TypeAutorisation type = new TypeAutorisation();
	//	type.setId(1);
	//	type.setDescription("Ma description du type d'autorisation");
		
	//	Article article = new Article();
	//	article.setId(1);
	//	article.setCategory("categorie 1");
	//	article.setTypeArticle("3eme type d'article");
		
	//	Societe societe = new Societe();
	//	societe.setSiret(12345);
	//	societe.setNom("VEOTIS");
	//	societe.setAdresse("40 boulevard Henri Sellier");
	//	societe.setTel("0659221975");
	//	societe.setRepresentant("MOSTEFAOUI HAKIM");
		
	//	Rue rue = new Rue();
	//	rue.setId(1);
	//	rue.setRue("Rue des chênes");
	//	rue.setStartNumber(50);
	//	rue.setEndNumber(60);
		
	//	Loi loi = new Loi();
	//	loi.setId(1);
	//	loi.setDescription("Ma première loi");
	//	Email email = new Email();
	//	email.setEmail("hakim.mostefaoui@gmail.com");
	//	email.setDestinataire("Moi meme");

	//	session.save(tarif);
	//	session.getTransaction().commit();
}
