package com.suresnes.opendata;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.suresnes.opendata.dto.Arrete;
import com.suresnes.opendata.dto.Article;
import com.suresnes.opendata.dto.Email;
import com.suresnes.opendata.dto.Loi;
import com.suresnes.opendata.dto.Rue;
import com.suresnes.opendata.dto.Societe;
import com.suresnes.opendata.dto.Tarification;
import com.suresnes.opendata.dto.TypeAutorisation;
import com.suresnes.opendata.util.HibernateUtil;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
	
		

	}

}
