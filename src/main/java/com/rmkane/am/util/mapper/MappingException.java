package com.rmkane.am.util.mapper;

public final class MappingException extends RuntimeException {
	private static final long serialVersionUID = -2684631110268152273L;

	public MappingException() {
		super();
	}

	public MappingException(String message) {
		super(message);
	}

	public MappingException(Throwable message) {
		super(message);
	}

	public MappingException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public MappingException(String message, Throwable throwable,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, throwable, enableSuppression, writableStackTrace);
	}
}