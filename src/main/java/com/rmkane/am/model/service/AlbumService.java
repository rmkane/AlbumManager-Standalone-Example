package com.rmkane.am.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmkane.am.model.dto.AlbumDto;
import com.rmkane.am.model.entity.Album;
import com.rmkane.am.model.mapper.AlbumDtoMapper;
import com.rmkane.am.model.mapper.AlbumMapper;
import com.rmkane.am.model.repository.AlbumRepository;

@Service
public class AlbumService implements AlbumLocal {
	@Autowired
	private AlbumRepository repo;
	@Autowired
	private AlbumMapper mapper;
	@Autowired
	private AlbumDtoMapper dtoMapper;
	
	public List<AlbumDto> retrieveAll() {
		return dtoMapper.map(repo.retrieveAllAlbums());
	}

	public AlbumDto getAlbum(long id) {
		return dtoMapper.map(repo.findOne(id));
	}
	
	public AlbumDto save(AlbumDto standalone) {
		Album entity = mapper.map(standalone);
		entity = repo.saveStandalone(entity);
		return dtoMapper.map(entity);
	}
}
