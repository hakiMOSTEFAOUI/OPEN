package com.suresnes.opendata.dto;

public class Societe {

	
	private int siret;
	private String nom;
	private String adresse;
	private String tel;
	private String representant;
	public int getSiret() {
		return siret;
	}
	public void setSiret(int siret) {
		this.siret = siret;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String address) {
		this.adresse = address;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRepresentant() {
		return representant;
	}
	public void setRepresentant(String representant) {
		this.representant = representant;
	}
	
	
	
}
