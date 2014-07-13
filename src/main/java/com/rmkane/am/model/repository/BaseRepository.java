package com.rmkane.am.model.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.rmkane.am.model.entity.BaseEntity;

public interface BaseRepository<T extends BaseEntity> extends
		CrudRepository<T, Long>, Serializable {
}
