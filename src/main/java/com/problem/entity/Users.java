package com.problem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int userId;
	
	public long created;
	public int karma;
	public String about;
	
	

	@OneToMany(mappedBy="users")
	@JsonIgnore
	public List<Item> submitted;

	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public int getKarma() {
		return karma;
	}

	public void setKarma(int karma) {
		this.karma = karma;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Item> getSubmitted() {
		return submitted;
	}

	public void setSubmitted(List<Item> submitted) {
		this.submitted = submitted;
	}

	public Users(int userId, long created, int karma, String about, List<Item> submitted) {
		super();
		this.userId = userId;
		this.created = created;
		this.karma = karma;
		this.about = about;
		this.submitted = submitted;
	}
	
	public Users() {
		super();
	}

	
}
