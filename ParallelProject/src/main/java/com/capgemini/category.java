package com.capgemini;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class category {
	@Id private int category_id;
	private String name;
	private String last_name;
	
	@OneToMany(mappedBy="category")
	private Set<film> film;

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Set<film> getFilm() {
		return film;
	}

	public void setFilm(Set<film> film) {
		this.film = film;
	}
	
	

}
