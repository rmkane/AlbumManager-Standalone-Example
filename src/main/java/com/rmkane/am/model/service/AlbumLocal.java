package com.rmkane.am.model.service;

import java.util.List;

import com.rmkane.am.model.dto.AlbumDto;

public interface AlbumLocal {
	List<AlbumDto> retrieveAll();
	AlbumDto getAlbum(long id);
	AlbumDto save(AlbumDto standalone);
}
