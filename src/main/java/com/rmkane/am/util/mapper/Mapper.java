package com.rmkane.am.util.mapper;

import com.rmkane.am.util.mapper.annotations.DestObjectMapper;

public abstract class Mapper<T, U> {

	private Class<T> targetType;

	public Mapper() {
		getTargetType();
	}

	public abstract T map(T target, U source);

	public T map(U source) {
		if (source == null) {
			return null;
		}

		return map(getNewTargetObject(), source);
	}

	public T getNewTargetObject() {
		try {
			return targetType.newInstance();
		} catch (Exception e) {
			throw new MappingException(
					"Could not instantiate new object of type: " + targetType,
					e);
		}
	}

	@SuppressWarnings("unchecked")
	public Class<T> getTargetType() {
		if (targetType == null) {
			try {
				DestObjectMapper objectMapper = this.getClass().getAnnotation(
						DestObjectMapper.class);

				if (objectMapper != null) {
					targetType = (Class<T>) objectMapper.target();
				}

				if (targetType == null) {
					throw new MappingException(
							"The following annotation is required to define a "
									+ "destination type: "
									+ DestObjectMapper.class);
				}
			} catch (MappingException e) {
				throw new MappingException(
						"Class type of target defined in the ObjectMapper "
								+ "annotation does not map the return type "
								+ "of this Mapper", e);
			}
		}

		return targetType;
	}
}
