package com.suresnes.opendata.dto;

import java.util.Date;

public class Autorisation {
	
	@Override
	public String toString() {
		return "Autorisation [Number=" + Number + "]";
	}

	private int Number;
	private Rue[] rues;
	private String typeAutorisation;
	private Date PetititionDate;
	private String additionnalInfoTypeAutorisation;
	private Date startDateAutorisation;
	private Date endDateAutorisation;
	private Article [] articles;
	private Double Price;
	private String title;
	private boolean topValid;
	private Loi[] lois;
	
	
	
	

	

	public Rue[] getRues() {
		return rues;
	}

	public void setRues(Rue[] rues) {
		this.rues = rues;
	}

	public String getTypeAutorisation() {
		return typeAutorisation;
	}

	public void setTypeAutorisation(String typeAutorisation) {
		this.typeAutorisation = typeAutorisation;
	}

	public Date getPetititionDate() {
		return PetititionDate;
	}

	public void setPetititionDate(Date petititionDate) {
		PetititionDate = petititionDate;
	}

	public String getAdditionnalInfoTypeAutorisation() {
		return additionnalInfoTypeAutorisation;
	}

	public void setAdditionnalInfoTypeAutorisation(String additionnalInfoTypeAutorisation) {
		this.additionnalInfoTypeAutorisation = additionnalInfoTypeAutorisation;
	}

	public Date getStartDateAutorisation() {
		return startDateAutorisation;
	}

	public void setStartDateAutorisation(Date startDateAutorisation) {
		this.startDateAutorisation = startDateAutorisation;
	}

	public Date getEndDateAutorisation() {
		return endDateAutorisation;
	}

	public void setEndDateAutorisation(Date endDateAutorisation) {
		this.endDateAutorisation = endDateAutorisation;
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isTopValid() {
		return topValid;
	}

	public void setTopValid(boolean topValid) {
		this.topValid = topValid;
	}

	public Loi[] getLois() {
		return lois;
	}

	public void setLois(Loi[] lois) {
		this.lois = lois;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}
	
	

}
