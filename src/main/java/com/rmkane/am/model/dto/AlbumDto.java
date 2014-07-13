package com.rmkane.am.model.dto;

public class AlbumDto extends BaseDto {
	private static final long serialVersionUID = -4200146598587928907L;

	private String title;
	private ArtistDto artist;
	private Integer releaseYear;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArtistDto getArtist() {
		return artist;
	}

	public void setArtist(ArtistDto artist) {
		this.artist = artist;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "AlbumDto [id=" + getId() + ", title=" + title + ", artist="
				+ artist + ", releaseYear=" + releaseYear + "]";
	}
}
