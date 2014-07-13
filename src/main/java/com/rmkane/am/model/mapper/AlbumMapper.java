package com.rmkane.am.model.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.rmkane.am.model.dto.AlbumDto;
import com.rmkane.am.model.entity.Album;
import com.rmkane.am.util.mapper.ListMapper;
import com.rmkane.am.util.mapper.annotations.DestObjectMapper;

@DestObjectMapper(target=Album.class)
public class AlbumMapper extends ListMapper<Album, AlbumDto> {
	@Autowired
	private ArtistMapper artistMapper;
	
	@Override
	public Album map(Album target, AlbumDto source) {
		if (source != null) {
			target.setId(source.getId());
			target.setTitle(source.getTitle());
			target.setReleaseYear(source.getReleaseYear());
			target.setArtist(artistMapper.map(source.getArtist()));
		}
		
		return target;
	}
}