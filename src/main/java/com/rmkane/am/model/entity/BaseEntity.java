package com.rmkane.am.model.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
	public abstract long getId();
}
