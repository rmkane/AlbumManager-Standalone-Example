package com.rmkane.am.model.mapper;

import com.rmkane.am.model.dto.ArtistDto;
import com.rmkane.am.model.entity.Artist;
import com.rmkane.am.util.mapper.ListMapper;
import com.rmkane.am.util.mapper.annotations.DestObjectMapper;

@DestObjectMapper(target=ArtistDto.class)
public class ArtistDtoMapper extends ListMapper<ArtistDto, Artist> {
	@Override
	public ArtistDto map(ArtistDto target, Artist source) {
		if (source != null) {
			target.setId(source.getId());
			target.setName(source.getName());
		}
		
		return target;
	}
}