package com.comunicacion.openMRS.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class AtiendeCabecera {
	@Column(name = "encounter_id")
	private String encounter_id;
	@Column(name = "identifier")
	private String identifier;
	@Column(name = "person_id")
	private String person_id;
	@Column(name = "given_name")
	private String given_name;
	@Column(name = "family_name")
	private String family_name;
	public String getEncounter_id() {
		return encounter_id;
	}
	public void setEncounter_id(String encounter_id) {
		this.encounter_id = encounter_id;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getPerson_id() {
		return person_id;
	}
	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	public String getGiven_name() {
		return given_name;
	}
	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}
	public String getFamily_name() {
		return family_name;
	}
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	

}
