package com.rmkane.am.model.dto;

public class ArtistDto extends BaseDto {
	private static final long serialVersionUID = -4750528597246296668L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ArtistDto [id=" + getId() + ", name=" + name + "]";
	}
}