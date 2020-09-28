package com.andresonsouza.helpdesk.api.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.andresonsouza.helpdesk.api.enums.PriorityEnum;
import com.andresonsouza.helpdesk.api.enums.StatusEnum;

@Entity
@Table(name = "Tickets")
public class Ticket {
	
	@Id
	@Column(name = "User")
	private String id;
	
	private User user;
	
	private String title;
	
	private Integer number;
	
	private StatusEnum status;
	
	private PriorityEnum priority;
	
	private User assingedUser;
	
	private String description;
	
	private String image;
	
	private List<ChangeStatus> changes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public PriorityEnum getPriority() {
		return priority;
	}

	public void setPriority(PriorityEnum priority) {
		this.priority = priority;
	}

	public User getAssingedUser() {
		return assingedUser;
	}

	public void setAssingedUser(User assingedUser) {
		this.assingedUser = assingedUser;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<ChangeStatus> getChanges() {
		return changes;
	}

	public void setChanges(List<ChangeStatus> changes) {
		this.changes = changes;
	}
	
}
