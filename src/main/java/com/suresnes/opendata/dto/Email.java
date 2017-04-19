package com.suresnes.opendata.dto;

public class Email implements java.io.Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String destinataire;
	private String email;
	public String getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
