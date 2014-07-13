package com.rmkane.am.util.mapper;

import java.util.Collection;
import java.util.List;

public interface CollectionMapper<T, U, S extends Collection<U>> {
	public abstract List<T> map(S sourceObjects);
}
