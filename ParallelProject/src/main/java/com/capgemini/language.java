package com.capgemini;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import java.util.*;


@Entity
public class language {
	@Id private int language_id;
	private String name;
	private String last_update;
	
	
	
	@OneToMany
	private Set<film> film;
	
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_update() {
		return last_update;
	}
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	
	
	
	
	
	

}
