package com.rmkane.am.model.repository;

import org.springframework.transaction.annotation.Transactional;

import com.rmkane.am.model.entity.Artist;

@Transactional
public class ArtistRepositoryImpl extends BaseRepositoryImpl<Artist>
		implements ArtistRepositoryCustom {
}