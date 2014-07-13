package com.rmkane.am.util.mapper;

import java.util.ArrayList;
import java.util.List;

public abstract class ListMapper<T, U> extends Mapper<T, U> implements
		CollectionMapper<T, U, List<U>> {
	public List<T> map(List<U> sourceObjects) {
		if (sourceObjects != null) {
			List<T> targetObjects = new ArrayList<T>();

			for (U source : sourceObjects) {
				T target = map(source);

				if (target != null) {
					targetObjects.add(target);
				}
			}

			return targetObjects;
		}

		return null;
	}

	public List<T> map(Iterable<U> sourceObjects) {
		return map((List<U>) sourceObjects);
	}
}
