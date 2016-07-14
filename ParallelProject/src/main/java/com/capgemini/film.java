package com.capgemini;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class film {
	@Id private int film_id;
	private String description;
	private String release_year;
	private String language_id;
	private String rental_duration;
	private String rental_rate;
	private String length;
	private String replacement_cost;
	private String rating;
	private String special_features;
	private String last_update;
	@ManyToMany 
	private Set<actor> actor;
	@JoinTable(name="film_category",joinColumns={@JoinColumn (name="film_id", referencedColumnName="film_id")},
			inverseJoinColumns={@JoinColumn(name="category_id",referencedColumnName="category_id")})
	@JoinColumn(name="language_id")
	private language language;
	private String title;
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public Set<actor> getActor() {
		return actor;
	}
	public void setActor(Set<actor> actor) {
		this.actor = actor;
	}
	public language getLanguage() {
		return language;
	}
	public void setLanguage(language language) {
		this.language = language;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRelease_year() {
		return release_year;
	}
	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}
	public String getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(String language_id) {
		this.language_id = language_id;
	}
	public String getRental_duration() {
		return rental_duration;
	}
	public void setRental_duration(String rental_duration) {
		this.rental_duration = rental_duration;
	}
	public String getRental_rate() {
		return rental_rate;
	}
	public void setRental_rate(String rental_rate) {
		this.rental_rate = rental_rate;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getReplacement_cost() {
		return replacement_cost;
	}
	public void setReplacement_cost(String replacement_cost) {
		this.replacement_cost = replacement_cost;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSpecial_features() {
		return special_features;
	}
	public void setSpecial_features(String special_features) {
		this.special_features = special_features;
	}
	public String getLast_update() {
		return last_update;
	}
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
}

