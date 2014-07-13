package com.rmkane.am.model.dto;

import java.io.Serializable;

public class BaseDto implements Serializable{
	private static final long serialVersionUID = -2856848361122225853L;

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}