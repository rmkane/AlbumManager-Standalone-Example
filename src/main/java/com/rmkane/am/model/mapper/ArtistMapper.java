package com.rmkane.am.model.mapper;

import com.rmkane.am.model.dto.ArtistDto;
import com.rmkane.am.model.entity.Artist;
import com.rmkane.am.util.mapper.ListMapper;
import com.rmkane.am.util.mapper.annotations.DestObjectMapper;

@DestObjectMapper(target=Artist.class)
public class ArtistMapper extends ListMapper<Artist, ArtistDto> {
	@Override
	public Artist map(Artist target, ArtistDto source) {
		if (source != null) {
			target.setId(source.getId());
			target.setName(source.getName());
		}
		
		return target;
	}
}