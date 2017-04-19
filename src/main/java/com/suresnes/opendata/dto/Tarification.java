package com.suresnes.opendata.dto;

public class Tarification {

	
	private String type;
	private Double tarif;
	private int id;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getTarif() {
		return tarif;
	}
	public void setTarif(Double tarif) {
		this.tarif = tarif;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
