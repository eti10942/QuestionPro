package com.problem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	@Column(name = "is_deleted")
	public boolean deleted;

	@Column(name = "item_type")
	public String type;

	@ManyToOne
	@JoinColumn(name = "parent")
	@JsonIgnore
	public Item parent;

	@Column(name = "item_by")
	public String by;

	@Column(name = "item_created")
	public long created;

	@Column(name = "item_text")
	public String text;

	@Column(name = "is_dead")
	public boolean dead;

	@Column(name = "item_poll")
	public int poll;

	@OneToMany(mappedBy = "parent")
	@JsonIgnore
	public List<Item> kids;

	@Column(name = "item_url")
	public String url;

	@Column(name = "poll_score")
	public int score;

	@Column(name = "item_title")
	public String title;
	
	@ManyToOne
	@JoinColumn(name="users_id")
	public Users users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Item getParent() {
		return parent;
	}

	public void setParent(Item parent) {
		this.parent = parent;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public int getPoll() {
		return poll;
	}

	public void setPoll(int poll) {
		this.poll = poll;
	}

	public List<Item> getKids() {
		return kids;
	}

	public void setKids(List<Item> kids) {
		this.kids = kids;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Item(int id, boolean deleted, String type, Item parent, String by, long created, String text, boolean dead,
			int poll, List<Item> kids, String url, int score, String title, Users users) {
		super();
		this.id = id;
		this.deleted = deleted;
		this.type = type;
		this.parent = parent;
		this.by = by;
		this.created = created;
		this.text = text;
		this.dead = dead;
		this.poll = poll;
		this.kids = kids;
		this.url = url;
		this.score = score;
		this.title = title;
		this.users = users;
	}
	
	public Item() {
		super();
	}

    
	
}
