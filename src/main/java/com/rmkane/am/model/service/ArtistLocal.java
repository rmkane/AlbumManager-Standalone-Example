package com.rmkane.am.model.service;

import java.util.List;

import com.rmkane.am.model.dto.ArtistDto;

public interface ArtistLocal {
	ArtistDto getArtist(long id);
	List<ArtistDto> retrieveArtists();
	ArtistDto saveArtist(ArtistDto artist);
}
