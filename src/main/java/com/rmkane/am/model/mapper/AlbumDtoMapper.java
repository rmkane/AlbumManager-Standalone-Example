package com.rmkane.am.model.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.rmkane.am.model.dto.AlbumDto;
import com.rmkane.am.model.entity.Album;
import com.rmkane.am.util.mapper.ListMapper;
import com.rmkane.am.util.mapper.annotations.DestObjectMapper;

@DestObjectMapper(target=AlbumDto.class)
public class AlbumDtoMapper extends ListMapper<AlbumDto, Album> {
	@Autowired
	private ArtistDtoMapper artistDtoMapper;
	
	@Override
	public AlbumDto map(AlbumDto target, Album source) {
		if (source != null) {
			target.setId(source.getId());
			target.setTitle(source.getTitle());
			target.setReleaseYear(source.getReleaseYear());
			target.setArtist(artistDtoMapper.map(source.getArtist()));
		}
		
		return target;
	}
}