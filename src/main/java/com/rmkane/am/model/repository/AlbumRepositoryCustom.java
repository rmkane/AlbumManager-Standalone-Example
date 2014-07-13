package com.rmkane.am.model.repository;

import java.util.List;

import com.rmkane.am.model.entity.Album;

public interface AlbumRepositoryCustom {
	List<Album> retrieveAllAlbums();
	Album saveStandalone(Album album);
}
