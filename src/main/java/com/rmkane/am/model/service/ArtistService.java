package com.rmkane.am.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmkane.am.model.dto.ArtistDto;
import com.rmkane.am.model.entity.Artist;
import com.rmkane.am.model.mapper.ArtistDtoMapper;
import com.rmkane.am.model.mapper.ArtistMapper;
import com.rmkane.am.model.repository.ArtistRepository;

@Service
public class ArtistService implements ArtistLocal {
	@Autowired
	private ArtistRepository repo;
	@Autowired
	private ArtistMapper mapper;
	@Autowired
	private ArtistDtoMapper dtoMapper;
	
	public ArtistDto getArtist(long id) {
		return dtoMapper.map(repo.findOne(id));
	}

	public List<ArtistDto> retrieveArtists() {
		return dtoMapper.map(repo.findAll());
	}

	public ArtistDto saveArtist(ArtistDto artist) {
		Artist entity = mapper.map(artist);
		entity = repo.save(entity);
		return dtoMapper.map(entity);
	}
}
