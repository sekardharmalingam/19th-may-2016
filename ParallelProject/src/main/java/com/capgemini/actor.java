package com.capgemini;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;
@Entity
public class actor {

	@Id private int actor_id;
	private String first_name;
	private String last_name;
	private Date last_update;
	@ManyToMany
	private Set<film> film;
	@JoinTable(name="film_actor",joinColumns={@JoinColumn (name="film_id", referencedColumnName="film_id")},
			inverseJoinColumns={@JoinColumn(name="actor_id",referencedColumnName="actor_id")})
	@Override
	public String toString() {
		return "actor [actor_id=" + actor_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", last_update=" + last_update + "]";
	}
	public int getActor_id() {
		return actor_id;
	}
	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
}

