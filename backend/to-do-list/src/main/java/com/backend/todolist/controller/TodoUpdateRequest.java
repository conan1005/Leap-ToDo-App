package com.backend.todolist.controller;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TodoUpdateRequest {
	@NotEmpty(message = "Title is required")
	private String title;

	@NotEmpty(message = "Description is required")
	private String description;

	@NotNull(message = "Target date is required")
	private Date targetDate;
	
	protected TodoUpdateRequest() {
		
	}

	public TodoUpdateRequest(String title, String description, Date targetDate) {
		super();
		this.title = title;
		this.description = description;
		this.targetDate = targetDate;
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

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
}
